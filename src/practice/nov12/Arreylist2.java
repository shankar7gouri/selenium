package practice.nov12;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arreylist2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		//click of flight,stay,rail
		driver.findElement(By.id("flight")).click();
		driver.findElement(By.id("stayIcon")).click();
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		driver.findElement(By.id("eCaterinIcon")).click();
		driver.findElement(By.id("//li[@id='eCaterinIcon']")).click();
		ArrayList<String>shank=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(shank);
				String title1=driver.switchTo().window(shank.get(1)).getTitle();
				Thread.sleep(3000);
				System.out.println(title1);
				driver.close();
				String title2=driver.switchTo().window(shank.get(2)).getTitle();
				Thread.sleep(3000);
				System.out.println(title2);
				driver.close();
				String title3=driver.switchTo().window(shank.get(3)).getTitle();
				Thread.sleep(3000);
				System.out.println(title3);
				driver.close();
				String title4=driver.switchTo().window(shank.get(0)).getTitle();
				Thread.sleep(3000);
				System.out.println(title4);
				driver.close();
				String title5=driver.switchTo().window(shank.get(4)).getTitle();
				Thread.sleep(3000);
				System.out.println(title5);
				driver.close();

				


	}

}
