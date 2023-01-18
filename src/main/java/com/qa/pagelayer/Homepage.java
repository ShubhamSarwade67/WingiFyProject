package com.qa.pagelayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class Homepage extends Testbase {
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='log-in']")
	private WebElement Login;
	
	public void ClickOnUserName()
	{
		username.sendKeys("ssarwade67@gmail.com");
	}
	
	public void ClickOnPassword()
	{
		password.sendKeys("Shubh@123");
	}
	
	public void ClickOnLogin()
	{
		Login.click();
	}
}
