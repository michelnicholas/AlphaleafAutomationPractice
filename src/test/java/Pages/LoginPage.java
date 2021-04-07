package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    // --- Fields: Data or list of element locations
    private WebDriver driver;
    private By loc_page_banner = By.xpath("//h1");
    private By loc_email_input = By.id("user");
    private By loc_pass_input = By.id("password");
    private By loc_login_bttn = By.id("login");


    // --- Constructor
    public LoginPage(WebDriver inputDriver){
        driver = inputDriver;
    }


    // --- Methods: user's actions in this page
    public boolean isLoginPageVisible(){
        WebElement logInText = driver.findElement(loc_page_banner);
        return logInText.isDisplayed();
    }

    public void login(String email, String password){
        WebElement emailInput = driver.findElement(loc_email_input);
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(loc_pass_input);
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(loc_login_bttn);
        loginButton.click();
    }

}
