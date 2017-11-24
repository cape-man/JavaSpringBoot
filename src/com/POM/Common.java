package com.POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

public class Common 

{
@FindBy(xpath="//img[@class='img-circle profile-pic cstm-pos-profile-pic']")
//@FindBy(xpath="//span[@title='Automation User']")
private WebElement profileimage;

@FindBy(xpath="//a[@ng-click='mainCtrl.logOut()']")
private WebElement logoutlink;

private WebDriver driver;

public Common(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
	
public void logOut()
{
	try {
	if(driver.getCurrentUrl().contains("login"))
	{
		System.out.println("user is not logged in so cannot logout");
		Reporter.log("user is not logged in so cannot logout");
	}
	else
	{
		Thread.sleep(2000);
		/*EventFiringWebDriver efwd1=new EventFiringWebDriver(driver);
		try {
			FileUtils.copyFile(efwd1.getScreenshotAs(OutputType.FILE), new File("/opt/test-automation/screenshot1.png"));
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	profileimage.click();
	System.out.println("clicked on profile image");
	Reporter.log("clicked on profile image");
	Thread.sleep(2000);
	/*EventFiringWebDriver efwd=new EventFiringWebDriver(driver);
	try {
		FileUtils.copyFile(efwd.getScreenshotAs(OutputType.FILE), new File("/opt/test-automation/screenshot.png"));
	} catch (WebDriverException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("screenshot taken");
	Reporter.log("screenshot taken");*/
	logoutlink.click();
	System.out.println("clicked on logout link");
	Reporter.log("clicked on logout link");
	System.out.println("Successfully logged out from CAPE");
	Reporter.log("Successfully logged out from CAPE");
	}
} 
	catch (InterruptedException e) 
	{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
