package com.acl.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.Compose;
import com.POM.HomePage;
import com.POM.ManageUsers;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class VerifyAclWithExecuteAccess extends BaseTest
{
@Test
public void testVerifyAclWithExecuteAccess() throws AWTException, InterruptedException
{
	System.out.println("******************************VerifyAclWithExecuteAccess******************************");
	Reporter.log("******************************VerifyAclWithExecuteAccess******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCreateCanvasButton();
	tenantuserproject.createSelectedCanvas("ACL");
	Compose compose=new Compose(driver);
	compose.clickBuild();
	compose.dragJenkinsAndConnect(805,300);
	compose.dragVSTSAndConnect();
	compose.clickDeploy();
	compose.dragOctopusDeployAndConnect();
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickManageUsers();
	if(driver.findElement(By.xpath("//span[text()='JENKINS 2.7']/../../..//span[text()='Create Job']")).isDisplayed())
	{
		System.out.println("Jenkins 2.7 ACL \"Create Job\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='JENKINS 2.7']/../../..//span[text()='Build Job']")).isDisplayed())
	{
		System.out.println("Jenkins 2.7 ACL \"Build Job\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='JENKINS 2.7']/../../..//span[text()='Tag a Build']")).isDisplayed())
	{
		System.out.println("Jenkins 2.7 ACL \"Tag a Build\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='JENKINS 2.7']/../../..//span[text()='Update Job']")).isDisplayed())
	{
		System.out.println("Jenkins 2.7 ACL \"Update Pipeline\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='JENKINS 2.7']/../../..//span[text()='Delete Job']")).isDisplayed())
	{
		System.out.println("Jenkins 2.7 ACL \"Delete Job\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='VSTS']/../../..//span[text()='Create Build Definition']")).isDisplayed())
	{
		System.out.println("VSTS ACL \"Create Build Definition\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='VSTS']/../../..//span[text()='Update Build Definition']")).isDisplayed())
	{
		System.out.println("VSTS ACL \"Update Build Definition\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='VSTS']/../../..//span[text()='Deploy To Environment']")).isDisplayed())
	{
		System.out.println("VSTS ACL \"Deploy To Environment\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='VSTS']/../../..//span[text()='Execute Build']")).isDisplayed())
	{
		System.out.println("VSTS ACL \"Execute Build\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Configure Tentacles']")).isDisplayed())
	{
		System.out.println("Octopus Deploy ACL \"Configure Tentacles\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Create Release']")).isDisplayed())
	{
		System.out.println("Octopus Deploy ACL \"Create Release\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Deploy Release to']")).isDisplayed())
	{
		System.out.println("Octopus Deploy ACL \"Deploy Release to\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Choose Lifecycle']")).isDisplayed())
	{
		System.out.println("Octopus Deploy ACL \"Choose Lifecycle\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	if(driver.findElement(By.xpath("//span[text()='OCTOPUS DEPLOY']/../../..//span[text()='Retry Deployment']")).isDisplayed())
	{
		System.out.println("Octopus Deploy ACL \"Retry Deployment\" is displayed");
	}
	else
	{
		Assert.fail();
	}
	ManageUsers manageusers=new ManageUsers(driver);
	manageusers.closeManageUsers();
	System.out.println("******************************VerifyAclWithExecuteAccess******************************");
	Reporter.log("******************************VerifyAclWithExecuteAccess******************************");
}

}
