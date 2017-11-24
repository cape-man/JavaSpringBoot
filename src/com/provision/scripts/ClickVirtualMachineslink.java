package com.provision.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.HomePage;
import com.POM.Provision;
import com.canvashomepage.scripts.BaseTest;

public class ClickVirtualMachineslink extends BaseTest
{
@Test
public void testClickVirtualMachineslink() throws AWTException
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Provision provision=new Provision(driver);
	provision.clickProvisiontab();
	provision.clickVirtualMachineslink();
}
}
