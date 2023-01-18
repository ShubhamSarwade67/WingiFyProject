package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class HomePage2 extends Testbase{
	
	public HomePage2()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//th[@id='amount']")
	public WebElement Account;
	
	public void ClickOnAccount()
	{
		Account.click();
	}

}
