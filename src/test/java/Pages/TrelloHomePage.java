package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrelloHomePage {
    // ---- Fields: Data or list of element locations
    private WebDriver driver;
    private String url = "https://trello.com";
    private By loc_banner_text = By.xpath("//h1");
    private By loc_login_link = By.linkText("Log in");
    private By loc_signup_link = By.linkText("Sign up");

    // --- Constructor
    public TrelloHomePage(WebDriver inputDriver){
        driver = inputDriver;
    }

    // ---- Methods : user's actions in this page
    public void open(){
        driver.get(url);
    }

    public boolean isPageVisible(){
        WebElement bannerText = driver.findElement(loc_banner_text);
        return bannerText.isDisplayed();
    }

    public void gotoToLoginPage(){
        WebElement loginLink = driver.findElement(loc_login_link);
        loginLink.click();
    }

    public void goToSignUpPage(){
        WebElement signUpLink = driver.findElement(loc_signup_link);
        signUpLink.click();
    }


}
