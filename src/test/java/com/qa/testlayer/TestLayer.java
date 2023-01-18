package com.qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testbase.Testbase;

public class TestLayer extends Testbase {


	@Test(priority=0)
	
	public void ProvideUserName()
	{
		
		h.ClickOnUserName();
		
		
	}
	
	@Test(priority=1)
	public void ProvidePassword()
	{
		h.ClickOnUserName();
		
	}
	
	@Test(priority=2)
	
	public void ClickOnLogin() throws InterruptedException
	{
		h.ClickOnUserName();
		
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	
	public void ProvideAccount()
	{
		h1.ClickOnAccount();
	}
	
}
