package nov19;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotclass1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions snk=new Actions(driver);
		snk.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		ArrayList<String>allwins=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allwins.get(1));
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		ArrayList<String>allwins1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allwins1.get(2));
		
		
	}

}
