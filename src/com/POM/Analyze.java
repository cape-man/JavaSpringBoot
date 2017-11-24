package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Analyze 
{
	@FindBy(linkText="ANALYZE")
	private WebElement analyzelink;
	
	private WebDriver driver;
	
	public Analyze(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void clickAnalyzeTab()
	{
		analyzelink.click();
		System.out.println("clicked on analyze tab");
		Reporter.log("clicked on analyze tab");
	}
	
	public Boolean isAnalyzeTabEnabled()
	{
		boolean a = analyzelink.isEnabled();
		return a;
	}
	
	
	public void clickCustomView(String viewname)
	{	WebElement customview = driver.findElement(By.xpath("//div[text()='"+viewname+"']"));
		if(customview.isDisplayed())
		{
		customview.click();
		System.out.println("clicked on custom view: "+viewname);
		Reporter.log("clicked on custom view: "+viewname);
		}
		else
		{
			while(!customview.isDisplayed())
			{
				Actions actions=new Actions(driver);
				actions.moveToElement(driver.findElement(By.xpath("//img[@src='assets/images/right-arrow.svg']"))).clickAndHold().build().perform();
				System.out.println("clicking on right scroll");
				Reporter.log("clicking on right scroll");
			}
			customview.click();
			System.out.println("clicked on custom view: "+viewname);
			Reporter.log("clicked on custom view: "+viewname);
		}
	}
	
	
}
