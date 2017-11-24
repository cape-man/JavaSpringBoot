package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class ChangeTenantAdminStatusToInactive extends BaseTest
{
	@Test
	public void ChangeTenantAdminStatusToInactive()
	{
		System.out.println("******************************ChangeTenantAdminStatusToInactive******************************");
		Reporter.log("******************************ChangeTenantAdminStatusToInactive******************************");
		HomePage homepage=new HomePage(driver);
		homepage.rootadminLogin();
		RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
		rootadminmanagetenant.makeTenantAdminInactive();
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'updatedemail@mindtree.com')]/..//span[text()='Inactive']")).isDisplayed(), true);
		System.out.println("Tenant Admin status is changed to Inactive successfully");
		Reporter.log("Tenant Admin status is changed to Inactive successfully");
		System.out.println("******************************ChangeTenantAdminStatusToInactive******************************");
		Reporter.log("******************************ChangeTenantAdminStatusToInactive******************************");
	}
}
