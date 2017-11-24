package com.canvashomepage.scripts;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.HomePage;

public class ValidLogIn extends BaseTest
{
@Test
public void testvalidlogIn()
{
	try 
	{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	Thread.sleep(1000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Assert.assertTrue(driver.getCurrentUrl().contains("main"));
	try 
	{
	if(driver.getCurrentUrl().contains("main"))
	{
		FileWriter filewriter=new FileWriter("C:/Users/m1021092/Desktop/testresult.csv");
		filewriter.append("pass");
		filewriter.flush();
		filewriter.close();
	}
	
	else
	{
		FileWriter filewriter=new FileWriter("C:/Users/m1021092/Desktop/testresult.csv");
		filewriter.append("Fail");
		filewriter.append(',');
		filewriter.append("User Login");
		filewriter.append(',');
		filewriter.append("User should be able to login successfully");
		filewriter.flush();
		filewriter.close();
	}
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
