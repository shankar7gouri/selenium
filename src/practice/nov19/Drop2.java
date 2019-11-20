package practice.nov19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions shankar=new Actions(driver);
		//switch to frame.
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		shankar.pause(3000);
		WebElement dst=driver.findElement(By.id("droppable"));
		shankar.clickAndHold(source).moveToElement(dst).release().perform();
		if(dst.getText().contains("Dropp"))
		{
			System.out.println("drag and drop successfully");
		}
		else
		{
			System.out.println("drag and drop fail");
		}
		driver.switchTo().defaultContent();
		shankar.pause(3000);
		shankar.moveToElement(driver.findElement(By.linkText("Effect"))).click().perform();
		shankar.pause(7000);
		driver.close();
	}

}
