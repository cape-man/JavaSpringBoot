package com.compose.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.Compose;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;
import com.library.Generic;

public class IntegrateComponents extends BaseTest
{
@Test
public void testIntegrateComponents() throws AWTException, InterruptedException
{
	System.out.println("******************************IntegrateComponents******************************");
	Reporter.log("******************************IntegrateComponents******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Compose compose=new Compose(driver);
	compose.integrateComponents();
	System.out.println("******************************IntegrateComponents******************************");
	Reporter.log("******************************IntegrateComponents******************************");
}
}
