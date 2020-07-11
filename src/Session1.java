import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Session1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\SeleniumExtracts\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://html.com/input-type-file/");

//fileupload popup
        driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Randeep\\Desktop\\ToDo.txt");


    }
}
