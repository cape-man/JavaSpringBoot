package com.tenantadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageProject;
import com.canvashomepage.scripts.BaseTest;

public class TagAdmintoProject extends BaseTest
{
@Test
public void testTagAdmintoProject()
{
	System.out.println("******************************TagAdmintoProject******************************");
	Reporter.log("******************************TagAdmintoProject******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.tagSelectedUsertoProject("autoadmin");
	Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'autoadmin')]")).isDisplayed(), true);
	System.out.println("Successfully tagged admin to project");
	Reporter.log("Successfully tagged admin to project");
	System.out.println("******************************TagAdmintoProject******************************");
	Reporter.log("******************************TagAdmintoProject******************************");
}
}
