package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayErrorPage1 extends BaseTest
{
	String status="N.A";
	long starttime = (new Date()).getTime();
@Test
public void testDisplayErrorPage()
{
	try
	{
	driver.findElement(By.xpath("//span[text()='Error']")).click();
	System.out.println("clicked on error page link");
	Reporter.log("clicked on error page link");
	if(driver.findElement(By.xpath("//h2[text()='Something happene...']")).isDisplayed())
	{
		status="Pass";
		System.out.println("something happened is displayed in error page");
		Reporter.log("something happened is displayed in error page");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("something happened is not displayed");
		Reporter.log("something happened is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD8_JavaPetApplication","Display ErrorPage-1","User should be able to view ErrorPage",status,(new Date()).getTime(),"2","ErrorPage Module-1","SIT","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("9", testdetails);
	}
	catch(NoSuchElementException e)
	{
		status="Failed";
		System.out.println("something happened is not displayed");
		Reporter.log("something happened is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
		long endtime = (new Date()).getTime();
		long Duration = endtime-starttime;
		Object[] testdetails=new Object[]{"TD8_JavaPetApplication","Display ErrorPage-1","User should be able to view ErrorPage",status,(new Date()).getTime(),"2","ErrorPage Module-1","SIT","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
		testresult.put("9", testdetails);
	}
}
}
