package practice.nov11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelected {

	public static void main(String[] args)throws Throwable {
		//System.setProperty("webdriver",
				WebDriver driver =new ChromeDriver();
				driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Select branchlistbox = new Select(driver.findElement(By.id("drlist")));
		branchlistbox.selectByVisibleText("ameerpet");
		Thread.sleep(3000);
		Select branchlistbox =new Select(driver.findElement(By.id("")));
		

	}

}
