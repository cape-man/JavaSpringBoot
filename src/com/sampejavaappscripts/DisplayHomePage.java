package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayHomePage extends BaseTest
{
	String status="N.A";
	long starttime = (new Date()).getTime();
@Test
public void testDisplayHomePage()
{
	try
	{
	driver.findElement(By.xpath("//span[text()='Home']")).click();
	System.out.println("clicked on home page link");
	Reporter.log("clicked on home page link");
	if(driver.findElement(By.xpath("//h2[text()='Welcome']")).isDisplayed())
	{
		status="Pass";
		System.out.println("welcome is displayed in homepage");
		Reporter.log("welcome is displayed in homepage");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("welcome is not displayed in homepage");
		Reporter.log("welcome is not displayed in homepage");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD3_JavaPetApplication","Display HomePage","User should be able to view HomePage",status,(new Date()).getTime(),"1","HomePage Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("4", testdetails);
	}
	catch(NoSuchElementException e)
	{
		status="Failed";
		System.out.println("welcome is not displayed in homepage");
		Reporter.log("welcome is not displayed in homepage");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
		long endtime = (new Date()).getTime();
		long Duration = endtime-starttime;
		Object[] testdetails=new Object[]{"TD3_JavaPetApplication","Display HomePage","User should be able to view HomePage",status,(new Date()).getTime(),"1","HomePage Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
		testresult.put("4", testdetails);
	}
}
}
