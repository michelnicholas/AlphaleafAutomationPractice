package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class AboutPage {
    // Fields: Data or list of element locations
    private WebDriver driver;
    private By loc_about_trello_banner = By.xpath("//h1");
    private By loc_download_assets_bttn = By.xpath("(//a//span)[3]");
    private By loc_all_links = By.xpath("/html//div[@id='BXP-APP']/section[3]//ul");



    // Constructor
    public AboutPage(WebDriver inputDriver) {
        driver = inputDriver;
    }

    public boolean isPageDisplayed(){
        WebElement bannerText = driver.findElement(loc_about_trello_banner);
        return bannerText.isDisplayed();
    }

    public boolean isLinksClickableOnAboutPage() {
        List<WebElement> allLinkElements = driver.findElements(loc_all_links);
        for (int i = 0; i < allLinkElements.size(); i++) {
            WebElement links = allLinkElements.get(i);
            return links.isEnabled();
        }
        return false;


    }


    public void findingAllLinks(){
        List<WebElement> allLinksElements = driver.findElements(loc_all_links);
        for(int i = 0; i < allLinksElements.size();i++){
            WebElement element = allLinksElements.get(i);
            WebElement weblinks = element.findElement(By.tagName("a"));
            System.out.println("Links = " + weblinks);
        }
    }

}
