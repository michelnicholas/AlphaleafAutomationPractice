package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class AboutPage {
    // Fields: Data or list of element locations
    private WebDriver driver;
    private By loc_about_trello_banner = By.xpath("//h1");

    // platform download related element locations
    private By loc_download_assets_bttn = By.xpath("(//a//span)[3]");

    // platform related elem locations
    private By loc_fog_creek_link = By.xpath("(//a[@href])[5]");
    private By loc_spark_captial_link = By.xpath("//a[@title='Spark Capital']");
    private By loc_index_ven_link = By.xpath("//a[@title='Index Ventures']");
    private By loc_atlassian_link = By.xpath("//a[@title='acquired by Atlassian']");
    private By loc_help_us_link = By.xpath("//a[contains(text(),'Help us')]");
    private By loc_all_links = By.xpath("//ul");


    // Constructor
    public AboutPage(WebDriver inputDriver) {
        driver = inputDriver;
    }

    public boolean isPageDisplayed() {
        WebElement bannerText = driver.findElement(loc_about_trello_banner);
        return bannerText.isDisplayed();
    }

    public boolean isLinksClickable() {
        List<WebElement> allLinks = driver.findElements(loc_all_links);
        boolean result = true;
        for (int i = 0; i < allLinks.size(); i++) {
            boolean isDisplayed = allLinks.get(i).isEnabled();
            result = result && isDisplayed;
        }
        return result;
    }


    // Methods
    public void isLinksOnPage() {
        List<WebElement> allLinkButtons = driver.findElements(loc_all_links);
        for (int i = 0; i < allLinkButtons.size(); i++) {
            WebElement links = allLinkButtons.get(i);
            String hrefValues = links.getAttribute("href");
            System.out.println("Links = " + hrefValues);
        }


    }

    public boolean isSupportedBrowserLinksDisplayed() {
        WebElement fogCreekLink = driver.findElement(loc_fog_creek_link);
        WebElement atlassianLink = driver.findElement(loc_atlassian_link);
        WebElement helpUsLink  = driver.findElement(loc_help_us_link);
        WebElement indexVenLink = driver.findElement(loc_index_ven_link);
        WebElement sparkCaptialLink = driver.findElement(loc_spark_captial_link);

        return helpUsLink.isDisplayed() &&
                atlassianLink.isDisplayed() &&
                indexVenLink.isDisplayed() &&
                fogCreekLink.isDisplayed() &&
                sparkCaptialLink.isDisplayed();
    }
}
