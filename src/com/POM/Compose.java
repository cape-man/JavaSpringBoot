package com.POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;
import org.openqa.selenium.server.RobotRetriever;
import org.openqa.selenium.server.SpecialCommand;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;








import autoitx4java.AutoItX;

public class Compose 
{
	@FindBy(xpath="//span[contains(text(),'SERVER')]")
	private WebElement server;
	
	@FindBy(xpath="//span[contains(text(),'CONFIG')]")
	private WebElement config;
	
	@FindBy(xpath="//span[contains(text(),'BUILD')]")
	private WebElement build;
	
	@FindBy(xpath="//span[contains(text(),'RUN')]")
	private WebElement run;
	
	@FindBy(xpath="//span[contains(text(),'DEPLOY')]")
	private WebElement deploy;
	
	@FindBy(xpath="//span[contains(text(),'TEST')]")
	private WebElement test;
	
	@FindBy(xpath="//span[contains(text(),'PLAN')]")
	private WebElement plan;
	
	@FindBy(xpath = "(//img[@class='logo'])[1]")
	private WebElement webservercomponent;

	@FindBy(xpath = "//div[contains(text(),'Build Tool')]")
	private WebElement buildtoolcomponent;

	@FindBy(xpath="//div[contains(text(),'Continuous Integration')]")
	private WebElement cicdcomponent;
	
	@FindBy(xpath="//div[contains(text(),'Release Manager')]")
	private WebElement releasemanagercomponent;

	@FindBy(xpath = "//div[contains(text(),'Application Server')]")
	private WebElement applicationservercomponent;

	@FindBy(xpath = "//div[contains(text(),'Version Control')]")
	private WebElement versioncontrolcomponent;

	@FindBy(xpath = "//div[contains(text(),'Code Quality')]")
	private WebElement codequalitycomponent;
	
	@FindBy(xpath="//div[contains(text(),'Application Testing')]")
	private WebElement applicationtestingcomponent;

	@FindBy(xpath = "//b[contains(text(),'Jenkins 2.7')]/../../..//button[contains(text(),'Provision')]")
	private WebElement jenkinsprovisionbutton;
	
	@FindBy(xpath = "//b[contains(text(),'Jenkins 2.7')]/../../..//button[contains(text(),'Connect')]")
	private WebElement jenkinsconnectbutton;
	
	@FindBy(xpath="//b[contains(text(),'Octopus Deploy')]/../../..//button[contains(text(),'Connect')]")
	private WebElement octopusdeployconnectbutton;
	
	@FindBy(xpath="//b[contains(text(),'VSTS')]/../../..//button[contains(text(),'Connect')]")
	private WebElement vstsconnectbutton;
	
	@FindBy(xpath="//b[contains(text(),'Selenium Hybrid Framework')]/../../..//button[text()='Connect']")
	private WebElement seleniumhybridframeworkconnectbutton;
	
	@FindBy(xpath="//b[contains(text(),'SonarQube 6.0')]/../../..//button[contains(text(),'Provision')]")
	private WebElement sonarqubeprovisionbutton;
	
	@FindBy(xpath="//b[contains(text(),'Tomcat 9.0')]/../../..//button[contains(text(),'Provision')]")
	private WebElement tomcatprovisionbutton;

	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement savebutton;

	@FindBy(xpath = "//b[text()='Tomcat 8.0']")
	private WebElement tomcat8;

	@FindBy(xpath = "//*[text()='Jenkins 2.7']")
	private WebElement highlightjenkins;

	@FindBy(xpath = "//b[contains(text(),'GitHub')]/../../..//button[contains(text(),'Connect')]")
	private WebElement githubconnectbutton;

	@FindBy(xpath = "//b[text()='GitHub']")
	private WebElement github;

	@FindBy(xpath = "//b[text()='SonarQube 6.0']")
	private WebElement sonarqube6;
	
