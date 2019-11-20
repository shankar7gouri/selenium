package practice.nov12;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.escape.Escaper;

public class Xrpath2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.ESCAPE ).build().perform();
		//driver.switchTo().frame(0);
		WebElement babykids=driver.findElement(By.xpath("//span[contains(text(),'Baby & Kids')]"));
		ac.moveToElement(babykids).perform();
		ac.pause(3000);
		WebElement crocs=driver.findElement(By.xpath("//li[5]//ul[1]//li[1]//ul[1]//li[5]//ul[1]//li[9]//a[1]"));
		ac.moveToElement(crocs).click();
		ac.pause(3000).perform();
		System.out.println(driver.getTitle());
		
		
		
	}

}
