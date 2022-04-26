package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public void openBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //Get Chromedriver
        driver = new ChromeDriver();
        //get url
        driver.get(baseUrl);
        // Maximize window
        driver.manage().window().maximize();
        // Give implicit time to window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public  void closeBrowser(){
        driver.quit();
    }
}
