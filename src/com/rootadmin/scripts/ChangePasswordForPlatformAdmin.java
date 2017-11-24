package com.rootadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminPlatformAdmin;
import com.canvashomepage.scripts.BaseTest;

public class ChangePasswordForPlatformAdmin extends BaseTest
{
@Test
public void testChangePasswordForPlatformAdmin()
{
	System.out.println("******************************ChangePasswordForPlatformAdmin******************************");
	Reporter.log("******************************ChangePasswordForPlatformAdmin******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminPlatformAdmin rootadminplatformadmin=new RootAdminPlatformAdmin(driver);
	rootadminplatformadmin.changePasswordForPlatformAdmin();
	System.out.println("successfully updated password for platform admin");
	Reporter.log("successfully updated password for platform admin");
	System.out.println("******************************ChangePasswordForPlatformAdmin******************************");
	Reporter.log("******************************ChangePasswordForPlatformAdmin******************************");
}
}
