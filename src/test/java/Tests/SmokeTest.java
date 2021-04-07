package Tests;

import Base.TestBase;
import Pages.LoginPage;
import Pages.SignUpPage;
import Pages.TrelloHomePage;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {


   @Test
   public void verifyHomepageIsDisplayed(){
      TrelloHomePage homePage = new TrelloHomePage((getDriver()));
      homePage.open();
      boolean result = homePage.isPageVisible();
      Assert.assertTrue(result);


   }

   @Test
   public void verifyLoginPageIsDisplayed() throws InterruptedException {
      // Test Data / Constructors / Creating Objects
      LoginPage loginPage = new LoginPage(getDriver());
      TrelloHomePage homePage = new TrelloHomePage(getDriver());



      // Test Steps / Methods to test
      homePage.open();
      homePage.gotoToLoginPage();
      Thread.sleep(1000);
      boolean result = loginPage.isLoginPageVisible();


      // Assertions / results for test cases
      Assert.assertTrue(result);


   }

   @Test
   public void verifyingSignUpPageIsDisplayed() throws InterruptedException {
      // Test Data / Object / Constructors
      TrelloHomePage homePage = new TrelloHomePage(getDriver());
      SignUpPage signUpPage = new SignUpPage(getDriver());


      // Test Steps / Method to Test
      homePage.open();
      homePage.goToSignUpPage();
      Thread.sleep(2000);
      boolean result  = signUpPage.isSignUpPageVisible();


      // Assertions / Test results
      Assert.assertTrue(result);

   }




}
