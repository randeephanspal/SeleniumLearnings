import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.gecko.driver","C:\\SeleniumExtracts\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.medidata.com/en/");
        driver.manage().window().maximize();


//        id--works
        String text = driver.findElement(By.id("hp-announcement")).getText();
        System.out.println(text);

//className
//        driver.findElement(By.className("external")).click();


//        xpath
//        driver.findElement(By.xpath("//a[contains(text(),Contact)]")).click();

//        linkText--works
//        driver.findElement(By.linkText("Login")).click();
//        driver.findElement(By.id("session_username")).sendKeys("Ron");


//        partialLinkText  --works
//        driver.findElement(By.partialLinkText("Podcasts ")).click();

//        cssSelector
        System.out.println(driver.findElement(By.cssSelector("#hp-announcement")).getText());


//        driver.wait(1000);


        driver.quit();
    }
}
