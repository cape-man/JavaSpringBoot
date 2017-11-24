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

public class ValidateJenkinsAcls extends BaseTest
{
@Test
public void testValidateJenkinsAcls()
{
	System.out.println("******************************ValidateJenkinsAcls******************************");
	Reporter.log("******************************ValidateJenkinsAcls******************************");
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
	manageusers.clickCreateJobAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickJenkinsHamburger();
	execute.clickCreateJobAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"CREATE JOB ACL IS VALIDATED\"");
		Reporter.log("\"CREATE JOB ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickCreateJobAcl();
	manageusers.clickBuildJobAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickJenkinsHamburger();
	execute.clickBuildJobAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"BUILD JOB ACL IS VALIDATED\"");
		Reporter.log("\"BUILD JOB ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickBuildJobAcl();
	manageusers.clickTagaBuildAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickJenkinsHamburger();
	execute.clickTagaBuildAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"TAG A BUILD ACL IS VALIDATED\"");
		Reporter.log("\"TAG A BUILD ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickTagaBuildAcl();
	manageusers.clickUpdateJobAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickJenkinsHamburger();
	execute.clickUpdateJobAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"UPDATE JOB ACL IS VALIDATED\"");
		Reporter.log("\"UPDATE JOB ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickUpdateJobAcl();
	manageusers.clickDeleteJobAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	execute.clickJenkinsHamburger();
	execute.clickDeletJobAction();
	if(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed())
	{
		System.out.println("\"DELETE JOB ACL IS VALIDATED\"");
		Reporter.log("\"DELETE JOB ACL IS VALIDATED\"");
	}
	else
	{
		Assert.fail();
	}
	driver.navigate().refresh();
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	manageusers.clickDeleteJobAcl();
	manageusers.clickUpdatePermissionButton();
	manageusers.closeManageUsers();
	System.out.println("******************************ValidateJenkinsAcls******************************");
	Reporter.log("******************************ValidateJenkinsAcls******************************");
}
}
