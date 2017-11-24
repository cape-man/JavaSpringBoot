package com.boilerplate.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.Canvas;
import com.POM.TenantUserProject;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DeleteCanvasFromLocalBoilerPlate extends BaseTest
{
@Test
public void testDeleteCanvasFromLocalBoilerPlate()
{
	System.out.println("******************************DeleteCanvasFromLocalBoilerPlate******************************");
	Reporter.log("******************************DeleteCanvasFromLocalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	Canvas canvas=new Canvas(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Use as Canvas");
	canvas.clickDropdownButton();
	canvas.deleteCanvas();
	canvas.confirmDeleteCanvas();
	System.out.println("******************************DeleteCanvasFromLocalBoilerPlate******************************");
	Reporter.log("******************************DeleteCanvasFromLocalBoilerPlate******************************");
}
}
