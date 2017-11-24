package com.roles.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.Common;
import com.POM.HomePage;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class EngineerCanViewLogs extends BaseTest
{
@Test
public void testEngineerCanViewLogs()
{
	System.out.println("******************************EngineerCanViewLogs******************************");
	Reporter.log("******************************EngineerCanViewLogs******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.convertUserToEngineer();
	Common common=new Common(driver);
	common.logOut();
	homepage.validLogIn();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickViewLogs();
	Boolean av=driver.findElement(By.xpath("//div[text()='LOGS']")).isDisplayed();
	System.out.println(driver.findElement(By.xpath("//div[text()='LOGS']")).isDisplayed()+",logs label name is displayed");
	Reporter.log(driver.findElement(By.xpath("//div[text()='LOGS']")).isDisplayed()+",logs label name is displayed");
	canvas.closeViewLogs();
	Boolean ev=true;
	common.logOut();
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToEngineer();
	Assert.assertEquals(av, ev);
	System.out.println("******************************EngineerCanViewLogs******************************");
	Reporter.log("******************************EngineerCanViewLogs******************************");
}
}
