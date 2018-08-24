package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;
import com.library.Generic;

public class VerifyNameInVeterenarians extends BaseTest
{
	String status="N.A";
	long starttime = (new Date()).getTime();
	String buildnumber = Generic.getConfigData("BuildNumber");
@Test
public void testDisplayErrorPage()
{
	try
	{
		driver.findElement(By.xpath("//span[text()='Veterinarians']")).click();
		System.out.println("clicked on veterinarians link");
		Reporter.log("clicked on veterinarians link");
	
	
	
	if(driver.findElement(By.xpath("//th[text()='Names']")).isDisplayed())
	{
		status="Pass";
		System.out.println("Names is displayed in veterinarians page");
		Reporter.log("Names is displayed in veterenarians page");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("Names is not displayed");
		Reporter.log("Names is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD13_JavaPetApplication","Verify Names Word","User should be able to view Names word",status,(new Date()).getTime(),"1","Veterenarians Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli",buildnumber};
	testresult.put("14", testdetails);
	}
	catch(NoSuchElementException e)
	{
		status="Failed";
		System.out.println("Names is not displayed");
		Reporter.log("Names is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
		long endtime = (new Date()).getTime();
		long Duration = endtime-starttime;
		Object[] testdetails=new Object[]{"TD13_JavaPetApplication","Verify Names Word","User should be able to view Names word",status,(new Date()).getTime(),"1","Veterenarians Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli",buildnumber};
		testresult.put("14", testdetails);
	}
}
}
