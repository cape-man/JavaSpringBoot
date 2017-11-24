package com.compose.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.Compose;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DragComponents extends BaseTest
{
@Test
public void testDragComponents() throws AWTException, InterruptedException
{
	System.out.println("******************************DragComponents******************************");
	Reporter.log("******************************DragComponents******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Compose compose=new Compose(driver);
	compose.clickBuild();
	compose.dragJenkinsAndProvision(805,300);
	compose.dragMavenAndSelect(430,300);
	compose.zoomOut();
	compose.dragGitHubAndConnect(1050,300,"https://github.com/cape-man/JavaSampleProject.git","5a2233f08564206d6a72eaa21b7ee648041e11c2");
	compose.dragSonarQubeAndProvision(630,600);
	compose.clickServer();
	compose.dragTomcatAndProvision();
	compose.zoomIn();
	System.out.println("******************************DragComponents******************************");
	Reporter.log("******************************DragComponents******************************");
}
}
