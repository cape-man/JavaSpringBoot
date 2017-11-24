package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminPlatformAdmin;
import com.canvashomepage.scripts.BaseTest;

public class UpdatePlatformAdmin extends BaseTest
{
@Test
public void testUpdatePlatformAdmin()
{
	System.out.println("******************************UpdatePlatformAdmin******************************");
	Reporter.log("******************************UpdatePlatformAdmin******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminPlatformAdmin rootadminplatformadmin=new RootAdminPlatformAdmin(driver);
	rootadminplatformadmin.editPlatformAdmin();
	Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'autorootupdated@mindtree.com')]")).isDisplayed(), true);
	System.out.println("updated platform admin successfully");
	Reporter.log("updated platform admin successfully");
	System.out.println("******************************UpdatePlatformAdmin******************************");
	Reporter.log("******************************UpdatePlatformAdmin******************************");
}
}
