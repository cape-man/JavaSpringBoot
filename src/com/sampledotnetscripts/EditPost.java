package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class EditPost extends BaseTest 
{
@Test
public void testEditPost()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	System.out.println("clicked on sync database");
	Reporter.log("clicked on sync database");
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Posts']")).click();
	System.out.println("clicked on posts");
	Reporter.log("clicked on posts");
	driver.findElement(By.xpath("//td[contains(text(),'Post Title')]/..//a[text()='Edit']")).click();
	System.out.println("clicked on edit link");
	Reporter.log("clicked on edit link");
	driver.findElement(By.id("Title")).clear();
	System.out.println("cleared the title");
	Reporter.log("cleared the title");
	driver.findElement(By.id("Title")).sendKeys("Post Title Updated");
	System.out.println("updated the title");
	Reporter.log("updated the title");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	System.out.println("clicked on save button");
	Reporter.log("clicked on save button");
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully updated Post.']")).isDisplayed())
	{
		status="Pass";
		System.out.println("Successfully updated the post");
		Reporter.log("Successfully updated the post");
	}
	else
	{
		status="Failed";
	}
	
	Object[] testdetails=new Object[]{"TD2_dotnetApplication","Edit Post","User should be able to edit the post",status,(new Date()).getTime(),"1","Edit Post Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("3", testdetails);
}
}
