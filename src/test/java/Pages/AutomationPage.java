package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class AutomationPage {
    // Fields
    private WebDriver driver;
    private String url = "https://trello.com/butler-automation";
    private By loc_auto_banner = By.xpath("//h1");


    // platform related elem locations
    private By loc_butler_header_img = By.cssSelector("img[alt='butler-header']");
    private By loc_flowchart_img = By.cssSelector("img[alt='Illo-Flowchart']");
    private By loc_rule_board_img = By.cssSelector("img[alt='Spot-Illo Rules']");
    private By loc_move_forward_img = By.cssSelector("img[alt='spot-illo-butler-button']");
    private By loc_favorite_apps_img = By.cssSelector("img[alt='spot-illo-favorite apps']");
    private By loc_automation_tips_img = By.cssSelector("img[alt='Spot-illo Automation']");
    private By loc_all_images = By.xpath("//img");

    // platform related elem locations
    private By loc_try_butler_bttn = By.xpath("//a[@pathname='/signup']/span[@innertext='Try Butler']");
    private By loc_learn_more_link = By.xpath("(//a[@href='/pricing'])[1]");


    // Constructor
    public AutomationPage(WebDriver inputDriver){driver = inputDriver;}


    // Methods
    public void open(){
        driver.get(url);
    }

    public boolean isPageDisplayed(){
        WebElement bannerText = driver.findElement(loc_auto_banner);
        return bannerText.isDisplayed();
    }

    public boolean isImagesDisplayed(){
        List<WebElement> allImgElements = driver.findElements(loc_all_images);
        for (int i = 0; i < allImgElements.size();i++) {
            WebElement images = allImgElements.get(i);
            return images.isDisplayed();
        }
        return false;


    }

    public void allImagesOnAutomationPage(){
        List<WebElement> allImgElements = driver.findElements(loc_all_images);
        for (int i = 0; i < allImgElements.size();i++){
            WebElement images = allImgElements.get(i);
            String srcValues = images.getAttribute("src");
            System.out.println("Images = " + srcValues);
        }

    }

    public boolean isSupportedImageDisplayed() {
        WebElement automationTipsImg = driver.findElement(loc_automation_tips_img);
        WebElement butlerHeaderImg= driver.findElement(loc_butler_header_img);
        WebElement favoriteAppsImg  = driver.findElement(loc_favorite_apps_img);
        WebElement flowChartImg = driver.findElement(loc_flowchart_img);
        WebElement moveForwardImg = driver.findElement(loc_move_forward_img);

        return butlerHeaderImg.isDisplayed() &&
                automationTipsImg.isDisplayed() &&
                favoriteAppsImg.isDisplayed() &&
                flowChartImg.isDisplayed() &&
                moveForwardImg.isDisplayed();
    }






}

