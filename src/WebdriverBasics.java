import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver","C:\\SeleniumExtracts\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);

        if(title.equals("Google")){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test fail");
        }

        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
