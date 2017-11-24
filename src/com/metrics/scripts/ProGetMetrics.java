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

public class ProGetMetrics extends BaseTest
{
@Test
public void testProGetMetrics()
{
	System.out.println("******************************ProGetMetrics******************************");
	Reporter.log("******************************ProGetMetrics******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("harshanormaluser", "Harshanormal12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickSelecedProject("Harsha Project");
	tenantuserproject.clickCanvas("canvas");
	Analyze analyze=new Analyze(driver);
	analyze.clickAnalyzeTab();
	analyze.clickCustomView("ProGet-five");
	for(int i=0;i<5;i++)
	{
	Assert.assertEquals(driver.findElement(By.xpath(Generic.readExcelData("ProGet", i, 0))).isDisplayed(), true);
	System.out.println("\""+Generic.readExcelData("ProGet", i, 1)+"\""+" metric is displayed");
	Reporter.log("\""+Generic.readExcelData("ProGet", i, 1)+"\""+" metric is displayed");
	}
	System.out.println("All ProGet metrics are displayed");
	Reporter.log("All ProGet metrics are displayed");
	System.out.println("******************************ProGetMetrics******************************");
	Reporter.log("******************************ProGetMetrics******************************");
}
}