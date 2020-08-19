import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowsHandles {

	public static void main(String[] args)throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	actions.sendKeys(Keys.ESCAPE);
	Thread.sleep(3000);
	actions.moveToElement(driver.findElement(By.xpath("(//*[@class='_1QZ6fC _3Lgyp8'])[4]"))).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='_1KCOnI _3ZgIXy']//a[contains(text(),'Bras')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='_2mylT6'])[19]")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Women Balconette Lightly Padded Bra")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='_2LFGJH']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='_2mylT6 _3Ockxk']")).click();
	Thread.sleep(5000);
	
	ArrayList<String> allwin=new ArrayList<String>(driver.getWindowHandles());
	System.out.println("get all windows id's \n"+allwin);
	Thread.sleep(2000);
	
	
	String bras_01=driver.switchTo().window(allwin.get(1)).getTitle();
	System.out.println(bras_01);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='_1TJldG _2I_hq9 _2UBURg'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	Thread.sleep(5000);
	
/*	String bras_02=driver.switchTo().window(allwin.get(2)).getTitle();
	System.out.println(bras_02);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='_1TJldG _2I_hq9 _2UBURg'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	Thread.sleep(5000);*/
	}
	}
