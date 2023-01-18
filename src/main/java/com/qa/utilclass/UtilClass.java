package com.qa.utilclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class UtilClass extends Testbase{
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	

	public static void takeScreenshotMethod(String name)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File("C:\\Users\\HP\\eclipse-workspace\\Wingify\\Screenshot"+name + System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
