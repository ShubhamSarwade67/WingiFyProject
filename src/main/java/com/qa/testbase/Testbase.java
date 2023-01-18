package com.qa.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pagelayer.HomePage2;
import com.qa.pagelayer.Homepage;
import com.qa.utilclass.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
public static WebDriver driver;
public Homepage h;
public UtilClass util;
public HomePage2 h1;

	
	
	
	@Parameters("Browser")
	@BeforeMethod
	public void start(String br)
	{
		
		if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("please provide the correct browser name");
		}
		driver.get("https://sakshingp.github.io/assignment/login.html#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		h=new Homepage();
		util=new UtilClass();
		h1=new HomePage2();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
