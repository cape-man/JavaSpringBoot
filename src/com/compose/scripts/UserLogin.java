package com.compose.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class UserLogin extends BaseTest
{
@Test
public void testUserLogin()
{
	System.out.println("******************************UserLogin******************************");
	Reporter.log("******************************UserLogin******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	System.out.println("******************************UserLogin******************************");
	Reporter.log("******************************UserLogin******************************");
}
}
