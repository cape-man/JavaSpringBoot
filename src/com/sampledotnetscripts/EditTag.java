package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class EditTag extends BaseTest
{
@Test
public void testEditTag()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	System.out.println("clicked on sync database");
	Reporter.log("clicked on sync database");
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Tags']")).click();
	System.out.println("clicked on tags");
	Reporter.log("clicked on tags");
	driver.findElement(By.xpath("//td[contains(text(),'Tag Name')]/..//a[text()='Edit']")).click();
	System.out.println("clicked on edit link");
	Reporter.log("clicked on edit link");
	driver.findElement(By.id("Name")).clear();
	System.out.println("cleared tag name");
	Reporter.log("cleared tag name");
	driver.findElement(By.id("Name")).sendKeys("Tag Name Updated");
	System.out.println("updated the tag name");
	Reporter.log("updated the tag name");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	System.out.println("clicked on save button");
	Reporter.log("clicked on save button");
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully updated Tag.']")).isDisplayed())
	{
		status="Pass";
		System.out.println("Successfully updated the tag name");
		Reporter.log("Successfully updated the tag name");
	}
	else
	{
		status="Failed";
	}
	Object[] testdetails=new Object[]{"TD5_dotnetApplication","Edit Tag","User should be able to edit the tag",status,(new Date()).getTime(),"1","Edit Tag Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("6", testdetails);
}
}
