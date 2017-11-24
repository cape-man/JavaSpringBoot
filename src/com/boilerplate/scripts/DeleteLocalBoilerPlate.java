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

public class DeleteLocalBoilerPlate extends BaseTest
{
@Test
public void testDeleteLocalBoilerPlate()
{
	System.out.println("******************************DeleteLocalBoilerPlate******************************");
	Reporter.log("******************************DeleteLocalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickLocalBoilerplateLink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.clickDeleteBoilerplate();
	Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Boilerplate deleted successfully.']")).isDisplayed(), true);
	System.out.println("Toaster is displayed.Local Boilerplate is deleted successfully");
	Reporter.log("Toaster is displayed.Local Boilerplate is deleted successfully");
	System.out.println("******************************DeleteLocalBoilerPlate******************************");
	Reporter.log("******************************DeleteLocalBoilerPlate******************************");
}
}
