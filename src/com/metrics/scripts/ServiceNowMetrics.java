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

public class ServiceNowMetrics extends BaseTest
{
@Test
public void testServiceNowMetrics()
{
	System.out.println("******************************ServiceNowMetrics******************************");
	Reporter.log("******************************ServiceNowMetrics******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("harshanormaluser", "Harshanormal12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickSelecedProject("Harsha Project");
	tenantuserproject.clickCanvas("canvas");
	Analyze analyze=new Analyze(driver);
	analyze.clickAnalyzeTab();
	analyze.clickCustomView("ServiceNow-six");
	for(int i=0;i<6;i++)
	{
	Assert.assertEquals(driver.findElement(By.xpath(Generic.readExcelData("ServiceNow", i, 0))).isDisplayed(), true);
	System.out.println("\""+Generic.readExcelData("ServiceNow", i, 1)+"\""+" metric is displayed");
	Reporter.log("\""+Generic.readExcelData("ServiceNow", i, 1)+"\""+" metric is displayed");
	}
	System.out.println("All ServiceNow metrics are displayed");
	Reporter.log("All ServiceNow metrics are displayed");
	System.out.println("******************************ServiceNowMetrics******************************");
	Reporter.log("******************************ServiceNowMetrics******************************");
}
}