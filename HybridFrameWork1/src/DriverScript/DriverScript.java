package DriverScript;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctionsLib.CommonfunctionsForOrangeHrm;
import utilities.ExcelUtil;

public class DriverScript {
	static WebDriver driver;
	static ExtentReports reports;
	static ExtentTest test;

	public static void main(String[] args) throws Throwable {
		ExcelUtil exl=new ExcelUtil();
		for(int i=1;i<=exl.rowCount("Orange");i++){
			String ModuleStatus="";
		
			if(exl.getdata("Orange", i, 2).equalsIgnoreCase("Y")){
				String TCModule=exl.getdata("Orange", i,1);
				reports=new ExtentReports("D:\\11oclockselenium\\HybridFrameWork1\\Reports\\Reports"+TCModule+CommonfunctionsForOrangeHrm.generateDate()+".html");
				test=reports.startTest(TCModule);
				for(int j=1;j<=exl.rowCount(TCModule);j++){
					String Description=exl.getdata(TCModule, j, 0);
					String Function_Name=exl.getdata(TCModule, j, 1);
					String Locator_Type=exl.getdata(TCModule, j, 2);
					String Locator_Value=exl.getdata(TCModule, j, 3);
					String Test_Data=exl.getdata(TCModule, j, 4);
					
					try{
					if(Function_Name.equalsIgnoreCase("startBrowser")){
						driver=CommonfunctionsForOrangeHrm.startBrowser();
						test.log(LogStatus.INFO, Description);
					}else
					if(Function_Name.equalsIgnoreCase("openApp")){
						CommonfunctionsForOrangeHrm.openApp(driver);
						test.log(LogStatus.INFO, Description);
					}else
					if(Function_Name.equalsIgnoreCase("waitForElement")){
						CommonfunctionsForOrangeHrm.waitForElement(driver, Locator_Type, Locator_Value, Test_Data);
						test.log(LogStatus.INFO, Description);
					}else
					if(Function_Name.equalsIgnoreCase("typeAction")){
						CommonfunctionsForOrangeHrm.typeAction(driver, Locator_Type, Locator_Value, Test_Data);
						test.log(LogStatus.INFO, Description);
					}else
					if(Function_Name.equalsIgnoreCase("clickAction")){
						CommonfunctionsForOrangeHrm.clickAction(driver, Locator_Type, Locator_Value);
						test.log(LogStatus.INFO, Description);
					}
					else if(Function_Name.equalsIgnoreCase("closebrw")){
						CommonfunctionsForOrangeHrm.closebrw(driver);
						test.log(LogStatus.INFO, Description);
					}
					
					exl.setData(TCModule, j, 5,"Pass");
					ModuleStatus="Pass";
					
				}catch(Exception e){
					exl.setData(TCModule, j, 5, "Fail");
					ModuleStatus="Fail";
					File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileHandler.copy(srcfile, new File("D:\\11oclockselenium\\HybridFrameWork1\\ScreenShots\\screenShot"+Description+CommonfunctionsForOrangeHrm.generateDate()+".png"));
					test.log(LogStatus.INFO, Description);
					break;
				}
			}
				if(ModuleStatus.equalsIgnoreCase("Pass")){
					exl.setData("Orange", i, 3, "Pass");
				}else{
					exl.setData("Orange", i, 3,"Fail");
				}
					
			}else{
				exl.setData("Orange", i, 3, "Not Executed");
			}
		
		}
		
	

	}

}
