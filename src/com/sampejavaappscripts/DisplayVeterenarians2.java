package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayVeterenarians2 extends BaseTest
{
	String status="N.A";
	long starttime = (new Date()).getTime();
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
	Object testDetails []	= new Object[]{"TD10_JavaPetApplication","Display Veterinarians-2","User should be able to view Vets",status,(new Date()).getTime(),"3","Display Veterinarians Module-2","Dev","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("11",testDetails);
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
		Object testDetails []	= new Object[]{"TD10_JavaPetApplication","Display Veterinarians-2","User should be able to view Vets",status,(new Date()).getTime(),"3","Display Veterinarians Module-2","Dev","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
		testresult.put("11",testDetails);
	}
}
}
