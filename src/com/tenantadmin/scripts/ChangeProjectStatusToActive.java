package com.tenantadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageProject;
import com.canvashomepage.scripts.BaseTest;

public class ChangeProjectStatusToActive extends BaseTest 
{
@Test
public void testChangeProjectStatusToActive()
{
	System.out.println("******************************ChangeProjectStatusToActive******************************");
	Reporter.log("******************************ChangeProjectStatusToActive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.makeProjectActive();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Project']")).isDisplayed(), true);
	System.out.println("Successfully changed project status to Active");
	Reporter.log("Successfully changed project status to Active");
	System.out.println("******************************ChangeProjectStatusToActive******************************");
	Reporter.log("******************************ChangeProjectStatusToActive******************************");
}
}
