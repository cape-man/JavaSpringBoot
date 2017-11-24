package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.library.Generic;

public class Canvas 
{
@FindBy(xpath="//button[@type='button']")
private WebElement dropdownbutton;

@FindBy(xpath="//button[@title='Save as Boilerplate']")
private WebElement saveasboilerplate;

@FindBy(id="boilerplateName")
private WebElement boilerplatename;

@FindBy(xpath="//textarea[@name='description']")
private WebElement boilerplatedescription;

@FindBy(xpath="(//input[@name='boilerplate-type'])[1]")
private WebElement localboilerplatetype;

@FindBy(xpath="//button[@type='submit']")
private WebElement saveboilerplatesubmitbutton;

@FindBy(xpath="(//input[@name='boilerplate-type'])[2]")
private WebElement globalboilerplatetype;

@FindBy(xpath="//button[@title='Delete Canvas']")
private WebElement deletebutton;

@FindBy(xpath="//button[@title='Activity']")
private WebElement viewactivitybutton;

@FindBy(xpath="//button[@ng-click='activityCtrl.closeAuditTrailView()']")
private WebElement viewactivityclosebutton;

@FindBy(xpath="//button[@title='Logs']")
private WebElement viewlogsbutton;

@FindBy(xpath="//button[@ng-click='logHistoryCtrl.closeLogHistoryView()']")
private WebElement viewlogclosedbutton;

@FindBy(xpath="//button[@title='Manage Users']")
private WebElement manageusersbutton;

@FindBy(xpath="//button[text()='Yes']")
private WebElement deleteconfirmbutton;

private WebDriver driver;

public Canvas(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public void clickDropdownButton()
{
	try 
	{
	dropdownbutton.click();
	System.out.println("clicked on dropdown button");
	Reporter.log("clicked on dropdown button");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickSaveasBoilerplate()
{
	try 
	{
	saveasboilerplate.click();
	System.out.println("clicked on Save as Boiler Plate link");
	Reporter.log("clicked on Save as Boiler Plate link");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void saveAsLocalBoilerplate()
{
	try
	{
	boilerplatename.sendKeys(Generic.readExcelData("BoilerPlateName",0,0));
	System.out.println("entered boiler plate name");
	Reporter.log("entered boiler plate name");
	boilerplatedescription.sendKeys(Generic.readExcelData("BoilerPlateName",0,0));
	System.out.println("entered boiler plate description");
	Reporter.log("entered boiler plate description");
	localboilerplatetype.click();
	System.out.println("selected local radio button");
	Reporter.log("selected local radio button");
	Thread.sleep(2000);
	saveboilerplatesubmitbutton.click();
	System.out.println("clicked on save button");
	Reporter.log("clicked on save button");
	System.out.println("Step4:Saved the canvas as Local Boiler Plate: "+Generic.readExcelData("BoilerPlateName",0,0));
	Reporter.log("Step4:Saved the canvas as Local Boiler Plate: "+Generic.readExcelData("BoilerPlateName",0,0));
	Thread.sleep(8000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public void saveAsGlobalBoilerplate()
{
	try
	{
	boilerplatename.sendKeys(Generic.readExcelData("BoilerPlateName",0,0));
	System.out.println("entered boiler plate name");
	Reporter.log("entered boiler plate name");
	boilerplatedescription.sendKeys(Generic.readExcelData("BoilerPlateName",0,0));
	System.out.println("entered boiler plate description");
	Reporter.log("entered boiler plate description");
	globalboilerplatetype.click();
	System.out.println("selected global radiobutton");
	Reporter.log("selected global radiobutton");
	Thread.sleep(2000);
	saveboilerplatesubmitbutton.click();
	System.out.println("clicked on submit button");
	Reporter.log("clicked on submit button");
	System.out.println("Step9:Saved the canvas as Global Boiler Plate: "+Generic.readExcelData("BoilerPlateName",2,0));
	Reporter.log("Step9:Saved the canvas as Global Boiler Plate: "+Generic.readExcelData("BoilerPlateName",2,0));
	Thread.sleep(4000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void deleteCanvas()
{
try
{
	deletebutton.click();
	System.out.println("clicked on delete canvas link");
	Reporter.log("clicked on delete canvas link");
	Thread.sleep(2000);
}
catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}


public void confirmDeleteCanvas()
{
try
{
	deleteconfirmbutton.click();
	System.out.println("clicked yes on delete canvas confirm pop up");
	Reporter.log("clicked yes on delete canvas confirm pop up");
	Thread.sleep(6000);
	System.out.println("Step5: Canvas deleted successfully");
	Reporter.log("Step5: Canvas deleted successfully");
}
catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}


public void clickViewActivity()
{
	try 
	{
	viewactivitybutton.click();
	System.out.println("clicked on view activity");
	Reporter.log("clicked on view activity");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void closeViewActivity()
{
	try 
	{
	viewactivityclosebutton.click();
	System.out.println("closed view activity");
	Reporter.log("closed view activity");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void clickViewLogs()
{
	try 
	{
	viewlogsbutton.click();
	System.out.println("clicked on view logs");
	Reporter.log("clicked on view logs");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void closeViewLogs()
{
	try 
	{
	viewlogclosedbutton.click();
	System.out.println("closed view logs");
	Reporter.log("closed view logs");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickManageUsers()
{
	try {
	manageusersbutton.click();
	System.out.println("clicked on manage users button");
	Reporter.log("clicked on manage users button");
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
