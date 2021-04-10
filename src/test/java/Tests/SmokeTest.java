package Tests;

import Base.TestBase;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {


   @Test
   public void verifyHomepageIsDisplayed(){
      HomePage homePage = new HomePage((getDriver()));
      homePage.open();
      boolean result = homePage.isPageVisible();
      Assert.assertTrue(result);


   }

   @Test
   public void verifyLoginPageIsDisplayed() throws InterruptedException {
      // Test Data / Constructors / Creating Objects
      LoginPage loginPage = new LoginPage(getDriver());
      HomePage homePage = new HomePage(getDriver());



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
      HomePage homePage = new HomePage(getDriver());
      SignUpPage signUpPage = new SignUpPage(getDriver());


      // Test Steps / Method to Test
      homePage.open();
      homePage.goToSignUpPage();
      Thread.sleep(2000);
      boolean result  = signUpPage.isSignUpPageVisible();


      // Assertions / Test results
      Assert.assertTrue(result);

   }

   @Test
   public void isPricingPageElementsDisplayed() throws InterruptedException {
      // Test Data
      HomePage homePage = new HomePage(getDriver());
      PricingPage pricingPage = new PricingPage(getDriver());


      // Test Steps
      homePage.open();
      homePage.goToPricingPage();
      Thread.sleep(2000);
      boolean result = pricingPage.isFreeBannerDisplayed()
                     && pricingPage.isBusinessClassDisplayed()
                     && pricingPage.isEnterpriseDisplayed()
                     && pricingPage.trelloYourWayIsDisplayed();

      // Assertions
      Assert.assertTrue(result);

   }

   @Test
   public void isLinksOnAboutPageClickable(){
      // Test Data
      HomePage homePage = new HomePage(getDriver());
      AboutPage aboutPage = new AboutPage(getDriver());

      // Test Steps
      homePage.open();
      homePage.goToAboutPage();
      boolean result = aboutPage.isLinksClickableOnAboutPage();

      // Assertions
      Assert.assertTrue(result);






   }

   @Test
   public void allLinksOnAboutPage(){
      // Test Data
      HomePage homePage = new HomePage(getDriver());
      AboutPage aboutPage = new AboutPage(getDriver());

      // Test Steps
      homePage.open();
      homePage.goToAboutPage();
      aboutPage.findingAllLinks();

   }

   @Test
   public void isAutomationPageDisplayed(){
      // Test Data
      AutomationPage automationPage = new AutomationPage(getDriver());

      // Test Steps
      automationPage.open();
      boolean result = automationPage.isPageDisplayed();

      // Assertions
      Assert.assertTrue(result);

   }

   @Test
   public void isImagesDisplayedOnAutomationPage(){
      // Test Data
      AutomationPage automationPage = new AutomationPage(getDriver());

      // Test Steps
      automationPage.open();
      boolean result = automationPage.isImagesDisplayed();

      // Test Assertions
      Assert.assertTrue(result);


   }

   @Test
   public void getAllImagesOnAutomationPage(){
      AutomationPage automationPage = new AutomationPage(getDriver());
      automationPage.open();
      automationPage.allImagesOnAutomationPage();
   }




}
