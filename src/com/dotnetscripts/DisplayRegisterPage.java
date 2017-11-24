package com.dotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayRegisterPage extends BaseTest
{
@Test
public void testDisplayRegisterPage()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Register")).click();
	System.out.println("clicked on register link");
	Reporter.log("clicked on register link");
	String status="N.A";
	if(driver.findElement(By.xpath("//input[@value='Register']")).isDisplayed())
	{
		status="Pass";
		System.out.println("register button is displayed");
		Reporter.log("register button is displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("register button is not displayed");
		Reporter.log("register button is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD2_dotnetApplication","Display Register Page","Register button should be displayed in Register Page",status,(new Date()).getTime(),"1","Register Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("3", testdetails);
}
}
