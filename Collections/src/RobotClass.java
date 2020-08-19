import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, Throwable {
	//	System.setProperty("webdriver.firefox.driver", "D:\\11oclockselenium\\Collections\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		Thread.sleep(3000);
		
		StringSelection myfile=new StringSelection("‪‪‪C:\\Users\\SHANKAR\\Downloads\\GitNotesForProfessionals.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myfile, null);
		Robot robot=new Robot();
		robot.setAutoDelay(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(4000);
		robot.keyRelease	(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		System.out.println("A");
		robot.setAutoDelay(4000);
		
		/*robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("B");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		System.out.println("C");*/
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("E");
		
	/*	driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[2]")).sendKeys("9010702840");
	*/
		
		

	}

}
