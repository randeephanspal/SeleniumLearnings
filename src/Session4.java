import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Session4 {
//bootstrap dropdown when Select class is not present
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\SeleniumExtracts\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

        driver.findElement(By.xpath("//div[@class='TquXA']")).click();

        List<WebElement> list = driver.findElements(By.xpath("//div[@role='presentation' and @class='OA0qNb ncFHed']//div[@class='MocG8c B9IrJb LMgvRb']//span[@class='vRMGwf oJeWuf']"));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getText());

            if(list.get(i).getText().contains("Deutsch")){
                list.get(i).click();
            }
        }


        driver.quit();

    }

}
