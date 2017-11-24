package com.POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.library.Generic;

public class TenantAdminManageProject
{
	//@FindBy(xpath="//img[@ng-src='assets/images/left-menu/tenant.svg']/..")
		@FindBy(xpath="//ul[@id='side-menu']/li[4]")
		private WebElement Managelink;
		
		@FindBy(xpath="//a[text()='Project']")
		private WebElement projectlink;
		
		@FindBy(xpath="//button[@class='create-tanent-button btn  btn-md pull-right btn-search-size']")
		private WebElement createprojectbutton;

		@FindBy(name="projectName")
		private WebElement projectnamefield;
		
		@FindBy(name="projectDescription")
		private WebElement projectdescriptionfield;
		
		@FindBy(xpath="//textarea[@name='projectDescription']")
		private WebElement updateprojectdescriptionfield;

		@FindBy(xpath="//button[@ng-click='createProjectCtrl.validateCreateProjectForm(createProjectForm.$valid)']")
		private WebElement createprojectsubmitbutton;
		
		@FindBy(xpath="//button[@ng-click='createProjectCtrl.validateUpdateProjectForm(createProjectForm.$valid,createProjectForm.projectDescription.$dirty)']")
		private WebElement updateprojectsubmitbutton;
		
		@FindBy(xpath="//button[contains(text(),'Assign User')]")
		private WebElement assignuserbutton;

		@FindBy(xpath="//input[@placeholder='Add a user']")
		private WebElement adduserfield;
		
		@FindBy(xpath="//button[@ng-click='assignUserCtrl.validateAssignUserForm()']")
		private WebElement assignusersubmitbutton;
		
		@FindBy(xpath="//span[text()='Automation Project']")
		private WebElement project;
		
		@FindBy(xpath="//span[text()='Automation Project Updated']")
		private WebElement updatedproject;
		
		@FindBy(xpath="//span[text()='Automation Project']/../../..//img[@class='pull-right edit-icon']")
		private WebElement projecteditbutton;
		
		@FindBy(xpath="//div[@title='Automation Project']/../..//img[@class='pull-right edit-icon']")
		private WebElement inactiveprojecteditbutton;
		
		@FindBy(xpath="//span[text()='Automation Project Updated']/../../..//img[@class='pull-right edit-icon']")
		private WebElement updatedprojecteditbutton;
		
		@FindBy(xpath="//span[@class='bootstrap-switch-label']")
		private WebElement statusbutton;
		
	private WebDriver driver;
	
