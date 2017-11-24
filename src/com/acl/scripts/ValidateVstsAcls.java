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

public class ValidateVstsAcls extends BaseTest
{
@Test
public void testValidateVstsAcls()
{
	System.out.println("******************************ValidateVstsAcls******************************");
	Reporter.log("******************************ValidateVstsAcls******************************");
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
	manageusers.clickCreateBuilDefinitiondAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickVstsHamburger();
	execute.clickCreateBuildDefinitionAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"CREATE BUILD DEFINITION ACL IS VALIDATED\"");
		Reporter.log("\"CREATE BUILD DEFINITION ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickCreateBuilDefinitiondAcl();
	manageusers.clickUpdateBuildDefinitionAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickVstsHamburger();
	execute.clickUpdateBuildDefinitionAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"UPDATE BUILD DEFINITION ACL IS VALIDATED\"");
		Reporter.log("\"UPDATE BUILD DEFINITION ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickUpdateBuildDefinitionAcl();
	manageusers.clickDeployToEnvironmentAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickVstsHamburger();
	execute.clickDeployToEnvironmentAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"DEPLOY TO ENVIRONMENT ACL IS VALIDATED\"");
		Reporter.log("\"DEPLOY TO ENVIRONMENT ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickDeployToEnvironmentAcl();
	manageusers.clickExecuteBuildAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickVstsHamburger();
	execute.clickExecuteBuildAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"EXECUTE BUILD ACL IS VALIDATED\"");
		Reporter.log("\"EXECUTE BUILD ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickExecuteBuildAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	System.out.println("******************************ValidateVstsAcls******************************");
	Reporter.log("******************************ValidateVstsAcls******************************");
}
}
