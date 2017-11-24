package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class CreatePost extends BaseTest
{
@Test
public void testCreatePost()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	System.out.println("clicked on sync database");
	Reporter.log("clicked on sync database");
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Posts']")).click();
	System.out.println("clicked on posts");
	Reporter.log("clicked on posts");
	driver.findElement(By.linkText("Create New Post")).click();
	System.out.println("clicked on create new post");
	Reporter.log("clicked on create new post");
	driver.findElement(By.id("Title")).sendKeys("Post Title");
	System.out.println("entered title for post");
	Reporter.log("entered title for post");
	driver.findElement(By.id("Content")).sendKeys("Post Content");
	System.out.println("entered content for post");
	Reporter.log("entered content for post");
	Select select1=new Select(driver.findElement(By.id("Bloggers_SelectedValue")));
	select1.selectByValue("12354");
	System.out.println("selected the blogger");
	Reporter.log("selected the blogger");
	Select select2=new Select(driver.findElement(By.id("UserChosenTags_FinalSelection")));
	select2.selectByValue("16734");
	System.out.println("selected the tag");
	Reporter.log("selected the tag");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	System.out.println("clicked on create button");
	Reporter.log("clicked on create button");
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully created Post.']")).isDisplayed())
	{
		status="Pass";
		System.out.println("New Post is created successfully");
		Reporter.log("New Post is created successfully");
	}
	else
	{
		status="Failed";
	}
	Object[] testdetails=new Object[]{"TD1_dotnetApplication","Create Post","User should be able to create a new post",status,(new Date()).getTime(),"1","Create Post Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("2", testdetails);
}
}
