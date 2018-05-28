package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;
import com.library.Generic;

public class DisplayVeterenarians extends BaseTest
{
	String status="N.A";
	long starttime = (new Date()).getTime();
	String buildnumber = Generic.getConfigData("BuildNumber");
@Test
public void testDisplayVeterenarians()
{
	try
	{
	
	driver.findElement(By.xpath("//span[text()='Veterinarians']")).click();
	System.out.println("clicked on veterinarians link");
	Reporter.log("clicked on veterinarians link");
	if(driver.findElement(By.xpath("//h2[text()='Vets']")).isDisplayed())
	{
		status="Pass";
		System.out.println("Vets is displayed");
		Reporter.log("Vets is displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("Vets is not displayed");
		Reporter.log("Vets is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object testDetails []	= new Object[]{"TD2_JavaPetApplication","Display Veterinarians","User should be able to view Vets",status,(new Date()).getTime(),"1","Display Veterinarians Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli",buildnumber};
	testresult.put("3",testDetails);
	}
	catch(NoSuchElementException e)
	{
		status="Failed";
		System.out.println("Vets is not displayed");
		Reporter.log("Vets is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
		long endtime = (new Date()).getTime();
		long Duration = endtime-starttime;
		Object testDetails []	= new Object[]{"TD2_JavaPetApplication","Display Veterinarians","User should be able to view Vets",status,(new Date()).getTime(),"1","Display Veterinarians Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli",buildnumber};
		testresult.put("3",testDetails);
	}
}
}
