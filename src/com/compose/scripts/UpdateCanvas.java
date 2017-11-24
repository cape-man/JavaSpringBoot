package com.compose.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class UpdateCanvas extends BaseTest
{
@Test
public void testUpdateCanvas()
{
	System.out.println("******************************UpdateCanvas******************************");
	Reporter.log("******************************UpdateCanvas******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	canvashomepage.clickProject();
	canvashomepage.clickEditButton("Automation Canvas");
	canvashomepage.editCanvas();
	Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Automation Canvas Updated']")).isDisplayed(), true);
	System.out.println("Canvas is updated successfully");
	Reporter.log("Canvas is updated successfully");
	System.out.println("******************************UpdateCanvas******************************");
	Reporter.log("******************************UpdateCanvas******************************");
}
}
