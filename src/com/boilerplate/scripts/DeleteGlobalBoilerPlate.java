package com.boilerplate.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DeleteGlobalBoilerPlate extends BaseTest
{
@Test
public void testDeleteGlobalBoilerPlate()
{
	System.out.println("******************************DeleteGlobalBoilerPlate******************************");
	Reporter.log("******************************DeleteGlobalBoilerPlate******************************");
	HomePage home=new HomePage(driver);
	home.rootadminLogin();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickGlobalBoilerplatelink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.clickDeleteBoilerplate();
	System.out.println("******************************DeleteGlobalBoilerPlate******************************");
	Reporter.log("******************************DeleteGlobalBoilerPlate******************************");
}
}
