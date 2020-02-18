package driverScript;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonFunctions.FunctionLibrary;
import utility.ExcelFileUtil;

public class DriverScript {
	static ExtentReports report;
	static ExtentTest test;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception{
	
			ExcelFileUtil excel=new ExcelFileUtil();
			
			for(int i=1;i<=excel.rowCount("MainTestcases");i++){  
				
				String ModuleStatus="";
				
				if(excel.getData("MainTestcases", i, 2).equalsIgnoreCase("Y")){
					
					String TCModule=excel.getData("MainTestcases", i, 1);
					
					report=new ExtentReports("D:\\11oclockselenium\\TP\\Reports\\TPReports"+TCModule+FunctionLibrary.generateDate()+".html");
					
					test=report.startTest(TCModule);
					for(int j=1;j<=excel.rowCount(TCModule);j++){
						
						String Description=excel.getData(TCModule, j, 0);
						String Function_Name=excel.getData(TCModule, j, 1);
						String Locator_Type=excel.getData(TCModule, j, 2);
						String Locator_Value=excel.getData(TCModule, j, 3);
						String Test_Data=excel.getData(TCModule, j, 4);
						try{
							if(Function_Name.equalsIgnoreCase("startBrowser")){
							      driver = FunctionLibrary.startBrowser();
							      test.log(LogStatus.INFO, Description);
							}else if(Function_Name.equalsIgnoreCase("openApplication")){
								 FunctionLibrary.openApplication(driver);
								 test.log(LogStatus.INFO, Description);
							}else if(Function_Name.equalsIgnoreCase("waitForElement")){
								FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, Test_Data);
								test.log(LogStatus.INFO, Description);
							}else if(Function_Name.equalsIgnoreCase("typeAction")){
								FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, Test_Data);
								test.log(LogStatus.INFO, Description);
							}else if(Function_Name.equalsIgnoreCase("clickAction")){
								FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
								test.log(LogStatus.INFO, Description);
							}
							else if(Function_Name.equalsIgnoreCase("slectAction")){
								FunctionLibrary.slectAction(driver, Locator_Type, Locator_Value, Test_Data);
								test.log(LogStatus.INFO, Description);
							}
							else if(Function_Name.equalsIgnoreCase("closeBrowser")){
								FunctionLibrary.closeBrowser(driver);
								test.log(LogStatus.INFO, Description);
							}
							excel.setData(TCModule, j, 5, "PASS");
							ModuleStatus="PASS";
							test.log(LogStatus.PASS, Description);
							
						}catch(Exception e){
							excel.setData(TCModule, j, 5, "FAIL");
							ModuleStatus="FAIL";
							File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						FileHandler.copy(srcFile, new File("D:\\11oclockselenium\\TP\\Screenshots\\TP"+Description+FunctionLibrary.generateDate()+".png"));
						test.log(LogStatus.FAIL, Description);
							break;
						}		
					}
					
					if(ModuleStatus.equalsIgnoreCase("PASS")){
						excel.setData("MainTestcases", i, 3, "PASS");
					}else{
						excel.setData("MainTestcases", i, 3, "FAIL");
					}
					
					report.endTest(test);
	               report.flush();
					
				}else{
					excel.setData("MainTestcases", i, 3, "Not Executed");
				}
				
				
			}

		}
	}


