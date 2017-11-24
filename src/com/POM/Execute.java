package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Execute 
{
	@FindBy(linkText="EXECUTE")
	private WebElement executelink;
	
	@FindBy(xpath="//div[@id='excutionViewdrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][4]/*[name()='g'][3]/*[name()='image']")
	private WebElement jenkinshamburger;
	
	@FindBy(xpath="//div[@id='excutionViewdrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][2]/*[name()='g'][4]/*[name()='g'][3]/*[name()='image']")
	private WebElement vstshamburger;
	
	@FindBy(xpath="//div[@id='excutionViewdrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][3]/*[name()='g'][4]/*[name()='g'][3]/*[name()='image']")
	private WebElement octopusdeployhamburger;
	
	@FindBy(xpath="//span[text()='Create Job']")
	private WebElement createjobaction;
	
	@FindBy(xpath="//span[text()='Update Job']")
	private WebElement updatejobaction;
	
	@FindBy(xpath="//span[text()='Build Job']")
	private WebElement buildjobaction;
	
	@FindBy(xpath="//span[text()='Delete Job']")
	private WebElement deletejobaction;
	
	@FindBy(xpath="//span[text()='Tag a Build']")
	private WebElement tagabuildaction;
	
	@FindBy(xpath="//span[text()='Create Build Definition']")
	private WebElement createbuilddefinitionaction;
	
	@FindBy(xpath="//span[text()='Update Build Definition']")
	private WebElement updatebuilddefinitionaction;
	
	@FindBy(xpath="//span[text()='Execute Build']")
	private WebElement executebuildaction;
	
	@FindBy(xpath="//span[text()='Deploy To Environment']")
	private WebElement deploytoenvironmentaction;
	
	@FindBy(xpath="//span[text()='Configure Tentacles']")
	private WebElement configuretentaclesaction;
	
	@FindBy(xpath="//span[text()='Create Release']")
	private WebElement createreleaseaction;
	
	@FindBy(xpath="//span[text()='Choose Lifecycle']")
	private WebElement chooselifecycleaction;
	
	@FindBy(xpath="//a[text()='DEV']")
	private WebElement deployreleasetodevaction;
	
	@FindBy(xpath="//a[text()='SIT']")
	private WebElement deployreleasetositaction;
	
	@FindBy(xpath="//a[text()='PROD']")
	private WebElement deployreleasetoprodaction;
	
	@FindBy(xpath="//span[text()='Retry Deployment']")
	private WebElement retrydeploymentaction;
	
	
	public Execute(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickExecuteTab()
	{
		try 
		{
		executelink.click();
		System.out.println("clicked on execute tab");
		Reporter.log("clicked on execute tab");
		Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickJenkinsHamburger()
	{
		try 
		{
		jenkinshamburger.click();
		System.out.println("clicked on jenkins hamburger");
		Reporter.log("clicked on jenkins hamburger");
		Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickVstsHamburger()
	{
		try 
		{
		vstshamburger.click();
		System.out.println("clicked on vsts hamburger");
		Reporter.log("clicked on vsts hamburger");
		Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOctopusDeployHamburger()
	{
		try 
		{
		octopusdeployhamburger.click();
		System.out.println("clicked on octopus deploy hamburger");
		Reporter.log("clicked on octopus deploy hamburger");
		Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickCreateJobAction()
	{
		try {
		createjobaction.click();
		System.out.println("clicked on create job action");
		Reporter.log("clicked on create job action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickUpdateJobAction()
	{
		try {
		updatejobaction.click();
		System.out.println("clicked on update job action");
		Reporter.log("clicked on update job action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickBuildJobAction()
	{
		try {
		buildjobaction.click();
		System.out.println("clicked on build job action");
		Reporter.log("clicked on build job action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickDeletJobAction()
	{
		try {
		deletejobaction.click();
		System.out.println("clicked on delete job action");
		Reporter.log("clicked on delete job action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickTagaBuildAction()
	{
		try {
		tagabuildaction.click();
		System.out.println("clicked on tag a build action");
		Reporter.log("clicked on tag a build action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickCreateBuildDefinitionAction()
	{
		try {
		createbuilddefinitionaction.click();
		System.out.println("clicked on create build definition action");
		Reporter.log("clicked on create build definition action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickUpdateBuildDefinitionAction()
	{
		try {
		updatebuilddefinitionaction.click();
		System.out.println("clicked on update build definition action");
		Reporter.log("clicked on update build definition action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickExecuteBuildAction()
	{
		try {
		executebuildaction.click();
		System.out.println("clicked on execute build action");
		Reporter.log("clicked on execute build action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickDeployToEnvironmentAction()
	{
		try {
		deploytoenvironmentaction.click();
		System.out.println("clicked on deploy to environment action");
		Reporter.log("clicked on deploytoenvironment action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickConfigureTentaclesAction()
	{
		try {
		configuretentaclesaction.click();
		System.out.println("clicked on configure tentacles action");
		Reporter.log("clicked on configure tentacles action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickCreateReleaseAction()
	{
		try {
		createreleaseaction.click();
		System.out.println("clicked on create release action");
		Reporter.log("clicked on create release action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickChooseLifecycleAction()
	{
		try {
		chooselifecycleaction.click();
		System.out.println("clicked on choose lifecycle action");
		Reporter.log("clicked on choose lifecycle action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickDeployReleaseToDevAction()
	{
		try {
		deployreleasetodevaction.click();
		System.out.println("clicked on deploy release to dev action");
		Reporter.log("clicked on deploy release to dev action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickDeployReleaseToSitAction()
	{
		try {
		Thread.sleep(2000);
		deployreleasetositaction.click();
		System.out.println("clicked on deploy release to sit action");
		Reporter.log("clicked on deploy release to sit action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickDeployReleaseToProdAction()
	{
		try {
		Thread.sleep(2000);
		deployreleasetoprodaction.click();
		System.out.println("clicked on deploy release to prod action");
		Reporter.log("clicked on deploy release to prod action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickRetryDeploymentAction()
	{
		try {
		retrydeploymentaction.click();
		System.out.println("clicked on retry deployment action");
		Reporter.log("clicked on retry deployment action");
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
