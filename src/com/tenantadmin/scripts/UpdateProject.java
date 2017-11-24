package com.tenantadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageProject;
import com.canvashomepage.scripts.BaseTest;

public class UpdateProject extends BaseTest
{
@Test
public void testUpdateProject()
{
	System.out.println("******************************UpdateProject******************************");
	Reporter.log("******************************UpdateProject******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.updateProject();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Project Updated']")).isDisplayed(), true);
	System.out.println("Project is updated successfully");
	Reporter.log("Project is updated successfully");
	System.out.println("******************************UpdateProject******************************");
	Reporter.log("******************************UpdateProject******************************");
}
}
