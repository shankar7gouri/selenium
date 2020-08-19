import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_01 {
         public static void main(String[] args)throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.get("https://accounts.google.com/");
			driver.manage().window().maximize();
			String parent=driver.getWindowHandle();
			driver.findElement(By.linkText("Help")).click();
			Thread.sleep(2000);
			//driver.findElement(By.name("q")).sendKeys("Shankar");
			Thread.sleep(2000);
			//driver.switchTo().window(parent);
			driver.findElement(By.linkText("Privacy")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Terms")).click();
			Thread.sleep(2000);
			Set<String> allWin=driver.getWindowHandles();
			System.out.println(allWin);
		//String cW=driver.switchTo().window(allWin.g)
			for(String each:allWin) {
				if(!parent.equals(each)) {
					String mn=driver.switchTo().window(each).getTitle();
					System.out.println(mn);
					
					
				}
				
			}
		}
}
