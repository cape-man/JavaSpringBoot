package com.canvashomepage.scripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.POM.Common;
import com.google.common.collect.ImmutableMap;
import com.library.Generic;
import com.sun.jna.platform.win32.OaIdl.DATE;

public class BaseTest
{
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	public  static Map<String, Object[]> testresult;
	public static WebDriver driver;
	
@BeforeTest
public void preCondition()
{
	String browser=Generic.getConfigData("BROWSER");
	if(browser.equals("GC"))
	{
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(capabilities);
		System.out.println("Chrome Browser is opened");
		Reporter.log("Chrome Browser is opened");
	}
	else if(browser.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", "./exe/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//String url=Generic.getConfigData("URL");
	String url = System.getenv("URL");
	System.getProperties();
	driver.get(url);
	System.out.println("url is opened");
	Reporter.log("url is opened");
	driver.navigate().refresh();
}
@AfterTest
public void postCondition()
{	
	driver.quit();
	System.out.println("Browser is closed");
	Reporter.log("Browser is closed");
}

/*@AfterMethod
public void logOut()
{
	Common common=new Common(driver);
	common.logOut();
}*/

@BeforeTest
public void openExcel()
{
	workbook=new HSSFWorkbook();
	 sheet = workbook.createSheet("Result");
	testresult = new LinkedHashMap<String, Object[]>();
	testresult.put("1",new Object[]{"Test Case ID","Test Case Name","Test Case Description","Status","Timestamp","Priority","Module","Environment","Version","Duration","Browser","Operating System","Tester","Build Number"});
}

@AfterTest
public void closeExcel()
{
	Set<String> keyset = testresult.keySet();
	int rownum=0;
	for(String key:keyset)
	{
		HSSFRow row = sheet.createRow(rownum++);
		Object[] arr = testresult.get(key);
		int cellnum=0;
		for(Object ar:arr)
		{
			HSSFCell cell = row.createCell(cellnum++);
			if(ar instanceof Date)
				cell.setCellValue((Date)ar);
			else if(ar instanceof Boolean)
				cell.setCellValue((Boolean)ar);
			else if(ar instanceof String)
				cell.setCellValue((String)ar);
			else if (ar instanceof Double)
				cell.setCellValue((Double)ar);
			else if (ar instanceof Long)
				cell.setCellValue((Long)ar);
		}
	}
	
	try 
	{
	//FileOutputStream out=new FileOutputStream(new File("C:\\Program Files (x86)\\Nginx\\html\\TestReports\\TestResult.xls"));
	FileOutputStream out=new FileOutputStream(new File("./xls/TestResult.xls"));
	workbook.write(out);
	out.close();
	}
	catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

