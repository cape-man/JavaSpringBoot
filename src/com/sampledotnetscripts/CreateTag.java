package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class CreateTag extends BaseTest
{
@Test
public void testCreateTag()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	System.out.println("clicked on sync database");
	Reporter.log("clicked on sync database");
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Tags']")).click();
	System.out.println("clicked on tags");
	Reporter.log("clicked on tags");
	driver.findElement(By.linkText("Create New Tag")).click();
	System.out.println("clicked on create new tag");
	Reporter.log("clicked on create new tag");
	driver.findElement(By.id("Name")).sendKeys("Tag Name");
	System.out.println("entered name for tag");
	Reporter.log("entered name for tag");
	driver.findElement(By.id("Slug")).sendKeys("TagSlug");
	System.out.println("entered slug for tag");
	Reporter.log("entered slug for tag");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	System.out.println("clicked on create button");
	Reporter.log("clicked on create button");
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully created Tag.']")).isDisplayed())
	{
		status="Pass";
		System.out.println("Successfully created a new tag");
		Reporter.log("Successfully created a new tag");
	}
	else
	{
		status="Failed";
	}
	Object[] testdetails=new Object[]{"TD4_dotnetApplication","Create Tag","User should be able to create a tag",status,(new Date()).getTime(),"1","Create Tag Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("5", testdetails);
}
}
