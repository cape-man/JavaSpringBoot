package com.dotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayLoginPage extends BaseTest
{
@Test
public void testDisplayLoginPage()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Log in")).click();
	System.out.println("clicked on login link");
	Reporter.log("clicked on login link");
	String status="N.A";
	if(driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed())
	{
		status="Pass";
		System.out.println("login button is displayed");
		Reporter.log("login button is displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("login button is not displayed");
		Reporter.log("login button is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD1_dotnetApplication","Display Login Page","Login button should be displayed in Login Page",status,(new Date()).getTime(),"1","Login Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("2", testdetails);
}
}
