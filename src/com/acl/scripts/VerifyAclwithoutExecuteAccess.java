package com.acl.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.Common;
import com.POM.HomePage;
import com.POM.ManageUsers;
import com.POM.RootAdminManageTenant;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class VerifyAclwithoutExecuteAccess extends BaseTest
{
@Test
public void testVerifyAclwithoutExecuteAccess()
{
	System.out.println("******************************VerifyAclwithoutExecuteAccess******************************");
	Reporter.log("******************************VerifyAclwithoutExecuteAccess******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.clickTenant();
	rootadminmanagetenant.clickTenantAdminUpdateButton();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.clickEngineerCheckBox();
	Common common=new Common(driver);
	common.logOut();
	homepage.tenantadminLogin();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("ACL");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	if(driver.findElement(By.xpath("(//span[text()='JENKINS 2.7']/../../..//span[text()='No Privileges Available'])[1]")).isDisplayed())
	{
		System.out.println("No Privileges Available is displayed for Jenkins 2.7");
		Reporter.log("No Privileges Available is displayed for Jenkins 2.7");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("(//span[text()='VSTS']/../../..//span[text()='No Privileges Available'])[1]")).isDisplayed())
	{
		System.out.println("No Privileges Available is displayed for VSTS");
		Reporter.log("No Privileges Available is displayed for VSTS");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("(//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='No Privileges Available'])[1]")).isDisplayed())
	{
		System.out.println("No Privileges Available is displayed for Octopus Deploy");
		Reporter.log("No Privileges Available is displayed for Octopus Deploy");
	}
	else
	{
		Assert.fail();
	}
	ManageUsers manageusers=new ManageUsers(driver);
	manageusers.closeManageUsers();
	common.logOut();
	homepage.rootadminLogin();
	rootadminmanagetenant.clickTenant();
	rootadminmanagetenant.clickTenantAdminUpdateButton();
	tenantadminmanagetenant.clickEngineerCheckBox();
	System.out.println("******************************VerifyAclwithoutExecuteAccess******************************");
	Reporter.log("******************************VerifyAclwithoutExecuteAccess******************************");
}
}
