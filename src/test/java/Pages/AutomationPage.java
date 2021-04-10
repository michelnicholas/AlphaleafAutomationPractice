package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AutomationPage {
    // Fields
    private WebDriver driver;
    private String url = "https://trello.com/butler-automation";
    private By loc_auto_banner = By.xpath("//h1");
    private By loc_try_butler_bttn = By.xpath("//a[@pathname='/signup']/span[@innertext='Try Butler']");
    private By loc_learn_more_link = By.xpath("(//a[@href='/pricing'])[1]");
    private By loc_all_images = By.xpath("//img");



    // Constructor

    public AutomationPage(WebDriver inputDriver){driver = inputDriver;}



    // Methods
    public void open(){
        driver.get(url);
    }

    public Boolean isPageDisplayed(){
        WebElement bannerText = driver.findElement(loc_auto_banner);
        return bannerText.isDisplayed();
    }

    public Boolean isImagesDisplayed(){
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






}

