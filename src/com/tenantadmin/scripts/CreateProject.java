package com.tenantadmin.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageProject;
import com.canvashomepage.scripts.BaseTest;

public class CreateProject extends BaseTest
{
@Test
public void testCreateProject()
{
	System.out.println("******************************CreateProject******************************");
	Reporter.log("******************************CreateProject******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.createProject();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Project']")).isDisplayed(), true);
	System.out.println("Project is created successfully");
	Reporter.log("Project is created successfully");
	System.out.println("******************************CreateProject******************************");
	Reporter.log("******************************CreateProject******************************");
}
}
