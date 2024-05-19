package com.tutorialsNinja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class productAddPageWithDetails {
	
	public WebDriver driver;
	
	@FindBy(css = "div.radio")
	private WebElement radioButtonSelectsmall;
	
	@FindBy(xpath = "//div[@class='checkbox'][1]")
	private WebElement selectCheckbox;
	
	@FindBy(css ="#input-option217")
	private WebElement selectOptiondropdown;
	
	@FindBy(css = "#input-option209")
	private WebElement textareaBox;
	
	@FindBy(css = "#button-upload222")
	private WebElement uploadButton;
	
	@FindBy(xpath = "//*[@id=\"product\"]/div[7]/div/span/button")
	private WebElement datePickerCalendar;
	
	public productAddPageWithDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUploadFileButton() {
		uploadButton.sendKeys(System.getProperty("user.dir")+"\\Pictures\\Screenshots\\Screenshot 2024-03-08 010016.png");
	}
	
	public void ClickOndatePickerCalendar() {
		Select select = new Select(datePickerCalendar);
		select.selectByVisibleText("2024-06-20");
	}

}
