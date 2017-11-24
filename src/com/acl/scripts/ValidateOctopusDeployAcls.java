package com.acl.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.Execute;
import com.POM.HomePage;
import com.POM.ManageUsers;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class ValidateOctopusDeployAcls extends BaseTest
{
@Test
public void testValidateOctopusDeployAcls()
{
	System.out.println("******************************ValidateOctopusDeployAcls******************************");
	Reporter.log("******************************ValidateOctopusDeployAcls******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("ACL");
	Execute execute=new Execute(driver);
	execute.clickExecuteTab();
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	ManageUsers manageusers=new ManageUsers(driver);
	manageusers.clickConfigureTentaclesAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickOctopusDeployHamburger();
	execute.clickConfigureTentaclesAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"CONFIGURE TENTACLES ACL IS VALIDATED\"");
		Reporter.log("\"CONFIGURE TENTACLES ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickConfigureTentaclesAcl();
	manageusers.clickCreateReleaseAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickOctopusDeployHamburger();
	execute.clickCreateReleaseAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"CREATE RELEASE ACL IS VALIDATED\"");
		Reporter.log("\"CREATE RELEASE ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	
	
	
	
	
	
	
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickCreateReleaseAcl();
	manageusers.clickDeployReleaseToAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickOctopusDeployHamburger();
	execute.clickDeployReleaseToDevAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"CREATE RELEASE TO DEV ACL IS VALIDATED\"");
		Reporter.log("\"CREATE RELEASE TO DEV ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	execute.clickDeployReleaseToSitAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"CREATE RELEASE TO SIT ACL IS VALIDATED\"");
		Reporter.log("\"CREATE RELEASE TO SIT ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	execute.clickDeployReleaseToProdAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"CREATE RELEASE TO PROD ACL IS VALIDATED\"");
		Reporter.log("\"CREATE RELEASE TO PROD ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	
	
	
	
	
	
	
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickDeployReleaseToAcl();
	manageusers.clickChooseLifecycleAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickOctopusDeployHamburger();
	execute.clickChooseLifecycleAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"CHOOSE LIFECYCLE ACL IS VALIDATED\"");
		Reporter.log("\"CHOOSE LIFECYCLE ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	
	
	
	
	
	
	
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickChooseLifecycleAcl();
	manageusers.clickRetryDeploymentAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickOctopusDeployHamburger();
	execute.clickRetryDeploymentAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"RETRY DEPLOYMENT ACL IS VALIDATED\"");
		Reporter.log("\"RETRY DEPLOYMENT ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	
	
	
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickRetryDeploymentAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	System.out.println("******************************ValidateOctopusDeployAcls******************************");
	Reporter.log("******************************ValidateOctopusDeployAcls******************************");
}
}
