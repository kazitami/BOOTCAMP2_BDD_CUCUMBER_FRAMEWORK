package com.tutorialsNinja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_ProductDetailsPage {

	public WebDriver driver;

	@FindBy(id = "button-cart")
	private WebElement addToCart;
	
	@FindBy(xpath = "//*[@id=\"cart\"]")
	private WebElement ItemcartButton;

//	@FindBy(xpath = "//i[@class=\"fa fa-shopping-cart\"]/following::strong[contains(text(),'View Cart')]")
//	private WebElement ViewCartButton;
//	


	@FindBy(xpath = "//div[@id='cart']")
	private WebElement cart;

	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")
	private WebElement ViewCartButton;


	public AddToCart_ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ProductAddedAndView() {
		addToCart.click();
		ItemcartButton.click();
		ViewCartButton.click();
	}

}
