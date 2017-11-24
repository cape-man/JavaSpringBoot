package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class UpdateTenant extends BaseTest
{
	@Test
public void testUpdateTenant()
{
	System.out.println("******************************UpdateTenant******************************");
	Reporter.log("******************************UpdateTenant******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.updateTenant();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Tenant Updated']")).isDisplayed(), true);
	System.out.println("Tenant is updated successfully");
	Reporter.log("Tenant is updated successfully");
	System.out.println("******************************UpdateTenant******************************");
	Reporter.log("******************************UpdateTenant******************************");
}
}
