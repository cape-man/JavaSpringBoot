package com.servicenowwakeup.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ServiceNow 
{
@Test
public void wakeupServiceNow()
{
//System.setProperty("webdriver.chrome.driver", "/home/capeuser/chromedriver");
System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
driver.get("https://developer.servicenow.com/app.do#!/home");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.linkText("Log In")).click();
System.out.println("Step1: clicked login link");
driver.findElement(By.id("username")).sendKeys("abhics2410@gmail.com");
driver.findElement(By.id("password")).sendKeys("Capeuser@2018");
driver.findElement(By.id("submitButton")).click();
System.out.println("Step2: Entered credentials and clicked on submit button");
try {
	Thread.sleep(15000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Actions actions=new Actions(driver);
actions.moveToElement(driver.findElement(By.id("a_manage"))).perform();
driver.findElement(By.linkText("Instance")).click();
System.out.println("Step3: Navigated to Manage and clicked on Instance");
try {
	Thread.sleep(20000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//span[text()='Yes, wake instance']")).click();
System.out.println("Step4: Clicked on wakeup instance button");
}
}
