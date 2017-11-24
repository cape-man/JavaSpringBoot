package com.acl.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class UnassignedUserCannotAccessCanvas extends BaseTest
{
@Test
public void testUnassignedUserCannotAccessCanvas()
{
	System.out.println("******************************UnassignedUserCannotAccessCanvas******************************");
	Reporter.log("******************************UnassignedUserCannotAccessCanvas******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("canvasuser", "Canvasuser12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'have access for this canvas. Please contact admin.')]")).isDisplayed(), true);
	System.out.println("******************************UnassignedUserCannotAccessCanvas******************************");
	Reporter.log("******************************UnassignedUserCannotAccessCanvas******************************");
}
}
