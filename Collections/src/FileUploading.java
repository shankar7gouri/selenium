import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploading {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		
		Actions actions=new Actions(driver);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		
		actions.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("guri");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("sankar");
		Thread.sleep(2000);
		WebElement choos=driver.findElement(By.id("menu_pim_addEmployee"));
		choos.click();
		Thread.sleep(3000);
		//Copy the file from my local drive
		StringSelection myfile=new StringSelection("C:\\Users\\SHANKAR\\Downloads\\file_example_JPG_100kB.jpg");
			//Storing the file in temporary memory
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myfile, null);
		Robot robot=new Robot();
		/* robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);*/
         
         robot.keyPress(KeyEvent.VK_TAB);
         robot.keyRelease(KeyEvent.VK_TAB);
         robot.keyPress(KeyEvent.VK_TAB);
         robot.keyRelease(KeyEvent.VK_TAB);
         
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
				
				
		/*
		choos.sendKeys("C:\\Users\\SHANKAR\\Downloads\\file_example_JPG_100kB.jpg");
		Thread.sleep(2000);*/
		driver.findElement(By.id("btnSave")).click();
		

	}

}
