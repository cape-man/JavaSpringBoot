package com.tenantadmin.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class Check extends BaseTest
{
@Test
public void testCheck()
{
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	driver.findElement(By.xpath("//span[text()='Team']")).click();
	driver.findElement(By.linkText("Project")).click();
	driver.findElement(By.xpath("//span[text()='Automation Project05']")).click();
	driver.findElement(By.xpath("//button[@ng-click='projectuserlistCtrl.createUser()']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Add a User*']")).click();
}
}
