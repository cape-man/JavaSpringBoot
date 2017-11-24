package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class AddOwner1 extends BaseTest
{
@Test
public void testAddOwner() throws InterruptedException
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.xpath("//span[text()='Find owners']")).click();
	System.out.println("clicked on find owners");
	Reporter.log("clicked on find owners");
	driver.findElement(By.linkText("Add Owner")).click();
	System.out.println("clicked on add owner");
	Reporter.log("clicked on add owner");
	driver.findElement(By.id("firstName")).sendKeys("firstname");
	System.out.println("entered first name");
	Reporter.log("entered first name");
	driver.findElement(By.id("lastName")).sendKeys("lastname");
	System.out.println("entered last name");
	Reporter.log("entered last name");
	driver.findElement(By.id("address")).sendKeys("address");
	System.out.println("entered address");
	Reporter.log("entered address");
	driver.findElement(By.id("city")).sendKeys("city");
	System.out.println("entered city");
	Reporter.log("entered city");
	driver.findElement(By.id("telephone")).sendKeys("12345");
	System.out.println("entered telephone number");
	Reporter.log("entered telephone number");
	driver.findElement(By.xpath("//button[text()='Add Owner']")).click();
	System.out.println("clicked on add owner submit button");
	Reporter.log("clicked on add owner submit button");
	
String status = "N.A";
	if(driver.findElement(By.xpath("//b[text()='firstname lastname']")).isDisplayed())
	{
		status = "Pass";
		System.out.println("owner is added successfully");
		Reporter.log("owner is added successfully");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
		else
	{
		status = "Failed";
		System.out.println("owner is not added");
		Reporter.log("owner is not added");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object testDetails []	= new Object[]{"TD5_JavaPetApplication","Add Owner-1","User should be able to add owner",status,(new Date()).getTime(),"2","Add Owner Module-1","SIT","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("6",testDetails);
}
}
