package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PricingPage {
    //Fields
    private WebDriver driver;
    private By loc_trello_your_way_banner = By.xpath("//h1");
    private By loc_free_banner = By.xpath("(//h2)[1]");
    private By loc_business_class = By.xpath("(//h2)[2]");
    private By loc_enterprise_banner= By.xpath("(//h2)[3]");

    // Constructor
    public PricingPage(WebDriver inputDriver){
        driver = inputDriver;
    }


    // Methods
    public boolean trelloYourWayIsDisplayed(){
    WebElement trelloWayBanner = driver.findElement(loc_trello_your_way_banner);
    return trelloWayBanner.isDisplayed();
    }


    public boolean isFreeBannerDisplayed(){
        WebElement freeBanner = driver.findElement(loc_free_banner);
        return freeBanner.isDisplayed();

    }

    public boolean isBusinessClassDisplayed(){
        WebElement businessClassBanner = driver.findElement(loc_business_class);
        return  businessClassBanner.isDisplayed();

    }

    public boolean isEnterpriseDisplayed(){
        WebElement enterpriseBanner = driver.findElement(loc_enterprise_banner);
        return enterpriseBanner.isDisplayed();

    }
}
