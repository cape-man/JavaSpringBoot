package com.rootadmin.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class PlatformAdminLoginWithNewPassword extends BaseTest
{
@Test
public void testPlatformAdminLoginWithNewPassword()
{
	System.out.println("******************************PlatformAdminLoginWithNewPassword******************************");
	Reporter.log("******************************PlatformAdminLoginWithNewPassword******************************");
	HomePage homepage=new HomePage(driver);
	homepage.platformAdminLoginWithNewPassword();
	String ev="https://capedev.mindtree.com/#/main/home";
	String av=driver.getCurrentUrl();
	Assert.assertEquals(av, ev);
	System.out.println("******************************PlatformAdminLoginWithNewPassword******************************");
	Reporter.log("******************************PlatformAdminLoginWithNewPassword******************************");
}
}
