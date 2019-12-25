package DriverFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Datadriven {
	String inputpath="D:\\11oclockselenium\\New folder\\FrameWork_Selenium\\TextInput\\excelllogin.xlsx";
	String outputpath="D:\\11oclockselenium\\New folder\\FrameWork_Selenium\\TextOutput\\LogInDataResults.xlsx";
	WebDriver driver;
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet ws;
	XSSFRow row;
	ExtentReports report;
	ExtentTest test;
	File screen;
	@BeforeTest
	public void setUp()
	{
		//genarate html report
		report=new ExtentReports("./Report/Login.Html");
		System.setProperty("WebDriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
			}
	@Test 
	public void loIgn() throws Throwable 
	{
		fi=new FileInputStream(inputpath);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet("Login");
		row=ws.getRow(0);
		int rc=ws.getLastRowNum();
		int cc=row.getLastCellNum();
		Reporter.log("no of rows are::"+rc+"  "+"no of columns are::"+cc);
		for(int i=1;i<=rc;i++)
		{
			//Start test cases to genarte report
			test=report.startTest("verify login");
			driver.get("http://orangehrm.qedgetech.com/");
			driver.manage().window().maximize();
			String usernsme=ws.getRow(i).getCell(0).getStringCellValue();
			String password=ws.getRow(i).getCell(1).getStringCellValue();
			//login app
			driver.findElement(By.name("txtUsername")).sendKeys(usernsme);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			if(driver.getCurrentUrl().contains("dash"))
			{
				screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screen, new File("D:\\11oclockselenium\\New folder\\FrameWork_Selenium\\screens\\iteration"+i+"Loginpage.png"));
				Reporter.log("Login success",true);
				//write as login success into results column
				ws.getRow(i).getCell(2).setCellValue("Login success");
				//write as pass  into status column
				ws.getRow(i).getCell(3).setCellValue("pass");
				test.log(LogStatus.PASS, "login success");
			}
			else
			{
			screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen, new File("D:\\11oclockselenium\\New folder\\FrameWork_Selenium\\screens"+i+"Loginpage.png"));
			Reporter.log("login fail",true);
			//get error message
			String message=driver.findElement(By.id("spanMessage")).getText();
			//write as error message into results column
			ws.getRow(i).createCell(2).setCellValue(message);
			ws.getRow(i).createCell(3).setCellValue("fail");
			test.log(LogStatus.FAIL, message);
			}
			report.endTest(test);
			report.flush();
		}
		
		}
	@AfterTest
	public void tearDown() throws Throwable
	{
		fi.close();
		fo=new FileOutputStream(outputpath);
		wb.write(fo);
		fo.close();
		wb.close();
			
		driver.close();
			
	
		}

	}



