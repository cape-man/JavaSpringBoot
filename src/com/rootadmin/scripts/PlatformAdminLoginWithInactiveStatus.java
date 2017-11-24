package com.rootadmin.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class PlatformAdminLoginWithInactiveStatus extends BaseTest
{
@Test
public void testPlatformAdminLoginWithInactiveStatus()
{
	System.out.println("******************************PlatformAdminLoginWithInactiveStatus******************************");
	Reporter.log("******************************PlatformAdminLoginWithInactiveStatus******************************");
	HomePage homepage=new HomePage(driver);
	homepage.platformAdminLoginWithOldPassword();
	String ev="https://capedev.mindtree.com/#/login";
	String av=driver.getCurrentUrl();
	Assert.assertEquals(av, ev);
	System.out.println("Unable to login with Inactive status");
	Reporter.log("Unable to login with Inactive status");
	System.out.println("******************************PlatformAdminLoginWithInactiveStatus******************************");
	Reporter.log("******************************PlatformAdminLoginWithInactiveStatus******************************");
}
}
