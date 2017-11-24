package com.acl.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.HomePage;
import com.POM.ManageUsers;
import com.POM.TenantAdminManageProject;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class AssignUsertoCanvas extends BaseTest
{
@Test
public void testAssignUsertoCanvas()
{
	System.out.println("******************************AssignUsertoCanvas******************************");
	Reporter.log("******************************AssignUsertoCanvas******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.createSelectedUser("Canvas User", "canvasuser", "canvasuser@mindtree.com", "Canvasuser12");
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.tagSelectedUsertoProject("canvasuser");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	ManageUsers manageusers=new ManageUsers(driver);
	manageusers.assignUsertoCanvas();
	boolean av = driver.findElement(By.xpath("//div[text()='User added successfully']")).isDisplayed();
	manageusers.closeManageUsers();
	Assert.assertEquals(av, true);
	System.out.println("******************************AssignUsertoCanvas******************************");
	Reporter.log("******************************AssignUsertoCanvas******************************");
}
}

