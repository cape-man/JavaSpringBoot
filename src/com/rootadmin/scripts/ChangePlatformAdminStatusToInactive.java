package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminPlatformAdmin;
import com.canvashomepage.scripts.BaseTest;

public class ChangePlatformAdminStatusToInactive extends BaseTest
{
@Test
public void testChangePlatformAdminStatusToInactive()
{
	System.out.println("******************************ChangePlatformAdminStatusToInactive******************************");
	Reporter.log("******************************ChangePlatformAdminStatusToInactive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminPlatformAdmin rootadminplatformadmin=new RootAdminPlatformAdmin(driver);
	rootadminplatformadmin.makePlatformAdminInactive();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Inactive']")).isDisplayed(), true);
	System.out.println("successfully changed the status to inactive");
	Reporter.log("successfully changed the status to inactive");
	System.out.println("******************************ChangePlatformAdminStatusToInactive******************************");
	Reporter.log("******************************ChangePlatformAdminStatusToInactive******************************");
}
}