	@FindBy(xpath="//b[contains(text(),'Maven')]/../../..//button[contains(text(),'Select')]")
	private WebElement mavenselectbutton;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(id="instanceName")
	private WebElement instancename;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='swProjectName']")
	private WebElement jenkinsprojectname;
	
	@FindBy(xpath="//input[@value='OK']")
	private WebElement okbutton;
	
	@FindBy(xpath="//input[@placeholder='Search Component']")
	private WebElement searchcomponentfield;
	
	@FindBy(xpath="(//button[@class='zoom-controller-btn'])[3]")
	private WebElement zoomoutbutton;
	
	@FindBy(xpath="(//button[@class='zoom-controller-btn'])[1]")
	private WebElement zoominbutton;
	
	@FindBy(xpath="//input[@id='swProjectName']")
	private WebElement sonarqubeprojectname;
	
	@FindBy(xpath="//input[@id='url']")
	private WebElement urlfield;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement usernamefield;
	
	@FindBy(xpath="//input[@id='apiToken']")
	private WebElement apitokenfield;
	
	@FindBy(xpath="//input[@id='vstsDefinitionName']")
	private WebElement definitionnamefield;

	private WebDriver driver;

	public Compose(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void clickServer()
	{
		try {
		server.click();
		System.out.println("clicked on SERVER");
		Reporter.log("clicked on SERVER");
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickConfig()
	{
		config.click();
		System.out.println("clicked on CONFIG");
		Reporter.log("clicked on CONFIG");
	}
	
	public void clickBuild()
	{
		try {
		build.click();
		System.out.println("clicked on BUILD");
		Reporter.log("clicked on BUILD");
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickRun()
	{
		run.click();
		System.out.println("clicked on RUN");
		Reporter.log("clicked on RUN");
	}
	
	public void clickDeploy()
	{
		try {
		deploy.click();
		System.out.println("clicked on DEPLOY");
		Reporter.log("clicked on DEPLOY");
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickTest()
	{
		test.click();
		System.out.println("clicked on TEST");
		Reporter.log("clicked on TEST");
	}
	
	public void clickPlan()
	{
		plan.click();
		System.out.println("clicked on PLAN");
		Reporter.log("clicked on PLAN");
	}
	
	

public void dragMavenAndSelect(int x, int y) throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		robot.mouseMove(buildtoolcomponent.getLocation().getX()+50, buildtoolcomponent.getLocation().getY()+85);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330,600);
		Thread.sleep(1000);
		robot.mouseMove(x,y);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged buildtool component into canvas");
		Reporter.log("dragged buildtool component into canvas");
		Thread.sleep(1000);
		mavenselectbutton.click();
		System.out.println("clicked on maven select button");
		Reporter.log("clicked on maven select button");
		Thread.sleep(1000);
		Reporter.log("Step6:Dragged Build Tool Component and selected Maven");
		System.out.println("Step6:Dragged Build Tool Component and selected Maven");
	}

	public void dragJenkinsAndProvision(int x, int y) throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		robot.mouseMove(cicdcomponent.getLocation().getX()+50, cicdcomponent.getLocation().getY()+80);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330, 600);
		Thread.sleep(1000);
		robot.mouseMove(x,y);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged cicd component into canvas");
		Reporter.log("dragged cicd component into canvas");
		Thread.sleep(2000);
		jenkinsprovisionbutton.click();
		System.out.println("clicked on provision button of jenkins software");
		Reporter.log("clicked on provision button of jenkins software");
		Thread.sleep(1000);
		instancename.sendKeys("automation");
		System.out.println("entered instance name for jenkins 2.7");
		Reporter.log("entered instance name for jenkins 2.7");
		jenkinsprojectname.sendKeys("Automation Project");
		System.out.println("entered project name for jenkins 2.7");
		Reporter.log("entered project name for jenkins 2.7");
		Thread.sleep(1000);
		submitbutton.click();
		Thread.sleep(1000);
		Reporter.log("Step10:Dragged cicd  component and selected Jenkins 2.7 software");
		System.out.println("Step10:Dragged cicd  component and selected Jenkins 2.7 software");
	}
	
	public void dragJenkinsAndConnect(int x, int y) throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		robot.mouseMove(cicdcomponent.getLocation().getX()+50, cicdcomponent.getLocation().getY()+80);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330, 600);
		Thread.sleep(1000);
		robot.mouseMove(x, y);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged cicd component into canvas");
		Reporter.log("dragged cicd component into canvas");
		Thread.sleep(2000);
		jenkinsconnectbutton.click();
		System.out.println("clicked on connect button of jenkins software");
		Reporter.log("clicked on connect button of jenkins software");
		Thread.sleep(1000);
		instancename.sendKeys("automation");
		System.out.println("entered instance name for jenkins 2.7");
		Reporter.log("entered instance name for jenkins 2.7");
		jenkinsprojectname.sendKeys("Automation Project");
		System.out.println("entered project name for jenkins 2.7");
		Reporter.log("entered project name for jenkins 2.7");
		Thread.sleep(1000);
		submitbutton.click();
		Thread.sleep(1000);
		Reporter.log("Step10:Dragged cicd  component and selected Jenkins 2.7 software");
		System.out.println("Step10:Dragged cicd  component and selected Jenkins 2.7 software");
	}

	public void dragTomcatAndProvision() throws AWTException, InterruptedException {
		Robot robot=new Robot();
		robot.mouseMove(applicationservercomponent.getLocation().getX()+50, applicationservercomponent.getLocation().getY()+95);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330, 600);
		Thread.sleep(1000);
		robot.mouseMove(1030, 600);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged application server component into canvas");
		Reporter.log("dragged application server component into canvas");
		Thread.sleep(2000);
		tomcatprovisionbutton.click();
		System.out.println("clicked on provision button of tomcat");
		Reporter.log("clicked on provision button of tomcat");
		Thread.sleep(1000);
		instancename.sendKeys("Automation-Tomcat");
		System.out.println("entered instance name for tomcat software");
		Reporter.log("entered instance name for tomcat software");
		Thread.sleep(1000);
		submitbutton.click();
		Thread.sleep(1000);
		Reporter.log("Step10:Dragged ApplicationServer component and selected Tomcat 9.0 software");
		System.out.println("Step10:Dragged ApplicationServer component and selected Tomcat 9.0 software");
		Thread.sleep(5000);
	}
	
	public void zoomIn()
	{
		zoominbutton.click();
		System.out.println("zoom in is done");
		Reporter.log("zoom in is done");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		zoominbutton.click();
		System.out.println("zoom in is done");
		Reporter.log("zoom in is done");
	}
	
	public void zoomOut()
	{
		zoomoutbutton.click();
		System.out.println("zoom out is done");
		Reporter.log("zoom out is done");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		zoomoutbutton.click();
		System.out.println("zoom out is done");
		Reporter.log("zoom out is done");
	}

	public void dragGitHubAndConnect(int x, int y, String gitrepositoryurl, String accesstoken) throws AWTException, InterruptedException {
		Robot robot=new Robot();
		robot.mouseMove(versioncontrolcomponent.getLocation().getX()+50, versioncontrolcomponent.getLocation().getY()+85);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330, 600);
		Thread.sleep(1000);
		robot.mouseMove(x,y);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged versioncontrol component into canvas");
		Reporter.log("dragged versioncontrol component into canvas");
		Thread.sleep(1000);
		githubconnectbutton.click();
		System.out.println("clicked on connect button of github");
		Reporter.log("clicked on connect button of github");
		instancename.sendKeys("automation");
		System.out.println("entered instance name for github");
		Reporter.log("entered instance name for github");
		urlfield.clear();
		urlfield.sendKeys(gitrepositoryurl);
		System.out.println("entered git repository url");
		Reporter.log("entered git repository url");
		password.clear();
		password.sendKeys(accesstoken);
		System.out.println("entered password for github");
		Reporter.log("entered password for github");
		submitbutton.click();
		System.out.println("clicked on submit button");
		Reporter.log("clicked on submit button");
		Thread.sleep(3000);
		Reporter.log("Step7:Dragged Version Control component and selected GitHub software");
		System.out.println("Step7:Dragged Version Control component and selected GitHub software");
	}

	public void dragSonarQubeAndProvision(int x, int y) throws AWTException, InterruptedException {
		Robot robot=new Robot();
		robot.mouseMove(codequalitycomponent.getLocation().getX()+50, codequalitycomponent.getLocation().getY()+80);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330, 600);
		Thread.sleep(1000);
		robot.mouseMove(x,y);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged code quality component into canvas");
		Reporter.log("dragged code quality component into canvas");
		Thread.sleep(1000);
		sonarqubeprovisionbutton.click();
		Thread.sleep(1000);
		instancename.sendKeys("automation");
		System.out.println("entered instance name for sonarqube");
		Reporter.log("entered instance name for sonarqube");
		Thread.sleep(1000);
		sonarqubeprojectname.sendKeys("Automation Project");
		submitbutton.click();
		Thread.sleep(1000);
		Reporter.log("Step8:Dragged Code Quality component and selected SonarQube6.0 software");
		System.out.println("Step8:Dragged Code Quality component and selected SonarQube6.0 software");
	}
	
	public void dragOctopusDeployAndConnect() throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		robot.mouseMove(releasemanagercomponent.getLocation().getX()+50, releasemanagercomponent.getLocation().getY()+80);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330, 600);
		Thread.sleep(1000);
		robot.mouseMove(805, 520);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged release manager component into canvas");
		Reporter.log("dragged release manager component into canvas");
		Thread.sleep(2000);
		octopusdeployconnectbutton.click();
		System.out.println("clicked on connect button of octopus deploy software");
		Reporter.log("clicked on connect button of octopus deploy software");
		Thread.sleep(1000);
		instancename.sendKeys("Automation-Octopus");
		System.out.println("entered instance name for octopus deploy");
		Reporter.log("entered instance name for octopus deploy");
		Thread.sleep(1000);
		submitbutton.click();
		Reporter.log("Dragged release manager component and selected octopus deploy software");
		System.out.println("Dragged release manager component and selected octopus deploy software");
		Thread.sleep(2000);
	}
	
	public void dragVSTSAndConnect() throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		robot.mouseMove(cicdcomponent.getLocation().getX()+50, cicdcomponent.getLocation().getY()+80);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330, 600);
		Thread.sleep(1000);
		robot.mouseMove(805, 410);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged continuous integration component into canvas");
		Reporter.log("dragged continuous integration component into canvas");
		Thread.sleep(2000);
		vstsconnectbutton.click();
		System.out.println("clicked on connect button of vsts software");
		Reporter.log("clicked on connect button of vsts software");
		Thread.sleep(1000);
		instancename.sendKeys("Automation-vsts");
		System.out.println("entered instance name for vsts");
		Reporter.log("entered instance name for vsts");
		Thread.sleep(1000);
		urlfield.clear();
		urlfield.sendKeys("https://cape-dev-team.visualstudio.com");
		System.out.println("entered url for vsts");
		Reporter.log("entered url for vsts");
		Thread.sleep(1000);
		usernamefield.clear();
		usernamefield.sendKeys("cape.devteam@gmail.com");
		System.out.println("entered username for vsts");
		Reporter.log("entered username for vsts");
		Thread.sleep(1000);
		apitokenfield.clear();
		apitokenfield.sendKeys("ii3r6qyle3sy3q7ejj46ynsvt2m4uhdotnje4veavzzewh44562q");
		System.out.println("entered apitoken for vsts");
		Reporter.log("entered apitoken for vsts");
		Thread.sleep(1000);
		definitionnamefield.clear();
		definitionnamefield.sendKeys("sss");
		System.out.println("entered definition name for vsts");
		Reporter.log("entered definition name for vsts");
		Thread.sleep(1000);
		submitbutton.click();
		Reporter.log("Dragged continuous integration component and connected to vsts software");
		System.out.println("Dragged continuous integration component and connected to vsts software");
		Thread.sleep(3000);
	}
	
	
	public void dragSeleniumHybridFramewprkAndConnect(int x, int y) throws AWTException, InterruptedException
	{
		Robot robot=new Robot();
		robot.mouseMove(applicationtestingcomponent.getLocation().getX()+50, applicationtestingcomponent.getLocation().getY()+80);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		robot.mouseMove(330, 600);
		Thread.sleep(1000);
		robot.mouseMove(x,y);
		Thread.sleep(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("dragged application testing component into canvas");
		Reporter.log("dragged application testing component into canvas");
		Thread.sleep(2000);
		seleniumhybridframeworkconnectbutton.click();
		System.out.println("clicked on connect button of vsts software");
		Reporter.log("clicked on connect button of vsts software");
		Thread.sleep(1000);
		instancename.sendKeys("Automation-vsts");
		System.out.println("entered instance name for vsts");
		Reporter.log("entered instance name for vsts");
		Thread.sleep(1000);
		urlfield.clear();
		urlfield.sendKeys("https://cape-dev-team.visualstudio.com");
		System.out.println("entered url for vsts");
		Reporter.log("entered url for vsts");
		Thread.sleep(1000);
		usernamefield.clear();
		usernamefield.sendKeys("cape.devteam@gmail.com");
		System.out.println("entered username for vsts");
		Reporter.log("entered username for vsts");
		Thread.sleep(1000);
		apitokenfield.clear();
		apitokenfield.sendKeys("ii3r6qyle3sy3q7ejj46ynsvt2m4uhdotnje4veavzzewh44562q");
		System.out.println("entered apitoken for vsts");
		Reporter.log("entered apitoken for vsts");
		Thread.sleep(1000);
		definitionnamefield.clear();
		definitionnamefield.sendKeys("sss");
		System.out.println("entered definition name for vsts");
		Reporter.log("entered definition name for vsts");
		Thread.sleep(1000);
		submitbutton.click();
		Reporter.log("Dragged continuous integration component and connected to vsts software");
		System.out.println("Dragged continuous integration component and connected to vsts software");
		Thread.sleep(3000);
	}

	public void integrateComponents() throws AWTException, InterruptedException 
	{
		Robot robot=new Robot();
		robot.mouseMove(600, 300);
		Thread.sleep(2000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(2000);
		robot.mouseMove(550, 300);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(2000);
		System.out.println("panning to left is done");
		Reporter.log("panning to left is done");
		
		Robot robot1=new Robot();
		robot1.mouseMove(driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getX()+30,driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getY()+80);
		//robot1.mouseMove(driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getX()+50,driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getY()+50);
		System.out.println("moved mouse on to jenkins");
		Reporter.log("moved mouse on to jenkins");
		Thread.sleep(4000);
		//robot1.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getX()+15, driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getY()+82);
		//above step is for linux
		//robot1.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][5]/*[name()='g'][3]/*[name()='circle']")).getLocation().getX()+20,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][5]/*[name()='g'][3]/*[name()='circle']")).getLocation().getY()+140);
		robot1.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getX()+5, driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getY()+110);
		//above step is for windows
		System.out.println("moved mouse on to jenkins circle");
		Reporter.log("moved mouse on to jenkins circle");
		robot1.mousePress(InputEvent.BUTTON1_MASK);
		System.out.println("mousepress");
		Reporter.log("mousepress");
		//robot1.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getX()+15,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getY()+82);
		//robot1.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getX()+20,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getY()+140);
		//robot1.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getX()+5,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getY()+110);
		robot1.mouseMove(1030, 600);
		System.out.println("moved the mouse on to tomcat");
		robot1.mouseRelease(InputEvent.BUTTON1_MASK);
		System.out.println("mouse release");
		Thread.sleep(2000);
		savebutton.click();
		System.out.println("clicked on save button");
		Reporter.log("Step11:Integrated Tomcat and Jenkins");
		System.out.println("Step11:Integrated Tomcat and Jenkins");
		
		
		Robot robot2=new Robot();
		robot2.mouseMove(driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getX()+30,driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getY()+80);
		Thread.sleep(2000);	
		//robot2.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][5]/*[name()='g'][4]/*[name()='circle']")).getLocation().getX()+20,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][5]/*[name()='g'][4]/*[name()='circle']")).getLocation().getY()+140);
		//robot2.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getX()+15, driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getY()+82);
		//above step is for linux
		robot2.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getX()+5, driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getY()+110);
		//above step is for windows
		robot2.mousePress(InputEvent.BUTTON1_MASK);
		//robot2.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][2]/*[name()='g'][5]/*[name()='g'][2]/*[name()='circle']")).getLocation().getX()+20,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][2]/*[name()='g'][5]/*[name()='g'][2]/*[name()='circle']")).getLocation().getY()+140);
		//robot2.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][2]/*[name()='g'][5]/*[name()='g'][2]/*[name()='circle']")).getLocation().getX()+15,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][2]/*[name()='g'][5]/*[name()='g'][2]/*[name()='circle']")).getLocation().getY()+82);
		//robot2.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][2]/*[name()='g'][5]/*[name()='g'][2]/*[name()='circle']")).getLocation().getX()+5,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][2]/*[name()='g'][5]/*[name()='g'][2]/*[name()='circle']")).getLocation().getY()+110);
		robot2.mouseMove(430,300);
		robot2.mouseRelease(InputEvent.BUTTON1_MASK);
		savebutton.click();
		Reporter.log("Step13:Integrated Jenkins and Maven");
		System.out.println("Step13:Integrated Jenkins and Maven");
		
		
		Robot robot3=new Robot();
		robot3.mouseMove(driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getX()+50,driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getY()+80);
		Thread.sleep(2000);	
		//robot3.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][5]/*[name()='g'][2]/*[name()='circle']")).getLocation().getX()+20,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][5]/*[name()='g'][2]/*[name()='circle']")).getLocation().getY()+140);
		//robot3.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getX()+15, driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getY()+82);
		//above step is for linux
		robot3.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getX()+5, driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getY()+110);
		//above step is for windows
		robot3.mousePress(InputEvent.BUTTON1_MASK);
		//robot3.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][4]/*[name()='circle']")).getLocation().getX()+20,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][4]/*[name()='circle']")).getLocation().getY()+140);
		//robot3.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][4]/*[name()='circle']")).getLocation().getX()+15,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][4]/*[name()='circle']")).getLocation().getY()+82);
		//robot3.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][4]/*[name()='circle']")).getLocation().getX()+5,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][3]/*[name()='g'][5]/*[name()='g'][4]/*[name()='circle']")).getLocation().getY()+110);
		robot3.mouseMove(1050, 300);
		robot3.mouseRelease(InputEvent.BUTTON1_MASK);
		savebutton.click();
		Reporter.log("Step14:Integrated Jenkins and GitHub");
		System.out.println("Step14:Integrated Jenkins and GitHub");
		
		
		Robot robot4=new Robot();
		robot4.mouseMove(driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getX()+50,driver.findElement(By.xpath("//*[text()='Jenkins 2.7']")).getLocation().getY()+80);
		Thread.sleep(2000);	
		//robot4.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][5]/*[name()='g'][3]/*[name()='circle']")).getLocation().getX()+20,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][1]/*[name()='g'][5]/*[name()='g'][3]/*[name()='circle']")).getLocation().getY()+138);
		//robot4.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getX()+15, driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getY()+80);
		//above step is for linux
		robot4.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getX()+5, driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][1]/*[name()='g']/*[name()='g']/*[name()='circle']")).getLocation().getY()+110);
		//above step is for windows
		robot4.mousePress(InputEvent.BUTTON1_MASK);
		//robot4.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][4]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getX()+20,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][4]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getY()+140);
		//robot4.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][4]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getX()+15,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][4]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getY()+82);
		//robot4.mouseMove(driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][4]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getX()+5,driver.findElement(By.xpath("//div[@id='logicalViewDrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][3]/*[name()='g'][4]/*[name()='g'][5]/*[name()='g'][1]/*[name()='circle']")).getLocation().getY()+110);
		robot4.mouseMove(630, 600);
		robot4.mouseRelease(InputEvent.BUTTON1_MASK);
		savebutton.click();
		Thread.sleep(2000);
		Reporter.log("Step15:Integrated Jenkins and SonarQube");
		System.out.println("Step15:Integrated Jenkins and SonarQube");
	}
}
