package com.tenantadmin.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Common;
import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class TenantAdminLoginWhenTenantIsInactive extends BaseTest
{
@Test
public void testTenantAdminLoginWhenTenantInactive()
{
	System.out.println("******************************TenantAdminLoginWhenTenantIsInactive******************************");
	Reporter.log("******************************TenantAdminLoginWhenTenantIsInactive******************************");
	try
	{
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.makeTenantInactive();
	Common common=new Common(driver);
	common.logOut();
	homepage.tenantadminLogin();
	String ev="https://capedev.mindtree.com/#/login";
	String av=driver.getCurrentUrl();
	Assert.assertEquals(av, ev);
	System.out.println("Unable to login as Tenant Admin when Tenant is Inactive");
	Reporter.log("Unable to login as Tenant Admin when Tenant is Inactive");
	}
	catch(AssertionError e)
	{
		Assert.fail();
	}
	finally
	{
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.makeTenantActive();
	System.out.println("******************************TenantAdminLoginWhenTenantIsInactive******************************");
	Reporter.log("******************************TenantAdminLoginWhenTenantIsInactive******************************");
	}
}
}
