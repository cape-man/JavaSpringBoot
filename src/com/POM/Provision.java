package com.POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.library.Generic;

public class Provision 
{
@FindBy(xpath="//a[contains(text(),'PROVISION')]")
private WebElement provisiontab;

@FindBy(xpath="//span[contains(text(),'Virtual Machines')]")
private WebElement virtualmachineslink;

@FindBy(xpath="//div[text()='VM Connect']")
private WebElement vmconnect;

@FindBy(xpath="//b[contains(text(),'Ubuntu Server')]/../..//button[contains(text(),'Select')]")
private WebElement ubuntuserverselectbutton;

@FindBy(id="componentName")
private WebElement servername;

@FindBy(id="dns")
private WebElement hostname;

@FindBy(id="password")
private WebElement password;

@FindBy(xpath="//input[@type='submit']")
private WebElement submitbutton;

@FindBy(xpath="//span[contains(text(),'Software')]")
private WebElement softwarelink;

@FindBy(xpath="//div[contains(text(),'Jenkins 2.7')]")
private WebElement jenkinssoftware;

@FindBy(xpath="//div[contains(text(),'Tomcat 9.0')]")
private WebElement tomcatsoftware;

@FindBy(xpath="//div[@class='vm-wrapper-container']")
private WebElement vm;

@FindBy(xpath="//div[contains(text(),'SonarQube 6.0')]")
private WebElement sonarqubesoftware;

@FindBy(xpath="//button[@ng-click='defaultProvisionViewCtrl.provisionVirtualMachine()']")
private WebElement provisionbutton;

@FindBy(xpath="//button[text()='Yes']")
private WebElement applychangesyesbutton;

@FindBy(id="hostPort")
private WebElement hostport;

private WebDriver driver;

public Provision(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public void clickProvisiontab()
{
	try 
	{
	provisiontab.click();	
	System.out.println("Step4:Clicked on Provision view");
	Reporter.log("Step4:Clicked on Provision view");
	Thread.sleep(1000);
	}
	catch (InterruptedException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickVirtualMachineslink()
{
	virtualmachineslink.click();
	System.out.println("Clicked on Virtual Machines");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void dragVMConnectUbuntuServer() throws AWTException
{
	try
	{
	Robot robot=new Robot();
	robot.mouseMove(vmconnect.getLocation().getX()+50,vmconnect.getLocation().getY()+80);
	Thread.sleep(2000);
	robot.mousePress(InputEvent.BUTTON1_MASK);
	Thread.sleep(2000);
	robot.mouseMove(100,100);
	robot.mouseMove(430, 600);
	Thread.sleep(2000);
	robot.mouseMove(900, 500);
	Thread.sleep(2000);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
	ubuntuserverselectbutton.click();
	servername.sendKeys("six");
	hostname.clear();
	hostname.sendKeys("cape-vm-six.southeastasia.cloudapp.azure.com");
	password.clear();
	password.sendKeys("vmsix@ISG2017");
	submitbutton.click();
	System.out.println("Step5:Dragged VM Connect with Ubuntu server into the canvas");
	Reporter.log("Step5:Dragged VM Connect with Ubuntu server into the canvas");
	Thread.sleep(8000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickSoftwarelink()
{
	try {
	Thread.sleep(2000);
	softwarelink.click();
	System.out.println("clicked on Software");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void dragJenkinstoVM() throws AWTException
{
	try {
	Thread.sleep(1000);
	Robot robot=new Robot();
	robot.mouseMove(jenkinssoftware.getLocation().getX()+50,jenkinssoftware.getLocation().getY()+80);
	Thread.sleep(2000);
	robot.mousePress(InputEvent.BUTTON1_MASK);
	Thread.sleep(2000);
	robot.mouseMove(100,100);
	robot.mouseMove(430, 600);
	Thread.sleep(2000);
	//robot.mouseMove(800, 400);
	robot.mouseMove(900, 500);
	Thread.sleep(2000);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
	System.out.println("dragged Jenkins software into vm-ten");
	hostport.clear();
	hostport.sendKeys("8000");
	System.out.println("entered port number as 8000");
	submitbutton.click();
	System.out.println("clicked on Apply button");
	System.out.println("Step6:Dragged Jenkins software into VM");
	Reporter.log("Step6:Dragged Jenkins software into VM");
	Thread.sleep(5000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void dragTomcattoVM() throws AWTException
{
	try
	{
	Thread.sleep(1000);
	Robot robot=new Robot();
	robot.mouseMove(tomcatsoftware.getLocation().getX()+50,tomcatsoftware.getLocation().getY()+80);
	Thread.sleep(2000);
	robot.mousePress(InputEvent.BUTTON1_MASK);
	Thread.sleep(2000);
	robot.mouseMove(100,100);
	//Thread.sleep(5000);
	robot.mouseMove(430, 600);
	Thread.sleep(2000);
	robot.mouseMove(900, 500);
	Thread.sleep(2000);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
	System.out.println("dragged Tomcat software into vm-ten");
	hostport.clear();
	hostport.sendKeys("8084");
	System.out.println("entered port number as 8084");
	submitbutton.click();
	System.out.println("clicked on Apply button");
	System.out.println("Step7:Dragged Tomcat software into VM");
	Reporter.log("Step7:Dragged Tomcat software into VM");
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void dragSonarqubetoVM() throws AWTException
{
	try
	{
	Thread.sleep(1000);
	Robot robot=new Robot();
	robot.mouseMove(sonarqubesoftware.getLocation().getX()+50,sonarqubesoftware.getLocation().getY()+80);
	Thread.sleep(5000);
	robot.mousePress(InputEvent.BUTTON1_MASK);
	Thread.sleep(2000);
	robot.mouseMove(100,100);
	//Thread.sleep(5000);
	robot.mouseMove(430, 600);
	Thread.sleep(2000);
	robot.mouseMove(900, 500);
	Thread.sleep(2000);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);
	System.out.println("dragged Sonarqube software into vm-ten");
	hostport.clear();
	hostport.sendKeys("8085");
	System.out.println("entered port number as 8085");
	submitbutton.click();
	System.out.println("clicked on Apply button");
	System.out.println("Step8:Dragged Sonarqube software into VM");
	Reporter.log("Step8:Dragged Sonarqube software into VM");
	Thread.sleep(2000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickProvisionButton()
{
try 
{
provisionbutton.click();
System.out.println("clicked on provision button");
Reporter.log("clicked on provision button");
Thread.sleep(2000);
} 
catch (InterruptedException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}


public void clickConfirmProvisionButton()
{
	applychangesyesbutton.click();
	System.out.println("clicked on confirm provision button");
	Reporter.log("clicked on confirm provision button");
}

}
