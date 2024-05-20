package com.tutorialsNinja.Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialsNinja.Pages.AccountPage;
import com.tutorialsNinja.Pages.HomePage;
import com.tutorialsNinja.Pages.LoginPage;
import com.tutorialsNinja.driver_Factory.DriverFactory_Code;
import com.tutorialsninja.Utilities.Util;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    public WebDriver driver;

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        driver = DriverFactory_Code.getDriver();
        HomePage homepage = new HomePage(driver);
        homepage.clickOnMyAccount();
        LoginPage loginpage = new LoginPage(driver);
        loginpage = homepage.selectLoginOption();
       
    }

    @When("^User enters valid email to login(.+)$")
    public void user_enters_valid_email_to_login(String emailText) {
    	LoginPage loginpage = new LoginPage(driver);
    	loginpage.enterEmail(emailText);
    }

    @And("^User enters valid password to login(.+)$")
    public void User_enters_valid_password_to_login(String passwordText) {
    	LoginPage loginpage = new LoginPage(driver);
    	loginpage.enterPassword(passwordText);
    }

    @When("User enters invalid email to login")
    public void user_enters_invalid_email_to_login(){
    	LoginPage loginpage = new LoginPage(driver);
    	loginpage.enterEmail(Util.emailWithDateTimeStamp());
    }

    @Then("User gets warning message about credentials mismatch")
    public void user_gets_warning_message_about_credentials_mismatch(){
    	
    	LoginPage loginpage = new LoginPage(driver);
        Assert.assertTrue(loginpage.retrieveWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
      
    }

    @And("User enters invalid password to login{string}")
    public void user_enters_invalid_password(String invalidPasswordText){
    	LoginPage loginpage = new LoginPage(driver);
    	loginpage.enterPassword(invalidPasswordText);
        }


    @And("User clicks on Login button")
    public void user_clicks_on_login_button() {
    	LoginPage loginpage = new LoginPage(driver);
    	AccountPage accountpage = new AccountPage(driver);
    	accountpage = loginpage.clickOnLoginButton();
    }

    @Then("User is redirected to Account Page")
    public void user_is_redirected_to_account_page() {
    	AccountPage accountpage = new AccountPage(driver);
    	Assert.assertTrue(accountpage.validateDisplayStatusOfLogoutLink());
    	accountpage.clickOnLogoutLink();
    }


}

