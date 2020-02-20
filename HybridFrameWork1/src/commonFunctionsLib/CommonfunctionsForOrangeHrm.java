package commonFunctionsLib;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.performance.Performance.SetTimeDomainTimeDomain;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Propertiesfile;

public class CommonfunctionsForOrangeHrm {
	static WebDriver driver;
	public static WebDriver startBrowser() throws Exception{
		if(Propertiesfile.getValueForKey("Browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\11oclockselenium\\HybridFrameWork1\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(Propertiesfile.getValueForKey("Browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\11oclockselenium\\HybridFrameWork1\\Drivers\\gecodriver.exe");
			driver=new FirefoxDriver();
		}else
		if(Propertiesfile.getValueForKey("Browser").equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver","D:\\11oclockselenium\\HybridFrameWork1\\Drivers\\iedriver.exe");
			driver=new InternetExplorerDriver();
		}
		return driver;
	}
	public static void openApp(WebDriver driver) throws Exception{
		driver.get(Propertiesfile.getValueForKey("Url"));
		driver.manage().window().maximize(); 
	}
	public static void waitForElement(WebDriver driver, String locatortype,String locatiorvalue,String waittime){
		WebDriverWait  mywait=new WebDriverWait(driver, Integer.parseInt(waittime));
		if(locatortype.equalsIgnoreCase("id")){
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatiorvalue)));
		}else if(locatortype.equalsIgnoreCase("name")){
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatiorvalue)));	
		}
		else if(locatortype.equalsIgnoreCase("xpath")){
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatiorvalue)));
		}
		else{
			System.out.println("unable to locate for waitForElement method with"+locatortype);
		}
	}
	public static void typeAction(WebDriver driver,String locatortype,String locatiorvalue,String testdata ){
		if(locatortype.equalsIgnoreCase("id")){
			driver.findElement(By.id(locatiorvalue)).clear();
			driver.findElement(By.id(locatiorvalue)).sendKeys(testdata);
		}
		else if(locatortype.equalsIgnoreCase("name")){
			driver.findElement(By.name(locatiorvalue)).clear();
			driver.findElement(By.name(locatiorvalue)).sendKeys(testdata);
		}
		else if(locatortype.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(locatiorvalue)).clear();
			driver.findElement(By.xpath(locatiorvalue)).sendKeys(testdata);
		}
		else{
			System.out.println("uanble to locate for typeAction method"+locatortype);
		}
	}
	public static void clickAction(WebDriver driver,String locatortype,String locatorvalue){
		if(locatortype.equalsIgnoreCase("id")){
			driver.findElement(By.id(locatorvalue)).click();
		}
		else if(locatortype.equalsIgnoreCase("name")){
			driver.findElement(By.name(locatorvalue)).click();
		}
		else if(locatortype.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(locatorvalue)).click();
		}else
			System.out.println("unable to locate for clickAction method"+locatortype);
	}
	public static void closebrw(WebDriver driver){
		driver.close();
	}
   public static String generateDate(){
	   Date d=new Date();
	   SimpleDateFormat sdf=new SimpleDateFormat("YYYY_MM_DD_hh_mm_ss");
	   String requiredDate=sdf.format(d);
	   return requiredDate;
   }
   public static void slectAction(WebDriver driver,String locatortype,String locatorvalue,String testdata){
		if(locatortype.equalsIgnoreCase("id")){
		Select list=	new Select(driver.findElement(By.id(locatorvalue)));
		list.selectByVisibleText(testdata);
		}
		else if(locatortype.equalsIgnoreCase("xpath")){
		Select list3=	new Select(driver.findElement(By.xpath(locatorvalue)));
		list3.selectByVisibleText(testdata);
		}
		else if(locatortype.equalsIgnoreCase("name")){
		Select list1=	new Select(driver.findElement(By.name(locatorvalue)));
		list1.selectByVisibleText(testdata);
		}else{
			System.out.println("Unable to locate for selectaction method with"+locatortype);
		}
}
}
