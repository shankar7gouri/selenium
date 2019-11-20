package practice.nov12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String alertmessge=driver.switchTo().alert().getText();
		System.out.println(alertmessge);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		driver.quit();

	}

}

