package com.rootadmin.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class PlatformAdminLoginWithOldPassword extends BaseTest
{
@Test
public void testPlatformAdminLoginWithOldPasword()
{
	System.out.println("******************************PlatformAdminLoginWithOldPassword******************************");
	Reporter.log("******************************PlatformAdminLoginWithOldPassword******************************");
	HomePage homepage=new HomePage(driver);
	homepage.platformAdminLoginWithOldPassword();
	String ev="https://capedev.mindtree.com/#/login";
	String av=driver.getCurrentUrl();
	Assert.assertEquals(av, ev);
	System.out.println("Unable to login with Old password");
	Reporter.log("Unable to login with Old password");
	System.out.println("******************************PlatformAdminLoginWithOldPassword******************************");
	Reporter.log("******************************PlatformAdminLoginWithOldPassword******************************");
}
}
