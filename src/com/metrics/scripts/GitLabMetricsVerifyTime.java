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

public class GitLabMetricsVerifyTime extends BaseTest
{
@Test
public void testGitLabMetricsVerifyTime()
{
	System.out.println("******************************GitLabMetricsVerifyTime******************************");
	Reporter.log("******************************GitLabMetricsVerifyTime******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("harshanormaluser", "Harshanormal12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickSelecedProject("Harsha Project");
	tenantuserproject.clickCanvas("canvas");
	Analyze analyze=new Analyze(driver);
	analyze.clickAnalyzeTab();
	analyze.clickCustomView("GitLab-four");
	for (int i=0;i<4;i++)
	{
	String timeInString = driver.findElement(By.xpath(Generic.readExcelData("GitLab", i, 2))).getText();
	if(timeInString.contains("seconds"))
	{
		System.out.println("\""+Generic.readExcelData("GitLab", i, 1)+"\""+" Metric Data is latest");
		Reporter.log("\""+Generic.readExcelData("GitLab", i, 1)+"\""+" Metric Data is latest");
	}
	else
	{
		int timeInInteger =Integer.parseInt(timeInString.split(" ")[0]);
		if(timeInInteger<=10)
		{
			System.out.println("\""+Generic.readExcelData("GitLab", i, 1)+"\""+" Metric Data is latest");
			Reporter.log("\""+Generic.readExcelData("GitLab", i, 1)+"\""+" Metric Data is latest");
		}
		else
		{
			System.out.println("\""+Generic.readExcelData("GitLab", i, 1)+"\""+" Metric Data is not latest");
			Reporter.log("\""+Generic.readExcelData("GitLab", i, 1)+"\""+" Metric Data is not latest");
			Assert.fail();
		}
		
	}
}
	System.out.println("All GitLab metric data is latest");
	Reporter.log("All GitLab metric data is latest");
	System.out.println("******************************GitLabMetricsVerifyTime******************************");
	Reporter.log("******************************GitLabMetricsVerifyTime******************************");
}
}
