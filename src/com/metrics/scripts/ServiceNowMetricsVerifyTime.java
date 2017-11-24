package com.metrics.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Analyze;
import com.POM.HomePage;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;
import com.library.Generic;

public class ServiceNowMetricsVerifyTime extends BaseTest
{
@Test
public void testServiceNowMetricsVerifyTime()
{
	System.out.println("******************************ServiceNowMetricsVerifyTime******************************");
	Reporter.log("******************************ServiceNowMetricsVerifyTime******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("harshanormaluser", "Harshanormal12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickSelecedProject("Harsha Project");
	tenantuserproject.clickCanvas("canvas");
	Analyze analyze=new Analyze(driver);
	analyze.clickAnalyzeTab();
	analyze.clickCustomView("ServiceNow-six");
	for (int i=0;i<6;i++)
	{
	String timeInString = driver.findElement(By.xpath(Generic.readExcelData("ServiceNow", i, 2))).getText();
	if(timeInString.contains("seconds"))
	{
		System.out.println("\""+Generic.readExcelData("ServiceNow", i, 1)+"\""+" Metric Data is latest");
		Reporter.log("\""+Generic.readExcelData("ServiceNow", i, 1)+"\""+" Metric Data is latest");
	}
	else
	{
		int timeInInteger =Integer.parseInt(timeInString.split(" ")[0]);
		if(timeInInteger<=10)
		{
			System.out.println("\""+Generic.readExcelData("ServiceNow", i, 1)+"\""+" Metric Data is latest");
			Reporter.log("\""+Generic.readExcelData("ServiceNow", i, 1)+"\""+" Metric Data is latest");
		}
		else
		{
			System.out.println("\""+Generic.readExcelData("ServiceNow", i, 1)+"\""+" Metric Data is not latest");
			Reporter.log("\""+Generic.readExcelData("ServiceNow", i, 1)+"\""+" Metric Data is not latest");
			Assert.fail();
		}
		
	}
}
	System.out.println("All ServiceNow metric data is latest");
	Reporter.log("All ServiceNow metric data is latest");
	System.out.println("******************************ServiceNowMetricsVerifyTime******************************");
	Reporter.log("******************************ServiceNowMetricsVerifyTime******************************");
}
}
