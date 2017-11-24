package com.compose.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.Compose;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DragCICDComponent extends BaseTest
{
@Test
public void testDragCICDComponent() throws AWTException, InterruptedException
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Compose compose=new Compose(driver);
	compose.clickBuild();
	compose.dragJenkinsAndProvision(805,300);
}
}
