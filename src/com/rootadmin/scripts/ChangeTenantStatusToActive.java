package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class ChangeTenantStatusToActive extends BaseTest
{
@Test
public void testChangeTenantStatusToActive()
{
	System.out.println("******************************ChangeTenantStatusToActive******************************");
	Reporter.log("******************************ChangeTenantStatusToActive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.makeTenantActive();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Tenant']")).isDisplayed(), true);
	System.out.println("Changed Tenant status to Active successfully");
	Reporter.log("Chnaged Tenant status to Active successfully");
	System.out.println("******************************ChangeTenantStatusToActive******************************");
	Reporter.log("******************************ChangeTenantStatusToActive******************************");
}
}
