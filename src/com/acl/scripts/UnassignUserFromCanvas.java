package com.acl.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.HomePage;
import com.POM.ManageUsers;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class UnassignUserFromCanvas extends BaseTest
{
@Test
public void testUnassignUserFromCanvas()
{
	System.out.println("******************************UnassignUserFromCanvas******************************");
	Reporter.log("******************************UnassignUserFromCanvas******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	ManageUsers manageusers=new ManageUsers(driver);
	manageusers.unassignSelectedUserFromCanvas("Canvas User");
	boolean av=driver.findElement(By.xpath("//div[text()='User Deleted successfully']")).isDisplayed();
	manageusers.closeManageUsers();
	Assert.assertEquals(av, true);
	System.out.println("******************************UnassignUserFromCanvas******************************");
	Reporter.log("******************************UnassignUserFromCanvas******************************");
}
}
