package com.boilerplate.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.Canvas;
import com.POM.TenantUserProject;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class UseAsCanvasFromLocalBoilerPlate extends BaseTest
{
@Test
public void testUseAsCanvasFromLocalBoilerPlate()
{
	System.out.println("******************************UseAsCanvasFromLocalBoilerPlate******************************");
	Reporter.log("******************************UseAsCanvasFromLocalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickLocalBoilerplateLink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.UseAsCanvas();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Use as Canvas']")).isDisplayed(), true);
	System.out.println("Canvas is created successfully from Local Boiler Plate");
	Reporter.log("Canvas is created successfully from Local Boiler Plate");
	System.out.println("******************************UseAsCanvasFromLocalBoilerPlate******************************");
	Reporter.log("******************************UseAsCanvasFromLocalBoilerPlate******************************");
}
}
