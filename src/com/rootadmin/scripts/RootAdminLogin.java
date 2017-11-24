package com.rootadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class RootAdminLogin extends BaseTest
{
@Test
public void testRootAdminLogin()
{
	System.out.println("******************************RootAdminLogin******************************");
	Reporter.log("******************************RootAdminLogin******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	System.out.println("******************************RootAdminLogin******************************");
	Reporter.log("******************************RootAdminLogin******************************");
}
}
