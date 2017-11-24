package com.canvashomepage.scripts;

import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.HomePage;

public class ClickCanvas extends BaseTest
{
@Test
public void testClickCanvas()
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickCanvas("Automation Canvas");
}
}
