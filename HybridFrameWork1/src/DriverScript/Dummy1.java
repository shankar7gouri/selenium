package DriverScript;

import java.io.File;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import commonFunctionsLib.CommonfunctionsForOrangeHrm;
import utilities.ExcelUtil;

public class Dummy1{
	static ExtentReports reports;
	static ExtentTest test;
	static WebDriver driver;
			
	
	public static void main(String[] args) throws Throwable {
		ExcelUtil exl1=new ExcelUtil();
		
		for(int i=1;i<=exl1.rowCount("Orange");i++){
			String ModuleStatus="";
			
			if(exl1.getdata("orange",i, 2).equalsIgnoreCase("Y")){
				String TCModule=exl1.getdata("Orange", i, 1);
				reports= new ExtentReports("D:\\11oclockselenium\\HybridFrameWork1\\Reports\\Orangereports"+TCModule+CommonfunctionsForOrangeHrm.generateDate()+".html");
				for(int j=1;j<=exl1.rowCount(TCModule);j++){
					String Description=exl1.getdata(TCModule, j, 0);
					String Function_Name=exl1.getdata(TCModule, j, 1);
					String Locator_Type=exl1.getdata(TCModule, j, 2);
					String Locator_Value=exl1.getdata(TCModule, j, 3);
					String Test_Data=exl1.getdata(TCModule, j, 4);
					try{
					if(Function_Name.equalsIgnoreCase("startBrowser")){
						driver=CommonfunctionsForOrangeHrm.startBrowser();
					}else
					if(Function_Name.equalsIgnoreCase("openApp")){
						CommonfunctionsForOrangeHrm.openApp(driver);
					}else
						if(Function_Name.equalsIgnoreCase("waitForElement")){
							CommonfunctionsForOrangeHrm.waitForElement(driver, Locator_Type, Locator_Value, Test_Data);
						}else
							if(Function_Name.equalsIgnoreCase("typeAction")){
								CommonfunctionsForOrangeHrm.typeAction(driver, Locator_Type, Locator_Value, Test_Data);
						}else
								if(Function_Name.equalsIgnoreCase("clickAction")){
									CommonfunctionsForOrangeHrm.clickAction(driver, Locator_Type, Locator_Value);
						}else
							if(Function_Name.equalsIgnoreCase("closebrw")){
								CommonfunctionsForOrangeHrm.closebrw(driver);
							}
					exl1.setData(TCModule, j, 5, "Pass");	
					ModuleStatus="Pass";
					}catch(Exception e){
						exl1.setData(TCModule, j, 5, "fail");
						ModuleStatus="Fail";
					File srfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileHandler.copy(srfile, new File("D:\\11oclockselenium\\HybridFrameWork1\\ScreenShots"+Description+CommonfunctionsForOrangeHrm.generateDate()+".png"));
					break;
					}
					}
				if(ModuleStatus.equalsIgnoreCase("Pass")){
					exl1.setData("Orange", i, 3, "Pass");
           }
				else{
					exl1.setData("Orange", i, 3, "Fail");
				}
			}else {
				exl1.setData("Orange", i, 3, "Not Executed");
		}


	}

}
}