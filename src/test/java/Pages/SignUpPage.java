package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    // --- Fields : Data or list of element locations
    private WebDriver driver;
    private By loc_signup_banner = By.xpath("//h1");
    private By loc_email_input = By.id("email");
    private By loc_continue_bttn = By.id("signup-submit");

    // --- Constructor
    public SignUpPage(WebDriver inputDriver){
        driver = inputDriver;
    }

    // --- Methods: user's actions in the page
    public boolean isSignUpPageVisible(){
        WebElement signupTextElement = driver.findElement(loc_signup_banner);
        return  signupTextElement.isDisplayed();
    }
}
