package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class ChangeTenantAdminStatusToActive extends BaseTest
{
@Test
public void testChangeTenantAdminStatusToActive()
{
	System.out.println("******************************ChangeTenantAdminStatusToActive******************************");
	Reporter.log("******************************ChangeTenantAdminStatusToActive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.makeTenantAdminActive();
	Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'updatedemail@mindtree.com')]/..//span[text()='Active']")).isDisplayed(), true);
	System.out.println("Tenant Admin status is changed to Active successfully");
	Reporter.log("Tenant Admin status is changed to Active successfully");
	System.out.println("******************************ChangeTenantAdminStatusToActive******************************");
	Reporter.log("******************************ChangeTenantAdminStatusToActive******************************");
}
}
