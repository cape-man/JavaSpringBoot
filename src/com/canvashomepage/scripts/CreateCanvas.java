package com.canvashomepage.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.HomePage;
import com.library.Generic;

public class CreateCanvas extends BaseTest
{
@Test
public void testCreateCanvas() throws AWTException
{
	HomePage homepage=new HomePage(driver);
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	homepage.validLogIn();
	canvashomepage.clickProject();
	canvashomepage.clickCreateCanvasButton();
	canvashomepage.createCanvas();
}
}