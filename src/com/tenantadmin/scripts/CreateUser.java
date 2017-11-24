package com.tenantadmin.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class CreateUser extends BaseTest
{
@Test
public void testCreateUser()
{
	System.out.println("******************************CreateUser******************************");
	Reporter.log("******************************CreateUser******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.createUser();
	Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'autouser@mindtree.com')]")).isDisplayed(), true);
	System.out.println("User is created successfully");
	Reporter.log("User is created successfully");
	System.out.println("******************************CreateUser******************************");
	Reporter.log("******************************CreateUser******************************");
}
}


/*public class CreateUser extends BaseTest
{
@Test
public void testCreateUser()
{
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.createMultiUser();
}
}*/

