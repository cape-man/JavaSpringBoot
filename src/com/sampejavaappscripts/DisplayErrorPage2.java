package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayErrorPage2 extends BaseTest
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
	Object[] testdetails=new Object[]{"TD12_JavaPetApplication","Display ErrorPage-2","User should be able to view ErrorPage",status,(new Date()).getTime(),"3","ErrorPage Module-2","Dev","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("13", testdetails);
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
		Object[] testdetails=new Object[]{"TD12_JavaPetApplication","Display ErrorPage-2","User should be able to view ErrorPage",status,(new Date()).getTime(),"3","ErrorPage Module-2","Dev","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
		testresult.put("13", testdetails);
	}
}
}
