package com.tenantadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class TenantAdminLogin extends BaseTest
{
@Test
public void testTenantAdminLogin()
{
	System.out.println("******************************TenantAdminLogin******************************");
	Reporter.log("******************************TenantAdminLogin******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	System.out.println("******************************TenantAdminLogin******************************");
	Reporter.log("******************************TenantAdminLogin******************************");
}
}
