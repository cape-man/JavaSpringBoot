package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class UpdateTenantAdmin extends BaseTest
{
@Test
public void testUpdateTenantAdmin()
{
	System.out.println("******************************UpdateTenantAdmin******************************");
	Reporter.log("******************************UpdateTenantAdmin******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.updateTenantAdmin();
	Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'updatedemail@mindtree.com')]")).isDisplayed(), true);
	System.out.println("Tenant Admin is updated successfully");
	Reporter.log("Tenant Admin is updated successfully");
	System.out.println("******************************UpdateTenantAdmin******************************");
	Reporter.log("******************************UpdateTenantAdmin******************************");
}
}
