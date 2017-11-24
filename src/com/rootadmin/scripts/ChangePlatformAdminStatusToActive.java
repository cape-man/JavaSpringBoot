package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminPlatformAdmin;
import com.canvashomepage.scripts.BaseTest;

public class ChangePlatformAdminStatusToActive extends BaseTest
{
	@Test
	public void testChangePlatformAdminStatusToActive()
	{
		System.out.println("******************************ChangePlatformAdminStatusToActive******************************");
		Reporter.log("******************************ChangePlatformAdminStatusToActive******************************");
		HomePage homepage=new HomePage(driver);
		homepage.rootadminLogin();
		RootAdminPlatformAdmin rootadminplatformadmin=new RootAdminPlatformAdmin(driver);
		rootadminplatformadmin.makePlatformAdminActive();
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Active']")).isDisplayed(), true);
		System.out.println("successfully changed platform admin status to active");
		Reporter.log("successfully changed platform admin status to active");
		System.out.println("******************************ChangePlatformAdminStatusToActive******************************");
		Reporter.log("******************************ChangePlatformAdminStatusToActive******************************");
	}

}
