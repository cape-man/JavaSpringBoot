package com.provision.scripts;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.Canvas;
import com.POM.TenantUserProject;
import com.POM.Compose;
import com.POM.HomePage;
import com.POM.Provision;
import com.canvashomepage.scripts.BaseTest;

public class InstallSoftwareintoVM extends BaseTest
{
@Test
public void testInstallSoftwareintoVM() throws AWTException
{
	System.out.println("******************************InstallSoftwareintoVM******************************");
	Reporter.log("******************************InstallSoftwareintoVM******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Provision provision=new Provision(driver);
	provision.clickProvisiontab();
	provision.clickSoftwarelink();
	provision.dragJenkinstoVM();
	provision.dragTomcattoVM();
	provision.dragSonarqubetoVM();
	System.out.println("******************************InstallSoftwareintoVM******************************");
	Reporter.log("******************************InstallSoftwareintoVM******************************");
}
}
