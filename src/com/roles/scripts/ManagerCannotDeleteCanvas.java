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

public class ManagerCannotDeleteCanvas extends BaseTest
{
@Test
public void testManagerCannotDeleteCanvas()
{
	System.out.println("******************************ManagerCannotDeleteCanvas******************************");
	Reporter.log("******************************ManagerCannotDeleteCanvas******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.convertUserToManager();
	Common common=new Common(driver);
	common.logOut();
	homepage.validLogIn();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.deleteCanvas();
	System.out.println(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed()+" Toaster is displayed");
	Boolean av=driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed();
	Boolean ev=true;
	common.logOut();
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToManager();
	Assert.assertEquals(av, ev);
	System.out.println("******************************ManagerCannotDeleteCanvas******************************");
	Reporter.log("******************************ManagerCannotDeleteCanvas******************************");
}
}
