package com.roles.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Common;
import com.POM.Execute;
import com.POM.HomePage;
import com.POM.Provision;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class DesignerCannotExecute extends BaseTest
{
@Test
public void testDesignerCannotExecute()
{
	Common common=new Common(driver);
	HomePage homepage=new HomePage(driver);
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	try
	{
	System.out.println("******************************DesignerCannotExecute******************************");
	Reporter.log("******************************DesignerCannotExecute******************************");
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToDesigner();
	common.logOut();
	homepage.validLogIn();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Execute execute=new Execute(driver);
	execute.clickExecuteTab();
	execute.clickJenkinsHamburger();
	System.out.println(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed()+" Toaster is displayed");
	Boolean av=driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed();
	Boolean ev=true;
	Assert.assertEquals(av, ev);
	}
	finally
	{
		common.logOut();
		homepage.tenantadminLogin();
		tenantadminmanagetenant.convertUserToDesigner();
		System.out.println("******************************DesignerCannotExecute******************************");
		Reporter.log("******************************DesignerCannotExecute******************************");
	}
}
}
