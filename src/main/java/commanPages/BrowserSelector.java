package commanPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {

    LoadProperty loadProperty = new LoadProperty();
    String browserName = loadProperty.getProperty("browser");

    String URL  = loadProperty.getProperty("url");


    public void openSelectedBrowser(){
        // Open the local Browser
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else{
            System.out.println("Browser not matched");
    }

        // Maximise the screen
        driver.manage().window().maximize();
        // Delete all cookies
        driver.manage().deleteAllCookies();
        // page loading timeout
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
        // Applied implicit wait for driver object
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

        driver.get(URL);


    }
}
