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

public class OctopusDeployMetrics extends BaseTest
{
@Test
public void testOctopusDeployMetrics()
{
	System.out.println("******************************OctopusDeployMetrics******************************");
	Reporter.log("******************************OctopusDeployMetrics******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("harshanormaluser", "Harshanormal12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickSelecedProject("Harsha Project");
	tenantuserproject.clickCanvas("canvas");
	Analyze analyze=new Analyze(driver);
	analyze.clickAnalyzeTab();
	analyze.clickCustomView("Octopus Deploy-four");
	for(int i=0;i<4;i++)
	{
	Assert.assertEquals(driver.findElement(By.xpath(Generic.readExcelData("Octopus Deploy", i, 0))).isDisplayed(), true);
	System.out.println("\""+Generic.readExcelData("Octopus Deploy", i, 1)+"\""+" metric is displayed");
	Reporter.log("\""+Generic.readExcelData("Octopus Deploy", i, 1)+"\""+" metric is displayed");
	}
	System.out.println("All Octopus Deploy metrics are displayed");
	Reporter.log("All Octopus Deploy metrics are displayed");
	System.out.println("******************************OctopusDeployMetrics******************************");
	Reporter.log("******************************OctopusDeployMetrics******************************");
}
}