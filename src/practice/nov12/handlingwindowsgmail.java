package practice.nov12;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingwindowsgmail {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fwww.google.com%3Fhl%3Den-US&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
	    String parent=driver.getWindowHandle();
	    System.out.println("parent web page id::"+parent);
	   
        driver.findElement(By.partialLinkText("Help")).click();
        driver.findElement(By.partialLinkText("Priva")).click();
        driver.findElement(By.partialLinkText("Terms")).click();
        Set<String>allwindows=driver.getWindowHandles();
        System.out.println("all windowes are::"+allwindows);
        for(String each:allwindows)
        {
        	if(!parent.equals(each))
        	{
        		String pagetitle=driver.switchTo().window(each).getTitle();
        		System.out.println(pagetitle);
        		driver.close();
        	}
        }
       
        driver.switchTo().window(parent);
        driver.findElement(By.name("identifier")).sendKeys("shankar");
        	    }
      
        
	}


