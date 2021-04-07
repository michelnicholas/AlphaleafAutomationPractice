package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HomePage {
    // ---- Fields: Data or list of element locations
    private WebDriver driver;
    private String url = "https://trello.com";
    private By loc_banner_text = By.xpath("//h1");
    private By loc_login_link = By.linkText("Log in");
    private By loc_signup_link = By.linkText("Sign up");
    private By loc_pricing_link = By.xpath("//a[text()='Pricing']");

    // --- Constructor
    public HomePage(WebDriver inputDriver){
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

    public void goToPricingPage(){
        WebElement pricingLinkElem = driver.findElement(loc_pricing_link);
        Actions actions = new Actions(driver);
        actions.moveToElement(pricingLinkElem).perform();
        pricingLinkElem.click();


    }
}
