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

public class ArtifactoryMetrics extends BaseTest
{
@Test
public void testArtifactoryMetrics()
{
	System.out.println("******************************ArtifactoryMetrics******************************");
	Reporter.log("******************************ArtifactoryMetrics******************************");
	HomePage homepage=new HomePage(driver);
	homepage.userLogIn("harshanormaluser", "Harshanormal12");
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickSelecedProject("Harsha Project");
	tenantuserproject.clickCanvas("canvas");
	Analyze analyze=new Analyze(driver);
	analyze.clickAnalyzeTab();
	analyze.clickCustomView("Artifactory-four");
	for(int i=0;i<4;i++)
	{
	Assert.assertEquals(driver.findElement(By.xpath(Generic.readExcelData("Artifactory", i, 0))).isDisplayed(), true);
	System.out.println("\""+Generic.readExcelData("Artifactory", i, 1)+"\""+" metric is displayed");
	Reporter.log("\""+Generic.readExcelData("Artifactory", i, 1)+"\""+" metric is displayed");
	}
	System.out.println("All Artifactory metrics are displayed");
	Reporter.log("All Artifactory metrics are displayed");
	System.out.println("******************************ArtifactoryMetrics******************************");
	Reporter.log("******************************ArtifactoryMetrics******************************");
}
}