	public TenantAdminManageProject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void createProject()
	{
		try 
		{
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(projectlink).click().build().perform();
		createprojectbutton.click();
		System.out.println("clicked on create project button");
		Reporter.log("clicked on create project button");
		projectnamefield.sendKeys(Generic.readExcelData("ProjectName", 0, 0));
		System.out.println("entered project name");
		Reporter.log("entered project name");
		projectdescriptionfield.sendKeys(Generic.readExcelData("ProjectName", 0, 0));
		System.out.println("entered project description");
		Reporter.log("entered project description");
		createprojectsubmitbutton.click();
		System.out.println("step5: Created a new project: Automation Project");
		Reporter.log("step5: Created a new project: Automation Project");
		Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateProject()
	{
		try {
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(projectlink).click().build().perform();
		project.click();
		System.out.println("selected project");
		Reporter.log("selected project");
		projecteditbutton.click();
		System.out.println("clicked on edit button");
		Reporter.log("clicked on edit button");
		projectnamefield.clear();
		projectnamefield.sendKeys("Automation Project Updated");
		System.out.println("entered project name");
		Reporter.log("entered project name");
		updateprojectdescriptionfield.clear();
		updateprojectdescriptionfield.sendKeys("Automation Project Updated");
		System.out.println("entered project description");
		Reporter.log("entered project description");
		updateprojectsubmitbutton.click();
		System.out.println("updated project successfully");
		Reporter.log("updated project successfully");
		Thread.sleep(4000);
		//updatedproject.click();
		//System.out.println("selected updated project");
		//Reporter.log("selected updated project");
		updatedprojecteditbutton.click();
		System.out.println("clicked on edit button of updated project");
		Reporter.log("clicked on edit button of updated project");
		projectnamefield.clear();
		projectnamefield.sendKeys("Automation Project");
		updateprojectsubmitbutton.click();
		System.out.println("Reverted project name back to Automation Project");
		Reporter.log("Reverted project name back to Automation Project");
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void tagUsertoProject()
	{
		try {
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(projectlink).click().build().perform();
		System.out.println("navigated to project screen");
		Reporter.log("navigated to project screen");
		Thread.sleep(2000);
		assignuserbutton.click();
		System.out.println("clicked on assign user button");
		Reporter.log("clicked on assign user button");
		Thread.sleep(2000);
		adduserfield.click();
		Thread.sleep(2000);
		adduserfield.sendKeys("autouser");
		adduserfield.clear();
		Actions actions1=new Actions(driver);
		actions1.sendKeys(adduserfield, Generic.readExcelData("Credentials", 6, 1)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		assignusersubmitbutton.click();
		Thread.sleep(2000);
		System.out.println("entered user name and clicked on Assign user submit button");
		Reporter.log("entered user name and clicked on Assign user submit button");
		System.out.println("step4: Assigned Automation User to Automation Project");
		Reporter.log("step4: Assigned Automation User to Automation Project");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void tagSelectedUsertoProject(String user)
	{
		try {
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(projectlink).click().build().perform();
		System.out.println("navigated to project screen");
		Reporter.log("navigated to project screen");
		Thread.sleep(2000);
		assignuserbutton.click();
		System.out.println("clicked on assign user button");
		Reporter.log("clicked on assign user button");
		Thread.sleep(2000);
		adduserfield.click();
		Thread.sleep(2000);
		adduserfield.sendKeys(user);
		adduserfield.clear();
		Actions actions1=new Actions(driver);
		actions1.sendKeys(adduserfield,user).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(6000);
		assignusersubmitbutton.click();
		System.out.println("entered user name and clicked on Assign user submit button");
		Reporter.log("entered user name and clicked on Assign user submit button");
		Thread.sleep(2000);
		
		try
		{
		if(driver.findElement(By.xpath("//td[contains(text(),'"+user+"')]")).isDisplayed())
		{
			
		}
		else
		{
			System.out.println("entered into else loop");
			Reporter.log("entered into else loop");
			assignusersubmitbutton.click();
			System.out.println("entered user name and clicked on Assign user submit button");
			Reporter.log("entered user name and clicked on Assign user submit button");
			Thread.sleep(2000);
		}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("entered into catch loop");
			Reporter.log("entered into catch loop");
			assignusersubmitbutton.click();
			System.out.println("entered user name and clicked on Assign user submit button");
			Reporter.log("entered user name and clicked on Assign user submit button");
			Thread.sleep(2000);
		}
		
		System.out.println("step4: Assigned Automation Admin to Automation Project");
		Reporter.log("step4: Assigned Automation Admin to Automation Project");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("step4: Assigned Automation Admin to Automation Project");
			Reporter.log("step4: Assigned Automation Admin to Automation Project");
	}
	
	
	public void makeProjectInactive()
	{
		try {
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(projectlink).click().build().perform();
		project.click();
		System.out.println("selected project");
		Reporter.log("selected project");
		projecteditbutton.click();
		System.out.println("clicked on edit button");
		Reporter.log("clicked on edit button");
		Thread.sleep(2000);
		statusbutton.click();
		updateprojectsubmitbutton.click();
		System.out.println("changed status of the project to inactive");
		Reporter.log("changed status of the project to inactive");
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void makeProjectActive()
	{
		try {
		Actions actions=new Actions(driver);
		actions.moveToElement(Managelink).moveToElement(projectlink).click().build().perform();
		//project.click();
		//System.out.println("selected project");
		//Reporter.log("selected project");
		inactiveprojecteditbutton.click();
		System.out.println("clicked on edit button");
		Reporter.log("clicked on edit button");
		Thread.sleep(2000);
		statusbutton.click();
		updateprojectsubmitbutton.click();
		System.out.println("changed status of the project to active");
		Reporter.log("changed status of the project to active");
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
