package com.tenantadmin.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Common;
import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class TenantAdminLoginWithInactiveStatus extends BaseTest
{
@Test
public void testTenantAdminLoginWithInactiveStatus()
{
	System.out.println("******************************TenantAdminLoginWithInactiveStatus******************************");
	Reporter.log("******************************TenantAdminLoginWithInactiveStatus******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	String ev="https://capedev.mindtree.com/#/login";
	String av=driver.getCurrentUrl();
	Assert.assertEquals(av, ev);
	System.out.println("Unable to login as Tenant Admin with Inactive status");
	Reporter.log("Unable to login as Tenant Admin with Inactive status");
	System.out.println("******************************TenantAdminLoginWithInactiveStatus******************************");
	Reporter.log("******************************TenantAdminLoginWithInactiveStatus******************************");
}
}
