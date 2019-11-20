package practice.nov12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.css.util.ThrowCssExceptionErrorHandler;
//import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Handlingwindows {
	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
        driver.get("https://irctc.co.in/nget/train-search");	
        driver.manage().window().maximize();
        String parent=driver.getWindowHandle();
        System.out.println("parent window id::"+parent);
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
        driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
        driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
        driver.findElement(By.xpath("//span[contains(@class,'allcircle circlefour')]")).click();
        driver.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();
        driver.findElement(By.xpath("//span[@class='allcircle circlesix']")).click();
        //driver.findElement(By.xpath("//span[@class='allcircle circleseven']")).click();
        driver.findElement(By.xpath("//span[@class='allcircle circleight']")).click();
       // driver.findElement(By.xpath("//span[@class='allcircle circlenine']")).click();
        Set<String>allwinddows=driver.getWindowHandles();
        //Set<String>allwindows=driver.getWindowHandles();
        System.out.println(allwinddows);
        for(String each:allwinddows)
        {
        	if(!parent.equals(each))
        	{
        		String pagetitle=driver.switchTo().window(each).getTitle();
        		Thread.sleep(30);
        		System.out.println(pagetitle);
        		//Thread.sleep(30);
        		driver.close();
        		//Thread.sleep(30);
        		
        	}
        }
        driver.switchTo().window(parent);
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("shankar");
        Thread.sleep(3000);
    driver.close();
        
		
		
	
}
}
