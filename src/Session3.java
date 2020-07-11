import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Session3 {
    public static void main(String[] args) throws InterruptedException{

//        doubleClick and rightClick()  --- mukesh
        System.setProperty("webdriver.gecko.driver","C:\\SeleniumExtracts\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

// Right click
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))).perform();

        driver.findElement(By.xpath("//li//span[contains(text(),'Copy')]")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

//        driver.quit();


//        Double click the block
        driver.navigate().to("https://api.jquery.com/dblclick/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(By.xpath("//span[contains(text(),'Double click the block')]//parent::body/div"))).build().perform();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
//        driver.quit();

    }
}
