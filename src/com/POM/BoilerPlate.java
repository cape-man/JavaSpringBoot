package com.POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.canvashomepage.scripts.CreateCanvas;
import com.library.Generic;

public class BoilerPlate
{
	//@FindBy(xpath="//img[@ng-src='assets/images/left-menu/c_boiler_plate.svg']")
	@FindBy(xpath="//ul[@id='side-menu']/li[3]")
	private WebElement boilerplatelink;
	
	//@FindBy(linkText="Local")
	@FindBy(xpath="(//a[text()='Local'])[1]")
	private WebElement locallink;

	//@FindBy(linkText="Global")
	@FindBy(xpath="(//a[text()='Global'])[1]")
	private WebElement globallink;
	
	@FindBy(xpath="//button[@ng-click='drawCanvasCtrl.useAsCanvas()']")
	private WebElement useascanvasbutton;
	
	@FindBy(id="canvasName")
	private WebElement canvasnamefield;
	
	@FindBy(id="allSoftwares")
	private WebElement projectdropdown;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement createcanvassubmitbutton;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement dropdownbutton;
	
	@FindBy(xpath="//button[@title='Delete boilerplate']")
	private WebElement deleteboilerplate;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement canvasdescriptionfield;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement deleteconfirmbutton;
	
	
	private WebDriver driver;
	
	public BoilerPlate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickLocalBoilerplateLink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(boilerplatelink).moveToElement(locallink).click().build().perform();
		System.out.println("clicked on Local Boiler Plate link");
		Reporter.log("clicked on Local Boiler Plate link");
	}
	
	
	public void clickGlobalBoilerplatelink()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(boilerplatelink).moveToElement(globallink).click().build().perform();
		System.out.println("clicked on Global Boiler Plate link");
		Reporter.log("clicked on Global Boiler Plate link");
	}
	
	public void openBoilerplate()
	{
		try
		{
		driver.findElement(By.xpath("//p[text()='"+Generic.readExcelData("BoilerPlateName",0,0)+"']")).click();
		System.out.println("Step6:Opened Boiler Plate: "+Generic.readExcelData("BoilerPlateName",0,0));
		Reporter.log("Step6:Opened Boiler Plate: "+Generic.readExcelData("BoilerPlateName",0,0));
		Thread.sleep(2000);
		}
		catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	
	public void UseAsCanvas()
	{
		try
		{
		useascanvasbutton.click();
		System.out.println("clicked on use as canvas link");
		canvasnamefield.sendKeys(Generic.readExcelData("CanvasName", 1,0));
		System.out.println("entered canvas name");
		projectdropdown.click();
		System.out.println("clicked on project dropdown");
		Thread.sleep(2000);
		Select select=new Select(projectdropdown);
		select.selectByVisibleText(Generic.readExcelData("ProjectName",0,0));
		System.out.println("selected the project");
		canvasdescriptionfield.sendKeys(Generic.readExcelData("CanvasName", 1,0));
		System.out.println("entered canvas description");
		createcanvassubmitbutton.click();
		System.out.println("clicked on submit button");
		System.out.println("Step7:Created canvas from Boiler Plate");
		Reporter.log("Step7:Created canvas from Boiler Plate");
		Thread.sleep(6000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void clickDeleteBoilerplate()
	{
		try
		{
		deleteboilerplate.click();
		System.out.println("clicked on delete boiler plate link");
		Reporter.log("clicked on delete boiler plate link");
		Thread.sleep(2000);
		deleteconfirmbutton.click();
		System.out.println("clicked yes on delete boiler plate confirm popup");
		Reporter.log("clicked yes on delete boiler plate confirm popup");
		System.out.println("Step8:Boilerplate is deleted successfully");
		Reporter.log("Step8:Boilerplate is deleted successfully");
		Thread.sleep(4000);
		}
		catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void clickDropdownButton()
	{
		dropdownbutton.click();
		System.out.println("clicked on dropdown button");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}