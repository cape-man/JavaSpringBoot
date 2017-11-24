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

public class SonarQubeMetrics extends BaseTest
{
@Test
public void testSonarQubeMetrics()
{
	System.out.println("******************************SonarQubeMetrics******************************");
	Reporter.log("******************************SonarQubeMetrics******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("harshanormaluser", "Harshanormal12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickSelecedProject("Harsha Project");
	tenantuserproject.clickCanvas("canvas");
	Analyze analyze=new Analyze(driver);
	analyze.clickAnalyzeTab();
	analyze.clickCustomView("SonarQube-five");
	for(int i=0;i<5;i++)
	{
	Assert.assertEquals(driver.findElement(By.xpath(Generic.readExcelData("SonarQube", i, 0))).isDisplayed(), true);
	System.out.println("\""+Generic.readExcelData("SonarQube", i, 1)+"\""+" metric is displayed");
	Reporter.log("\""+Generic.readExcelData("SonarQube", i, 1)+"\""+" metric is displayed");
	}
	System.out.println("All SonarQube metrics are displayed");
	Reporter.log("All SonarQube metrics are displayed");
	System.out.println("******************************SonarQubeMetrics******************************");
	Reporter.log("******************************SonarQubeMetrics******************************");
}
}