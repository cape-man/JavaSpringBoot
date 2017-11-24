package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DeleteTag extends BaseTest
{
@Test
public void testDeleteTag()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	System.out.println("clicked on sync database");
	Reporter.log("clicked on sync database");
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Tags']")).click();
	System.out.println("clicked on tags");
	Reporter.log("clicked on tags");
	driver.findElement(By.xpath("//td[contains(text(),'Tag Name Updated')]/..//a[text()='Delete']")).click();
	System.out.println("clicked on deleted ");
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully deleted Tag.']")).isDisplayed())
	{
		status="Passed";
	}
	else
	{
		status="Failed";
	}
	Object[] testdetails=new Object[]{"TD6_dotnetApplication","Delete Tag","User should be able to delete the tag",status,(new Date()).getTime(),"1","Delete Tag Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("7", testdetails);
}
}
