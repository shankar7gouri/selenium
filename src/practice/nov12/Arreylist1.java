package practice.nov12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Arreylist1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		Iterator<String>x=allwindows.iterator();
		while (x.hasNext())
		{
			String child=x.next();
			if(!parent.equals(child))
				
			{
				
				String pagetitle=driver.switchTo().window(child).getTitle();
				driver.manage().window().maximize();
				System.out.println(pagetitle);
				driver.close();
				
					}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']"));
		Thread.sleep(3000);
		driver.findElement(By.name("userType"));
		Thread.sleep(3000);
		/*driver.findElement(By.name("fname")).sendKeys("shankar");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("shankar441007");
		Thread.sleep(3000);
		driver.findElement(By.name("number")).sendKeys("8099406451");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("8099406451");
		Thread.sleep(3000);
		Select city=new Select(driver.findElement(By.id("city")));
		Thread.sleep(3000);
		city.selectByVisibleText("Chennai");
		Thread.sleep(3000);*/
		driver.close();
		

	}

}
