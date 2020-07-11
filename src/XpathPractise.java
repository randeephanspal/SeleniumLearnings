import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathPractise {
    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.gecko.driver","C:\\SeleniumExtracts\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.medidata.com/en/");

//        driver.findElement(By.xpath("//a[contains(text(),'Podcasts & Videos')]")).click();

//        driver.findElement(By.xpath("//div[starts-with(text(),'Outsourcing Pharma')]")).click();

        driver.findElement(By.xpath("//i[@class='ds-ico ds-ico-burger-icon']")).click();


        driver.wait(100);



        driver.quit();

    }
}
