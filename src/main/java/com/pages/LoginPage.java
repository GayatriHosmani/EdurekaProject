package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//1. By Locators:
	private By login= By.id("login2");
	private By loginusername=By.id("loginusername");
	private By loginpassword=By.id("loginpassword");
	private By loginbtn=By.xpath("//button[contains(text(),'Log in')]");
	private By welcomeuser=By.id("nameofuser");
	
	private By signup=By.id("signin2");
	private By signusername=By.id("sign-username");
	private By signpassword=By.id("sign-password");
	private By signinbtn=By.xpath("//button[contains(text(),'Sign')]");
	
	//2. Constructor of the page class:
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//3. page actions: features (behavior) of the page the form of methods:
	public String getTitleOfPage()
	{
		return driver.getTitle();
	}
	
	public boolean isSignUplinkExist()
	{
		return driver.findElement(signup).isDisplayed();
	}
	
	public boolean isLoginLinkExist()
	{
		return driver.findElement(login).isDisplayed();
	}
	
	public void clickOnLoginLink()
	{
		driver.findElement(login).click();
	}
	
	public void enterLoginUserName(String username)
	{
		driver.findElement(loginusername).sendKeys(username);
	}
	
	public void enterLoginPassword(String password)
	{
		driver.findElement(loginpassword).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginbtn).click();
	}
	
	public boolean isWelcomeUserDisplayed()
	{
		return driver.findElement(welcomeuser).isDisplayed();
	}
	
	public void clickOnSignupLink()
	{
		driver.findElement(signup).click();
	}
	
	public boolean isSignInUserNameExist()
	{
		return driver.findElement(signusername).isDisplayed();
	}
	
	public void enterSignUpUsername(String username)
	{
		driver.findElement(signusername).sendKeys(username);
	}
	
	public void enterSignUpPassword(String password)
	{
		driver.findElement(signpassword).sendKeys(password);
	}
	
	public void clickOnSignUpButton()
	{
		driver.findElement(signinbtn).click();
	}
	
	public boolean isAlertExist() 
	{
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		if(!alerttext.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
