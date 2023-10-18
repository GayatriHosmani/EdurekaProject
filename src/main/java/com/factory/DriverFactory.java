package com.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	
	//public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
	
	/**
	 * This method is used to initiate the driver with proper browser driver
	 * @param browser
	 * @return driver object
	 */
	
	public WebDriver init_driver(String browser)
	{
		System.out.println("browser value is:"+browser);
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("please pass the correct browser value"+browser);
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().manage().deleteAllCookies();
		return getDriver();
	}
	
	public static WebDriver getDriver(){
		{
			return driver;
		}
	}

}
