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

public class SaveasLocalBoilerPlate extends BaseTest
{
@Test
public void testSaveasLocalBoilerPlate()
{
	System.out.println("******************************SaveasLocalBoilerPlate******************************");
	Reporter.log("******************************SaveasLocalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickSaveasBoilerplate();
	canvas.saveAsLocalBoilerplate();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickLocalBoilerplateLink();
	Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Automation Boiler']")).isDisplayed(), true);
	System.out.println("******************************SaveasLocalBoilerPlate******************************");
	Reporter.log("******************************SaveasLocalBoilerPlate******************************");
}
}
