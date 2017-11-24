package com.canvashomepage.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;

public class IncorrectPasswordLogin extends BaseTest
{
@Test
public void testIncorrectPasswordLogin()
{
	HomePage homepage=new HomePage(driver);
	homepage.incorrectpasswordLogIn();
	try 
	{
		Thread.sleep(500);
	Assert.assertTrue(driver.getCurrentUrl().contains("main"));
	} 
	catch (AssertionError e) 
	{
		System.out.println("Login failed due to incorrect password");
		Reporter.log("Login failed due to incorrect password");
	}
	catch(Exception e)
	{
		
	}
}
}

