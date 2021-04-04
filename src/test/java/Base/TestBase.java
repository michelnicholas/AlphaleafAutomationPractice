package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    // Resource: WebDriver Instance
    private static WebDriver driver;

    protected static WebDriver getDriver(){
        // Return the web Driver instance
        return driver;
    }

    // BeforeMethod
    @BeforeMethod
    protected void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // AfterMethod
    @AfterMethod
    public void cleanUpDriver(){
        if(driver!=null){
            driver.quit();
        }


    }




}
