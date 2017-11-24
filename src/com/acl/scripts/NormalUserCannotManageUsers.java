package com.acl.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.HomePage;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class NormalUserCannotManageUsers extends BaseTest
{
@Test
public void testUserCannotManageUsers()
{
	System.out.println("******************************UserCannotManageUsers******************************");
	Reporter.log("******************************UserCannotManageUsers******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("canvasuser", "Canvasuser12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'You are not authorized to perform this action')]")).isDisplayed(), true);
	System.out.println("******************************UserCannotManageUsers******************************");
	Reporter.log("******************************UserCannotManageUsers******************************");
}
}
