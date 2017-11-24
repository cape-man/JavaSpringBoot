package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.library.Generic;

public class TenantAdminManageTenant
{
	//@FindBy(xpath="//img[@ng-src='assets/images/left-menu/tenant.svg']/..")
	@FindBy(xpath="//ul[@id='side-menu']/li[4]")
	private WebElement Managelink;

	@FindBy(xpath="//a[text()='Tenant']")
	private WebElement tenantlink;
	
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
	
	@FindBy(xpath="//button[@ng-click='updateUserCtrl.validateCreateAdminForm(createAdminForm.$valid)']")
	private WebElement createusersubmitbutton;
	
	@FindBy(xpath="(//td[contains(text(),'autouser')]/..//button[@class='btn cstm-btn'])[1]")
	private WebElement autousereditbutton;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement updateusersubmitbutton;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement deleteuserconfirmyesbutton;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement deleteuserconfirmokbutton;
	
	private WebDriver driver;
	
public TenantAdminManageTenant(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}


public void createUser()
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	Thread.sleep(2000);
	createuserbutton.click();
	System.out.println("clicked on create user button");
	Reporter.log("clicked on create user button");
	enteradminnamefield.sendKeys(Generic.readExcelData("Credentials", 6, 0));
	System.out.println("entered name");
	Reporter.log("entered name");
	useridfield.sendKeys(Generic.readExcelData("Credentials", 6, 1));
	System.out.println("entered userid");
	Reporter.log("entered userid");
	enteremailfield.sendKeys(Generic.readExcelData("Credentials", 7, 0));
	System.out.println("entered email");
	Reporter.log("entered email");
	passwordfield.sendKeys(Generic.readExcelData("Credentials", 7, 1));
	System.out.println("entered password");
	Reporter.log("entered password");
	confirmpassword.sendKeys(Generic.readExcelData("Credentials", 7, 1));
	System.out.println("entered confirm password");
	Reporter.log("entered confirm password");
	designercheckbox.click();
	System.out.println("clicked on Designer checkbox");
	Reporter.log("clicked on Designer checkbox");
	engineercheckbox.click();
	System.out.println("clicked on Engineer checkbox");
	Reporter.log("clicked on Engineer checkbox");
	managercheckbox.click();
	System.out.println("clicked on Manager checkbox");
	Reporter.log("clicked on Manager checkbox");
	createusersubmitbutton.click();
	System.out.println("clicked on create user submit button");
	Reporter.log("clicked on create user submit button");
	driver.navigate().refresh();
	System.out.println("step3: created tenant user with name Automation User");
	Reporter.log("step3: cretaed tenant user with name Automation User");
	Thread.sleep(4000);
	}
	catch (InterruptedException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void createSelectedUser(String username,String userid,String email,String password)
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	Thread.sleep(2000);
	createuserbutton.click();
	System.out.println("clicked on create user button");
	Reporter.log("clicked on create user button");
	enteradminnamefield.sendKeys(username);
	System.out.println("entered name");
	Reporter.log("entered name");
	useridfield.sendKeys(userid);
	System.out.println("entered userid");
	Reporter.log("entered userid");
	enteremailfield.sendKeys(email);
	System.out.println("entered email");
	Reporter.log("entered email");
	passwordfield.sendKeys(password);
	System.out.println("entered password");
	Reporter.log("entered password");
	confirmpassword.sendKeys(password);
	System.out.println("entered confirm password");
	Reporter.log("entered confirm password");
	designercheckbox.click();
	System.out.println("clicked on Designer checkbox");
	Reporter.log("clicked on Designer checkbox");
	engineercheckbox.click();
	System.out.println("clicked on Engineer checkbox");
	Reporter.log("clicked on Engineer checkbox");
	managercheckbox.click();
	System.out.println("clicked on Manager checkbox");
	Reporter.log("clicked on Manager checkbox");
	createusersubmitbutton.click();
	System.out.println("clicked on create user submit button");
	Reporter.log("clicked on create user submit button");
	driver.navigate().refresh();
	System.out.println("step3: created tenant user with name: "+username);
	Reporter.log("step3: cretaed tenant user with name: "+username);
	Thread.sleep(4000);
	}
	catch (InterruptedException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void createMultiUser()
{
	for(int i=1;i<=50;i++)
	{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	Thread.sleep(2000);
	createuserbutton.click();
	System.out.println("clicked on create user button");
	enteradminnamefield.sendKeys("User"+i);
	System.out.println("entered name");
	useridfield.sendKeys("User"+i);
	System.out.println("entered userid");
	enteremailfield.sendKeys("user"+i+"@user.com");
	System.out.println("entered email");
	passwordfield.sendKeys("User"+i);
	System.out.println("entered password");
	designercheckbox.click();
	System.out.println("clicked on Designer checkbox");
	Reporter.log("clicked on Designer checkbox");
	engineercheckbox.click();
	System.out.println("clicked on Engineer checkbox");
	Reporter.log("clicked on Engineer checkbox");
	managercheckbox.click();
	System.out.println("clicked on Manager checkbox");
	Reporter.log("clicked on Manager checkbox");
	createusersubmitbutton.click();
	System.out.println("clicked on create user submit button");
	driver.navigate().refresh();
	System.out.println("step3: created tenant user with name Automation User"+i);
	Reporter.log("step3: cretaed tenant user with name Automation User"+i);
	}
	catch (InterruptedException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}


public void convertUserToDesigner()
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("navigated to Tenant Admin Manage Tenant screen");
	Reporter.log("navigated to Tenant Admin Manage Tenant screen");
	Thread.sleep(2000);
	autousereditbutton.click();
	System.out.println("clicked on the edit button of the user");
	Reporter.log("clicked on the edit button of the user");
	Thread.sleep(2000);
	engineercheckbox.click();
	System.out.println("unchecked engineer checkbox");
	Reporter.log("unchecked engineer checkbox");
	managercheckbox.click();
	System.out.println("unchecked manager checkbox");
	Reporter.log("unchecked manager checkbox");
	updateusersubmitbutton.click();
	System.out.println("clicked on create user submit button");
	Reporter.log("clicked on create user submit button");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void convertUserToEngineer()
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("navigated to Tenant Admin Manage Tenant screen");
	Reporter.log("navigated to Tenant Admin Manage Tenant screen");
	Thread.sleep(2000);
	autousereditbutton.click();
	System.out.println("clicked on the edit button of the user");
	Reporter.log("clicked on the edit button of the user");
	Thread.sleep(2000);
	designercheckbox.click();
	System.out.println("unchecked designer checkbox");
	Reporter.log("unchecked designer checkbox");
	managercheckbox.click();
	System.out.println("unchecked manager checkbox");
	Reporter.log("unchecked manager checkbox");
	updateusersubmitbutton.click();
	System.out.println("clicked on create user submit button");
	Reporter.log("clicked on create user submit button");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void convertUserToManager()
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	System.out.println("navigated to Tenant Admin Manage Tenant screen");
	Reporter.log("navigated to Tenant Admin Manage Tenant screen");
	Thread.sleep(2000);
	autousereditbutton.click();
	System.out.println("clicked on the edit button of the user");
	Reporter.log("clicked on the edit button of the user");
	Thread.sleep(2000);
	designercheckbox.click();
	System.out.println("unchecked designer checkbox");
	Reporter.log("unchecked designer checkbox");
	engineercheckbox.click();
	System.out.println("unchecked engineer checkbox");
	Reporter.log("unchecked engineer checkbox");
	updateusersubmitbutton.click();
	System.out.println("clicked on create user submit button");
	Reporter.log("clicked on create user submit button");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void deleteSelectedUser(String user)
{
	try 
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(Managelink).moveToElement(tenantlink).click().build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[@title='"+user+"']/..//button[@ng-click='userlistCtrl.deleteUser(userinfo.username,userinfo.orgCode)']")).click();
	System.out.println("clicked on delete button");
	Reporter.log("clicked on delete button");
	deleteuserconfirmyesbutton.click();
	System.out.println("clicked on yes button in Confirm popup");
	Reporter.log("clicked on yes button in Confirm popup");
	deleteuserconfirmokbutton.click();
	System.out.println("clicked on OK button");
	Reporter.log("clicked on OK button");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickEngineerCheckBox()
{
	engineercheckbox.click();
	System.out.println("clicked on engineer checkbox");
	Reporter.log("clicked on engineer checkbox");
	updateusersubmitbutton.click();
	System.out.println("clicked on update user button");
	Reporter.log("clicked on update user button");
}

}