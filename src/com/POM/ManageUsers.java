package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ManageUsers 
{
	
@FindBy(xpath="//input[@placeholder='Add user']")
private WebElement addusertocanvasfield;

@FindBy(xpath="//button[@type='submit']")
private WebElement saveboilerplatesubmitbutton;

@FindBy(xpath="//button[text()='Yes']")
private WebElement deleteconfirmbutton;

@FindBy(xpath="//span[text()='JENKINS 2.7']/../../..//span[text()='Create Job']")
private WebElement createjobacl;

@FindBy(xpath="//span[text()='JENKINS 2.7']/../../..//span[text()='Build Job']")
private WebElement buildjobacl;

@FindBy(xpath="//span[text()='JENKINS 2.7']/../../..//span[text()='Tag a Build']")
private WebElement tagabuildacl;

@FindBy(xpath="//span[text()='JENKINS 2.7']/../../..//span[text()='Update Job']")
private WebElement updatejobacl;

@FindBy(xpath="//span[text()='JENKINS 2.7']/../../..//span[text()='Delete Job']")
private WebElement deletejobacl;

@FindBy(xpath="//span[text()='VSTS']/../../..//span[text()='Create Build Definition']")
private WebElement createbuilddefinitionacl;

@FindBy(xpath="//span[text()='VSTS']/../../..//span[text()='Update Build Definition']")
private WebElement updatebuilddefinitionacl;

@FindBy(xpath="//span[text()='VSTS']/../../..//span[text()='Deploy To Environment']")
private WebElement deploytoenvironmentacl;

@FindBy(xpath="//span[text()='VSTS']/../../..//span[text()='Execute Build']")
private WebElement executebuildacl;

@FindBy(xpath="//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Configure Tentacles']")
private WebElement configuretentaclesacl;

@FindBy(xpath="//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Create Release']")
private WebElement createreleaseacl;

@FindBy(xpath="//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Deploy Release to']")
private WebElement deployreleasetoacl;

@FindBy(xpath="//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Choose Lifecycle']")
private WebElement chooselifecycleacl;

@FindBy(xpath="//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Retry Deployment']")
private WebElement retrydeploymentacl;

@FindBy(xpath="//span[text()='Update Permission']")
private WebElement updatepermissionbutton;

@FindBy(xpath="//img[@class='component-cancel-icon']")
private WebElement manageusersclosebutton;
	
private WebDriver driver;
	
public ManageUsers(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}


public void assignUsertoCanvas()
{
	try 
	{
	addusertocanvasfield.click();
	Thread.sleep(2000);
	Actions actions=new Actions(driver);
	actions.click(driver.findElement(By.xpath("//span[text()='canvasuser']"))).build().perform();
	System.out.println("entered username");
	Reporter.log("entered username");
	saveboilerplatesubmitbutton.click();
	System.out.println("clicked on assign button");
	Reporter.log("clicked on assign button");
	Thread.sleep(2000);
	deleteconfirmbutton.click();
	System.out.println("clicked on yes button");
	Reporter.log("clicked on yes button");
	Thread.sleep(4000);
	}
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void unassignSelectedUserFromCanvas(String username)
{
	try 
	{
	driver.findElement(By.xpath("//div[contains(text(),'"+username+"')]//div[text()='Unassign']")).click();
	System.out.println("clicked on unassign button");
	Reporter.log("clicked on unassign button");
	Thread.sleep(2000);
	deleteconfirmbutton.click();
	System.out.println("clicked on yes button in confirm popup");
	Reporter.log("clicked on yes button in confirm popup");
	Thread.sleep(4000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickCreateJobAcl()
{
	createjobacl.click();
	System.out.println("clicked on create job acl");
	Reporter.log("clicked on create job acl");
}

public void clickBuildJobAcl()
{
	buildjobacl.click();
	System.out.println("clicked on build job acl");
	Reporter.log("clicked on build job acl");
}

public void clickTagaBuildAcl()
{
	tagabuildacl.click();
	System.out.println("clicked on tag a build acl");
	Reporter.log("clicked on tag a build acl");
}

public void clickUpdateJobAcl()
{
	updatejobacl.click();
	System.out.println("clicked on update pipeline acl");
	Reporter.log("clicked on update pipeline acl");
}

public void clickDeleteJobAcl()
{
	deletejobacl.click();
	System.out.println("clicked on delete job acl");
	Reporter.log("clicked on delete job acl");
}

public void clickCreateBuilDefinitiondAcl()
{
	createbuilddefinitionacl.click();
	System.out.println("clicked on create build definition acl");
	Reporter.log("clicked on create build definition acl");
}

public void clickUpdateBuildDefinitionAcl()
{
	updatebuilddefinitionacl.click();
	System.out.println("clicked on update build definition acl");
	Reporter.log("clicked on update build definition acl");
}

public void clickDeployToEnvironmentAcl()
{
	deploytoenvironmentacl.click();
	System.out.println("clicked on deploy to environment acl");
	Reporter.log("clicked on update build definition acl");
}

public void clickExecuteBuildAcl()
{
	executebuildacl.click();
	System.out.println("clicked on execute build acl");
	Reporter.log("clicked on execute build acl");
}

public void clickConfigureTentaclesAcl()
{
	configuretentaclesacl.click();
	System.out.println("clicked on configure tentacles acl");
	Reporter.log("clicked on configure tentacles acl");
}

public void clickCreateReleaseAcl()
{
	createreleaseacl.click();
	System.out.println("clicked on create release acl");
	Reporter.log("clicked on create release acl");
}

public void clickDeployReleaseToAcl()
{
	deployreleasetoacl.click();
	System.out.println("clicked on deploy release to acl");
	Reporter.log("clicked on deploy release to acl");
}

public void clickChooseLifecycleAcl()
{
	chooselifecycleacl.click();
	System.out.println("clicked on choose lifecycle acl");
	Reporter.log("clicked on choose lifecycle acl");
}

public void clickRetryDeploymentAcl()
{
	retrydeploymentacl.click();
	System.out.println("clicked on retry deployment acl");
	Reporter.log("clicked on retry deployment acl");
}

public void clickUpdatePermissionButton()
{
	try {
	updatepermissionbutton.click();
	System.out.println("clicked on update permission button");
	Reporter.log("clicked on update permission button");
	Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void closeManageUsers()
{
	try {
		Thread.sleep(2000);
	manageusersclosebutton.click();
	System.out.println("clicked on manage users close button");
	Reporter.log("clicked on manage users close button");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
