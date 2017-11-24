package com.boilerplate.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.TenantUserProject;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class SavAsGlobalBoilerPlate extends BaseTest
{
@Test
public void testSaveAsGlobalBoilerPlate()
{
	System.out.println("******************************SavAsGlobalBoilerPlate******************************");
	Reporter.log("******************************SavAsGlobalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	Canvas canvas=new Canvas(driver);
	canvashomepage.clickProjectLink();
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	canvas.clickDropdownButton();
	canvas.clickSaveasBoilerplate();
	canvas.saveAsGlobalBoilerplate();
	Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Boilerplate Created Successfully.']")).isDisplayed(), true);
	System.out.println("Toaster displayed.Successfully saved canvas as Global Boilerplate");
	Reporter.log("Toaster displayed.Successfully saved canvas as Global Boilerplate");
	System.out.println("******************************SavAsGlobalBoilerPlate******************************");
	Reporter.log("******************************SavAsGlobalBoilerPlate******************************");
}
}
