package com.roles.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Common;
import com.POM.Compose;
import com.POM.HomePage;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class ManagerCannotCompose extends BaseTest
{
@Test
public void testManagerCannotCompose()
{
	System.out.println("******************************ManagerCannotCompose******************************");
	Reporter.log("******************************ManagerCannotCompose******************************");
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
	Compose compose=new Compose(driver);
	compose.clickServer();
	driver.findElement(By.xpath("//div[contains(text(),'Application Server')]")).click();
	System.out.println(driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed()+" Toaster is displayed");
	Boolean av=driver.findElement(By.xpath("//div[text()='You are not authorized to perform this action']")).isDisplayed();
	Boolean ev=true;
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	common.logOut();
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToManager();
	Assert.assertEquals(av, ev);
	System.out.println("Manager is unable to Compose");
	Reporter.log("Manager is unable to Compose");
	System.out.println("******************************ManagerCannotCompose******************************");
	Reporter.log("******************************ManagerCannotCompose******************************");
}
}
