package com.tutorialsNinja.Step_Definitions;

import org.openqa.selenium.WebDriver;

import com.tutorialsNinja.Pages.AddToCart_ProductSelectPage;
import com.tutorialsNinja.Pages.HomePage;
import com.tutorialsNinja.driver_Factory.DriverFactory_Code;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {

	public WebDriver driver;
	
	@Given("User navigates to add to product page")
	public void User_navigates_to_add_to_product_page() {
		 driver = DriverFactory_Code.getDriver();
		 
	}
	@When("User clicks on add to cart button to navigate product page")
	public void  User_clicks_on_add_to_cart_button() {
		HomePage homepage = new HomePage(driver);
		homepage.ClickOnLaptopNotebook();
	}
	@And("User clicks on add to cart")
	public void  User_clicks_on_add_to_cart() {
		AddToCart_ProductSelectPage productselect = new AddToCart_ProductSelectPage(driver);
		productselect.ProductSelect();
	}
	
}
