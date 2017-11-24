package com.roles.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.Canvas;
import com.POM.Common;
import com.POM.HomePage;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class EngineerCannotUpdateLocalBoilerPlate extends BaseTest
{
@Test
public void testEngineerCannotUpdateLocalBoilerPlate()
{
	System.out.println("******************************EngineerCannotUpdateLocalBoilerPlate******************************");
	Reporter.log("******************************EngineerCannotUpdateLocalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.convertUserToEngineer();
	Common common=new Common(driver);
	common.logOut();
	homepage.validLogIn();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickLocalBoilerplateLink();
	String av=driver.getCurrentUrl();
	String ev="https://capedev.mindtree.com/#/main/home";
	common.logOut();
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToEngineer();
	Assert.assertEquals(av, ev);
	System.out.println("******************************EngineerCannotUpdateLocalBoilerPlate******************************");
	Reporter.log("******************************EngineerCannotUpdateLocalBoilerPlate******************************");
}
}
