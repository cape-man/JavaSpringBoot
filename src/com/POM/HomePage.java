package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.library.Generic;

public class HomePage
{

	@FindBy(name="cusername")
	private WebElement usernametextbox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordtextbox;
	
	@FindBy(xpath="//button[@class='block m-b login-button ng-isolate-scope ladda-button']")
	private WebElement loginbutton;
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void validLogIn()
	{
		try {
		usernametextbox.clear();
		usernametextbox.sendKeys(Generic.readExcelData("Credentials", 6, 1));
		System.out.println("entered username");
		Reporter.log("entered username");
		passwordtextbox.clear();
		passwordtextbox.sendKeys(Generic.readExcelData("Credentials", 7, 1));
		System.out.println("entered password");
		Reporter.log("entered password");
		loginbutton.click();
		System.out.println("clicked on login button");
		Reporter.log("Step1:Successfully logged in as tenant user");
		System.out.println("Step1:Successfully logged in as tenant user");
		Thread.sleep(3000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void userLogIn(String username, String password)
	{
		try {
		usernametextbox.clear();
		usernametextbox.sendKeys(username);
		System.out.println("entered username");
		Reporter.log("entered username");
		passwordtextbox.clear();
		passwordtextbox.sendKeys(password);
		System.out.println("entered password");
		Reporter.log("entered password");
		loginbutton.click();
		System.out.println("clicked on login button");
		Reporter.log("Step1:Successfully logged in as tenant user");
		System.out.println("Step1:Successfully logged in as tenant user");
		Thread.sleep(3000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void incorrectuserLogIn()
	{
		usernametextbox.sendKeys(Generic.readExcelData("Credentials", 1, 0));
		passwordtextbox.sendKeys(Generic.readExcelData("Credentials", 1, 1));
		loginbutton.click();
	}
	
	public void incorrectpasswordLogIn()
	{
		usernametextbox.sendKeys(Generic.readExcelData("Credentials", 2, 0));
		passwordtextbox.sendKeys(Generic.readExcelData("Credentials", 2, 1));
		loginbutton.click();
	}
	
	public void rootadminLogin()
	{
		if(driver.getCurrentUrl().contains("login"))
		{
			System.out.println("loginpage appeared");
			Reporter.log("loginpage appeared");
		}
		System.out.println(driver.getCurrentUrl());
		Reporter.log(driver.getCurrentUrl());
		usernametextbox.clear();
		usernametextbox.sendKeys(Generic.readExcelData("Credentials", 3, 0));
		System.out.println("entered username "+Generic.readExcelData("Credentials", 3, 0));
		Reporter.log("entered username "+Generic.readExcelData("Credentials", 3, 0));
		passwordtextbox.clear();
		passwordtextbox.sendKeys(Generic.readExcelData("Credentials", 3, 1));
		System.out.println("entered password "+Generic.readExcelData("Credentials", 3, 1));
		Reporter.log("entered password "+Generic.readExcelData("Credentials", 3, 1));
		Actions actions=new Actions(driver);
		actions.click(loginbutton).perform();
		System.out.println("clicked on login button");
		Reporter.log("Step1:Logged in as Root Admin");
		System.out.println("Step1:Logged in as Root Admin");
		Reporter.log("Step1:Logged in as Root Admin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.getCurrentUrl());
		Reporter.log(driver.getCurrentUrl());
	}
	
	public void tenantadminLogin()
	{
		try {
		usernametextbox.clear();
		usernametextbox.sendKeys(Generic.readExcelData("Credentials", 4, 1));
		passwordtextbox.clear();
		passwordtextbox.sendKeys(Generic.readExcelData("Credentials", 5, 1));
		loginbutton.click();
		Reporter.log("Step1:Logged in as Tenant Admin");
		System.out.println("Step1:Logged in as Tenant Admin");
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void platformAdminLoginWithOldPassword()
	{
		try {
		usernametextbox.sendKeys("autoroot");
		passwordtextbox.sendKeys("Autoroot12");
		loginbutton.click();
		Reporter.log("Step1:Logged in as Platform Admin");
		System.out.println("Step1:Logged in as Platform Admin");
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void platformAdminLoginWithNewPassword()
	{
		try {
		usernametextbox.clear();
		usernametextbox.sendKeys("autoroot");
		passwordtextbox.clear();
		passwordtextbox.sendKeys("Autoroot123");
		loginbutton.click();
		Reporter.log("Step1:Logged in as Platform Admin");
		System.out.println("Step1:Logged in as Platform Admin");
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

