package nov19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Javascript2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//url launch
		js.executeScript("document.location='https://flipkart.com'");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		//scroll top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll down to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		WebElement contactus=driver.findElement(By.linkText("Contact Us"));
		contactus.click();
		Thread.sleep(5000);
		//scroll vertical to certain pixel
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		driver.close();
	}

}
