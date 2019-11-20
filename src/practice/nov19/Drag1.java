package practice.nov19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag1{

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions snk=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		snk.dragAndDrop(source, dst).perform();
		Thread.sleep(10000);
		driver.close();

	}
}
