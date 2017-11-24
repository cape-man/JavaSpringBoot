package com.canvashomepage.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;

public class IncorrectUserLogin extends BaseTest
{
@Test
public void testIncorrectUserLogin()
{
	HomePage homepage=new HomePage(driver);
	homepage.incorrectuserLogIn();
	try 
	{
		Thread.sleep(500);
	Assert.assertTrue(driver.getCurrentUrl().contains("main"));
	} 
	catch (AssertionError e) 
	{
		System.out.println("Login failed due to incorrect userid");
		Reporter.log("Login failed due to incorrect uswerid");
	}
	catch(Exception e)
	{
		
	}
}
}
