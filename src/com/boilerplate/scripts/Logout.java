package com.boilerplate.scripts;

import org.testng.annotations.Test;

import com.POM.Common;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class Logout extends BaseTest
{
@Test
public void logOut()
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	Common common=new Common(driver);
	common.logOut();
}
}
