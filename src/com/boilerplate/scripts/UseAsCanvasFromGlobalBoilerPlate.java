package com.boilerplate.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class UseAsCanvasFromGlobalBoilerPlate extends BaseTest
{
@Test
public void testUseAsCanvasFromGlobalBoilerPlate()
{
	System.out.println("******************************UseAsCanvasFromGlobalBoilerPlate******************************");
	Reporter.log("******************************UseAsCanvasFromGlobalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickGlobalBoilerplatelink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.UseAsCanvas();
	System.out.println("******************************UseAsCanvasFromGlobalBoilerPlate******************************");
	Reporter.log("******************************UseAsCanvasFromGlobalBoilerPlate******************************");
}
}
