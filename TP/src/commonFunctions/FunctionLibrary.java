package commonFunctions;



import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.PropertyFileUtil;



public class FunctionLibrary {
  
	
	
	 static WebDriver driver;
		
		public static WebDriver startBrowser() throws Exception{
			
			if(PropertyFileUtil.getvalueforkey("Browser").equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "D:\\11oclockselenium\\TP\\Drivers\\chromedriver.exe");
				 driver =new ChromeDriver();	
			}else if(PropertyFileUtil.getvalueforkey("Browser").equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "D:\\11oclockselenium\\TP\\Drivers\\geckodriver.exe");
				 driver =new FirefoxDriver();
			}
			
			return driver;
		}
					
		public static void openApplication(WebDriver driver) throws Exception{
			driver.get(PropertyFileUtil.getvalueforkey("Url"));	
			driver.manage().window().maximize();
		}
		
		public static void waitForElement(WebDriver driver,String locatortype,
			String locatorvalue,String waittitme){
			
			WebDriverWait mywait=new WebDriverWait(driver, Integer.parseInt(waittitme));
			if(locatortype.equalsIgnoreCase("id")){
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
			}else
			if(locatortype.equalsIgnoreCase("xpath")){
				mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));
			}else if(locatortype.equalsIgnoreCase("name")){
				mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
			}else
			{
			System.out.println("unable to locate for waitForElement method with "+locatortype);
			}			
		}
		
		public static void typeAction(WebDriver driver,String locatortype,
				String locatorvalue,String testdata){
			
			if(locatortype.equalsIgnoreCase("id")){
				driver.findElement(By.id(locatorvalue)).clear();
				driver.findElement(By.id(locatorvalue)).sendKeys(testdata);
			}else
			
			if(locatortype.equalsIgnoreCase("xpath")){
					driver.findElement(By.xpath(locatorvalue)).clear();
					driver.findElement(By.xpath(locatorvalue)).sendKeys(testdata);
			}else
			
			if(locatortype.equalsIgnoreCase("name")){
					driver.findElement(By.name(locatorvalue)).clear();
					driver.findElement(By.name(locatorvalue)).sendKeys(testdata);
			}else
			{
				System.out.println("unable to locate for typeAction method with "+locatortype);
			}	
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
		public static void clickAction(WebDriver driver,String locatortype,String locatorvalue){
				
			
			if(locatortype.equalsIgnoreCase("id")){
				driver.findElement(By.id(locatorvalue)).click();
			}else
			
			if(locatortype.equalsIgnoreCase("xpath")){
				driver.findElement(By.xpath(locatorvalue)).click();
			}else
			
			if(locatortype.equalsIgnoreCase("name")){
				driver.findElement(By.name(locatorvalue)).click();
			}else
			{
				System.out.println("unable to locate for typeAction method with "+locatortype);
			}	
			
		}
		
		public static void closeBrowser(WebDriver driver){
			driver.close();
		}

	public static String generateDate(){
		Date d=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("YYYY_MM_DD_hh_mm_ss");
		String RequiredDate=sf.format(d);
		return RequiredDate;
		
	}
}
