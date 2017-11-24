package com.roles.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Common;
import com.POM.HomePage;
import com.POM.Provision;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class DesignerCannotProvision extends BaseTest
{
@Test
public void testDesignerCannotProvision()
{
	System.out.println("******************************DesignerCannotProvision******************************");
	Reporter.log("******************************DesignerCannotProvision******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.convertUserToDesigner();
	Common common=new Common(driver);
	common.logOut();
	homepage.validLogIn();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Provision provision=new Provision(driver);
	provision.clickProvisiontab();
	provision.clickProvisionButton();
	System.out.println(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed()+" Toaster is displayed");
	Reporter.log(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed()+" Toaster is displayed");
	Boolean av=driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed();
	Boolean ev=true;
	common.logOut();
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToDesigner();
	Assert.assertEquals(av, ev);
	System.out.println("Designer is unable to Provision");
	Reporter.log("Designer is unable to Provision");
	System.out.println("******************************DesignerCannotProvision******************************");
	Reporter.log("******************************DesignerCannotProvision******************************");
}
}
