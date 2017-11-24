package com.POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.library.Generic;

public class RootAdminManageTenant
{
@FindBy(xpath="//button[@class='btn btn-primary btn-md pull-right create-tanent-button']")
private WebElement createtenantbutton;

@FindBy(xpath="//input[@name='orgName']")
private WebElement entertenantname;

@FindBy(xpath="//textarea[@name='tenantDescription']")
private WebElement entertenantdescription;

@FindBy(xpath="//input[@name='userLimit']")
private WebElement userlimitfield;

@FindBy(xpath="//button[@ng-click='updateOrgCtrl.validateCreateOrganisationCanvas(createOrgForm.$valid)']")
private WebElement tenantsubmitbutton;

@FindBy(xpath="//button[@class='add-user-button  btn btn-primary btn-sm btn-search-size']")
private WebElement createuserbutton;

@FindBy(name="adminName")
private WebElement enteradminnamefield;

@FindBy(xpath="//input[@name='username']")
private WebElement useridfield;

@FindBy(name="email")
private WebElement enteremailfield;

@FindBy(xpath="(//input[@name='password'])[2]")
private WebElement passwordfield;

@FindBy(xpath="//input[@name='confirmPassword']")
private WebElement confirmpassword;

@FindBy(xpath="//span[text()='Designer']/..//input[@type='checkbox']")
private WebElement designercheckbox;

@FindBy(xpath="//span[text()='Engineer']/..//input[@type='checkbox']")
private WebElement engineercheckbox;

@FindBy(xpath="//span[text()='Manager']/..//input[@type='checkbox']")
private WebElement managercheckbox;

@FindBy(xpath="//span[text()='Admin']/..//input[@type='checkbox']")
private WebElement managetenantcheckbox;

@FindBy(xpath="//button[@ng-click='updateUserCtrl.validateCreateAdminForm(createAdminForm.$valid)']")
private WebElement createusersubmitbutton;

@FindBy(xpath="//span[text()='Component']")
private WebElement componenttab;

@FindBy(linkText="Test Component")
private WebElement testcomponentlink;

@FindBy(xpath="//button[@ng-click='componentsCtrl.editComponent(null)']")
private WebElement addcomponentbutton;

@FindBy(name="componentCode")
private WebElement componentcodefield;

@FindBy(name="componentName")
private WebElement componentnamefield;

@FindBy(xpath="//button[text()='Upload Image']")
private WebElement uploadimagebutton;

//@FindBy(xpath="//img[@ng-src='assets/images/left-menu/tenant.svg']/..")
@FindBy(xpath="//ul[@id='side-menu']/li[4]")
private WebElement Managelink;

@FindBy(xpath="//a[text()='Tenant']")
private WebElement tenantlink;

@FindBy(xpath="//span[text()='Automation Tenant']")
private WebElement tenant;

@FindBy(xpath="//span[text()='Automation Tenant Updated']")
private WebElement updatedtenant;

@FindBy(xpath="//span[text()='Automation Tenant']/../../../..//img[@class='pull-right edit-icon ng-scope']")
private WebElement automationtenanteditbutton;

@FindBy(xpath="//li[@class='project-container ng-scope disable-click']//img[@class='pull-right edit-icon ng-scope']")
private WebElement inactiveautomationtenanteditbutton;

@FindBy(xpath="//span[text()='Automation Tenant Updated']/../../../..//img[@class='pull-right edit-icon ng-scope']")
private WebElement automationtenantupdatededitbutton;

@FindBy(xpath="//input[@name='maxUserLimit']")
private WebElement numberofusersfield;

@FindBy(xpath="//button[@ng-click='updateOrgCtrl.validateUpdateOrganisationForm(updateOrgForm.$valid,updateOrgForm.tenantDescription.$dirty,updateOrgForm.maxUserLimit.$dirty)']")
private WebElement updatetenantbutton;

@FindBy(xpath="(//input[@name='orgName'])[2]")
private WebElement updatetenantnamefield;

@FindBy(xpath="//span[@class='bootstrap-switch-label']")
private WebElement statusbutton;

@FindBy(xpath="//button[@class='btn cstm-btn']")
private WebElement automationadmineditbutton;

@FindBy(xpath="//button[@class='btn btn-sm btn-primary pull-right m-t-n-xs add-software-btn cstm-action-button ladda-button']")
private WebElement updateuserbutton;


private WebDriver driver;

public RootAdminManageTenant(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public void createTenant()
{
	try
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
		System.out.println("clicked on Tenant link");
		Reporter.log("clicked on Tenant link");
		createtenantbutton.click();
		System.out.println("clicked on create tenant button");
		Reporter.log("clicked on create tenant button");
		entertenantname.sendKeys(Generic.readExcelData("TenantName", 0,0));
		System.out.println("Entered tenant name");
		Reporter.log("Entered tenant name");
		entertenantdescription.sendKeys(Generic.readExcelData("TenantName", 0,0));
		System.out.println("Entered tenant description");
		Reporter.log("Entered tenant description");
		userlimitfield.sendKeys("5");
		System.out.println("Entered User limit");
		Reporter.log("Entered User limit");
		tenantsubmitbutton.click();
		System.out.println("clicked on Add Tenant submit button");
		Reporter.log("clicked on Add Tenant submit button");
		System.out.println("step2: created new tenant: Automation Tenant");
		Reporter.log("step2: created new tenant: Automation Tenant");
		Thread.sleep(4000);
		}
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


public void createMultiTenants()
{
	for(int i=1;i<=50;i++)
	{
	try
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
		System.out.println("clicked on Tenant link");
		System.out.println(driver.getCurrentUrl());
		createtenantbutton.click();
		System.out.println("clicked on create tenant button");
		entertenantname.sendKeys("Tenant"+i);
		System.out.println("Entered tenant name");
		entertenantdescription.sendKeys("Tenant"+i);
		System.out.println("Entered tenant description");
		tenantsubmitbutton.click();
		System.out.println("clicked on Add Tenant submit button");
		System.out.println("step2: created new tenant: Automation Tenant"+i);
		Reporter.log("step2: created new tenant: Automation Tenant"+i);
		Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public void createTenantAdmin()
{
	try
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("clicked on Tenant link");
	Reporter.log("clicked on Tenant link");
	Thread.sleep(2000);
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	tenant.click();
	System.out.println("selected the tenant");
	Reporter.log("selected the tenant");
	createuserbutton.click();
	System.out.println("clicked on create user button");
	Reporter.log("clicked on create user button");
	enteradminnamefield.sendKeys(Generic.readExcelData("Credentials", 4, 0));
	System.out.println("entered name");
	Reporter.log("entered name");
	useridfield.sendKeys(Generic.readExcelData("Credentials", 4, 1));
	System.out.println("entered userid");
	Reporter.log("entered userid");
	enteremailfield.sendKeys(Generic.readExcelData("Credentials", 5, 0));
	System.out.println("entered email");
	Reporter.log("entered email");
	passwordfield.sendKeys(Generic.readExcelData("Credentials", 5, 1));
	System.out.println("entered password");
	Reporter.log("entered password");
	confirmpassword.sendKeys(Generic.readExcelData("Credentials", 5, 1));
	System.out.println("entered confirm password");
	Reporter.log("entered confirm password");
	designercheckbox.click();
	System.out.println("clicked on designer checkbox");
	Reporter.log("clicked on designer checkbox");
	engineercheckbox.click();
	System.out.println("clicked on engineer checkbox");
	Reporter.log("clicked on engineer checkbox");
	managercheckbox.click();
	System.out.println("clicked on manager checkbox");
	Reporter.log("clicked on manager checkbox");
	managetenantcheckbox.click();
	System.out.println("clicked on manage tenant user and project checkbox");
	Reporter.log("clicked on manage tenant user and project checkbox");
	createusersubmitbutton.click();
	System.out.println("clicked on create user submit button");
	Reporter.log("clicked on create user submit button");
	System.out.println("step3: created tenant admin with name Automation Admin");
	Reporter.log("step3: created tenant admin with name Automation Admin");
	Thread.sleep(4000);
	}
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickTenant()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("clicked on Tenant link");
	Reporter.log("clicked on Tenant link");
	Thread.sleep(2000);
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	tenant.click();
	System.out.println("selected the tenant");
	Reporter.log("selected the tenant");
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void updateTenant()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("clicked on Tenant link");
	Reporter.log("clicked on Tenant link");
	Thread.sleep(2000);
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	tenant.click();
	System.out.println("selected the tenant");
	Reporter.log("selected the tenant");
	automationtenanteditbutton.click();
	System.out.println("clicked on edit button");
	Reporter.log("clicked on edit button");
	Thread.sleep(2000);
	updatetenantnamefield.clear();
	updatetenantnamefield.sendKeys(Generic.readExcelData("TenantName", 0,0)+" Updated");
	System.out.println("updated tenant name");
	Reporter.log("updated tenant name");
	entertenantdescription.clear();
	entertenantdescription.sendKeys(Generic.readExcelData("TenantName", 0,0)+" Updated");
	System.out.println("Updated tenant description");
	Reporter.log("Updated tenant description");
	numberofusersfield.sendKeys("5");
	System.out.println("entered number of users");
	Reporter.log("entered number of users");
	updatetenantbutton.click();
	System.out.println("clicked on Update Tenant button");
	Reporter.log("Updated Tenant successfully");
	Thread.sleep(4000);
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	automationtenantupdatededitbutton.click();
	System.out.println("clicked on edit button");
	Reporter.log("clicked on edit button");
	Thread.sleep(2000);
	updatetenantnamefield.clear();
	updatetenantnamefield.sendKeys(Generic.readExcelData("TenantName", 0,0));
	updatetenantbutton.click();
	System.out.println("Reverted name back to Automation Tenant");
	Reporter.log("Reverted name back to Automation Tenant");
	Thread.sleep(2000);
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void makeTenantInactive()
{
	try {
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
		System.out.println("clicked on Tenant link");
		Reporter.log("clicked on Tenant link");
		Thread.sleep(2000);
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
		tenant.click();
		System.out.println("selected the tenant");
		Reporter.log("selected the tenant");
		automationtenanteditbutton.click();
		System.out.println("clicked on edit button");
		Reporter.log("clicked on edit button");
		Thread.sleep(2000);
		statusbutton.click();
		updatetenantbutton.click();
		System.out.println("Changed Tenant to Inactive status");
		Reporter.log("Changed Tenant to Inactive status");
		Thread.sleep(2000);
		javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
		Thread.sleep(2000);
		javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void makeTenantActive()
{
	try {
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
		System.out.println("clicked on Tenant link");
		Reporter.log("clicked on Tenant link");
		Thread.sleep(2000);
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
		inactiveautomationtenanteditbutton.click();
		System.out.println("clicked on edit button");
		Reporter.log("clicked on edit button");
		Thread.sleep(2000);
		statusbutton.click();
		updatetenantbutton.click();
		System.out.println("Changed Tenant to Active status");
		Reporter.log("Changed Tenant to Active status");
		Thread.sleep(2000);
		javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void updateTenantAdmin()
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("clicked on Tenant link");
	Reporter.log("clicked on Tenant link");
	Thread.sleep(2000);
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	tenant.click();
	System.out.println("selected the tenant");
	Reporter.log("selected the tenant");
	automationadmineditbutton.click();
	System.out.println("clicked on edit button for Tenant Admin");
	Reporter.log("clicked on edit button for Tenant Admin");
	enteradminnamefield.clear();
	enteradminnamefield.sendKeys(Generic.readExcelData("Credentials", 4, 0)+" Updated");
	System.out.println("Updated Tenant Admin name");
	Reporter.log("Updated Tenant Admin name");
	enteremailfield.clear();
	enteremailfield.sendKeys("updatedemail@mindtree.com");
	System.out.println("updated email for tenant admin");
	Reporter.log("updated email for tenant admin");
	updateuserbutton.click();
	Thread.sleep(4000);
	automationadmineditbutton.click();
	System.out.println("clicked on edit button for Tenant Admin");
	Reporter.log("clicked on edit button for Tenant Admin");
	enteradminnamefield.clear();
	enteradminnamefield.sendKeys(Generic.readExcelData("Credentials", 4, 0));
	updateuserbutton.click();
	System.out.println("Reverted Tenant Admin Name back to Automation Admin");
	Reporter.log("Reverted Tenant Admin Name back to Automation Admin");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickTenantAdminUpdateButton()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("clicked on Tenant link");
	Reporter.log("clicked on Tenant link");
	Thread.sleep(2000);
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	tenant.click();
	System.out.println("selected the tenant");
	Reporter.log("selected the tenant");
	automationadmineditbutton.click();
	System.out.println("clicked on edit button for Tenant Admin");
	Reporter.log("clicked on edit button for Tenant Admin");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void makeTenantAdminInactive()
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("clicked on Tenant link");
	Reporter.log("clicked on Tenant link");
	Thread.sleep(2000);
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	tenant.click();
	System.out.println("selected the tenant");
	Reporter.log("selected the tenant");
	automationadmineditbutton.click();
	System.out.println("clicked on edit button for Tenant Admin");
	Reporter.log("clicked on edit button for Tenant Admin");
	Thread.sleep(2000);
	statusbutton.click();
	updateuserbutton.click();
	System.out.println("Changed Tenant Admin to Inactive status");
	Reporter.log("Changed Tenant Admin to Inactive status");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void makeTenantAdminActive()
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("clicked on Tenant link");
	Reporter.log("clicked on Tenant link");
	Thread.sleep(2000);
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	Thread.sleep(2000);
	javascript.executeScript("angular.element('.folder-list')[0].scrollTop=angular.element('.folder-list')[0].scrollHeight");
	tenant.click();
	System.out.println("selected the tenant");
	Reporter.log("selected the tenant");
	automationadmineditbutton.click();
	System.out.println("clicked on edit button for Tenant Admin");
	Reporter.log("clicked on edit button for Tenant Admin");
	Thread.sleep(2000);
	statusbutton.click();
	updateuserbutton.click();
	System.out.println("Changed Tenant Admin to Active status");
	Reporter.log("Changed Tenant Admin to Inactive status");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
