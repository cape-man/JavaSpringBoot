package com.roles.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Analyze;
import com.POM.Common;
import com.POM.Execute;
import com.POM.HomePage;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class DesignerCannotAnalyze extends BaseTest
{
@Test
public void testDesignerCannotAnalyze()
{
	try
	{
	System.out.println("******************************DesignerCannotAnalyze******************************");
	Reporter.log("******************************DesignerCannotAnalyze******************************");
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
	Analyze analyze=new Analyze(driver);
	analyze.clickAnalyzeTab();
	Boolean av=driver.findElement(By.xpath("//div[text()='Default View']")).isDisplayed();
	Boolean ev=false;
	common.logOut();
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToDesigner();
	Assert.assertEquals(av, ev);
	System.out.println("******************************DesignerCannotAnalyze******************************");
	Reporter.log("******************************DesignerCannotAnalyze******************************");
	}
	catch(NoSuchElementException e)
	{
		Boolean av=false;
		Boolean ev=false;
		Common common=new Common(driver);
		common.logOut();
		HomePage homepage=new HomePage(driver);
		homepage.tenantadminLogin();
		TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
		tenantadminmanagetenant.convertUserToDesigner();
		Assert.assertEquals(av, ev);
		System.out.println("******************************DesignerCannotAnalyze******************************");
		Reporter.log("******************************DesignerCannotAnalyze******************************");
	}
}
}
