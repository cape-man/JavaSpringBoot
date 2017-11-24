package com.tenantadmin.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageProject;
import com.canvashomepage.scripts.BaseTest;

public class ChangeProjectStatusToInactive extends BaseTest
{
@Test
public void testChangeProjectStatusToInactive()
{
	try
	{
	System.out.println("******************************ChangeProjectStatusToInactive******************************");
	Reporter.log("******************************ChangeProjectStatusToInactive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.makeProjectInactive();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Project']")).isDisplayed(), false);
	System.out.println("Project status is changed to Inactive successfully");
	Reporter.log("Project status is changed to Inactive successfully");
	System.out.println("******************************ChangeProjectStatusToInactive******************************");
	Reporter.log("******************************ChangeProjectStatusToInactive******************************");
	}
	catch(NoSuchElementException e)
	{
		System.out.println("Project status is changed to Inactive successfully");
		Reporter.log("Project status is changed to Inactive successfully");
		System.out.println("******************************ChangeProjectStatusToInactive******************************");
		Reporter.log("******************************ChangeProjectStatusToInactive******************************");
	}
}
}
