package com.rootadmin.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class CreateTenant extends BaseTest
{
@Test
public void testCreateTenant()
{
	System.out.println("******************************CreateTenant******************************");
	Reporter.log("******************************CreateTenant******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.createTenant();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Tenant']")).isDisplayed(), true);
	System.out.println("Tenant is created successfully");
	Reporter.log("Tenant is created successfully");
	System.out.println("******************************CreateTenant******************************");
	Reporter.log("******************************CreateTenant******************************");
}
}

/*public class CreateTenant extends BaseTest
{
@Test
public void testCreateTenant()
{
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.createMultiTenants();
}
}*/



