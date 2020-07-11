import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session2 {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.gecko.driver","C:\\SeleniumExtracts\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.medidata.com/en/");

//        MouseHover==>
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Company"))).build().perform();

//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Customers")).click();
//        driver.findElement(By.xpath("//li/a[contains(text(),'Customers')]")).click();

//avoiding Thread.sleep by using Explicit wait
        clickOn(driver, driver.findElement(By.xpath("//li/a[contains(text(),'Customers')]")),5);



    }

    public static void clickOn(WebDriver driver, WebElement element, int timout){
        new WebDriverWait(driver,timout)
                .until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}
