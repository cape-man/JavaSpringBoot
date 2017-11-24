package com.acl.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Compose;
import com.POM.HomePage;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class AssignedUserCanAccessCanvas extends BaseTest
{
@Test
public void testAssignedUserCanAccessCanvas() throws AWTException, InterruptedException
{
	System.out.println("******************************AssignedUserCanAccessCanvas******************************");
	Reporter.log("******************************AssignedUserCanAccessCanvas******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("canvasuser", "Canvasuser12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	/*Compose compose=new Compose(driver);
	compose.clickBuild();
	compose.dragJenkinsAndConnect(805,300);
	compose.clickDeploy();
	compose.dragOctopusDeployAndConnect();*/
	Assert.assertEquals(driver.findElement(By.xpath("//a[text()='COMPOSE']")).isDisplayed(), true);
	System.out.println("******************************AssignedUserCanAccessCanvas******************************");
	Reporter.log("******************************AssignedUserCanAccessCanvas******************************");
}
}
