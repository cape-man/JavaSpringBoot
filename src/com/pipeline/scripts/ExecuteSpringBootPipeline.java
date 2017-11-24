package com.pipeline.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.POM.Compose;
import com.POM.HomePage;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class ExecuteSpringBootPipeline extends BaseTest
{
@Test
public void testExecuteSpringBootPipeline() throws AWTException, InterruptedException
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCreateCanvasButton();
	tenantuserproject.createSelectedCanvas("Spring Boot");
	Compose compose=new Compose(driver);
	compose.clickBuild();
	compose.dragJenkinsAndProvision(600,300);
	compose.dragGitHubAndConnect(350, 200, "https://github.com/cape-man/spring-petclinic.git", "hw0QCrk172h1nnHvzo1fL9Y+0lJEs2bZn802wEcv3I8yI3gP2McxOXxQsbOfcmMY.Y2FwZUVuY3J5cHRpb24=");
	compose.dragSonarQubeAndProvision(400,350);
	compose.dragMavenAndSelect(500,500);
}
}
