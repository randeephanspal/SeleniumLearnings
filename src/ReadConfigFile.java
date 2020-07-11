import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

//WindowHandles, ReadProperties file
public class ReadConfigFile {
    static WebDriver driver;
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

        Properties pro = new Properties();
        FileInputStream fin = new FileInputStream("C:\\Users\\Randeep\\IdeaProjects\\SeleniumBasics\\src\\config.properties");
        pro.load(fin);

        String browserName = pro.getProperty("browser");
        if(browserName.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver","C:\\SeleniumExtracts\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(pro.getProperty("url"));


        driver.findElement(By.xpath(pro.getProperty("HomeLogin"))).click();
        Thread.sleep(1000);
        Set<String> handler = driver.getWindowHandles();
        Iterator<String> itr = handler.iterator();

        String parentWindowId = itr.next();
        String childWindowId = itr.next();

        driver.switchTo().window(childWindowId);
        System.out.println(driver.getTitle());

        driver.findElement(By.id(pro.getProperty("uname"))).sendKeys(pro.getProperty("username"));
        driver.findElement(By.id(pro.getProperty("pwd"))).sendKeys(pro.getProperty("password"));
        Thread.sleep(2000);
        driver.quit();

    }
}
