package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class ChangeTenantStatusToInactive extends BaseTest
{
@Test
public void testChangeTenantStatusToInactive()
{
	try
	{
	System.out.println("******************************ChangeTenantStatusToInactive******************************");
	Reporter.log("******************************ChangeTenantStatusToInactive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.makeTenantInactive();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Tenant']")).isDisplayed(), false);
	System.out.println("Changed Tenant status to Inactive successfully");
	Reporter.log("Chnaged Tenant status to Inactive successfully");
	System.out.println("******************************ChangeTenantStatusToInactive******************************");
	Reporter.log("******************************ChangeTenantStatusToInactive******************************");
	}
	catch(NoSuchElementException e)
	{
		System.out.println("Chnaged Tenant status to Inactive successfully");
		Reporter.log("Chnaged Tenant status to Inactive successfully");
		System.out.println("******************************ChangeTenantStatusToInactive******************************");
		Reporter.log("******************************ChangeTenantStatusToInactive******************************");
	}
}
}
