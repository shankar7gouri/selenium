package practice.nov19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropby {

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
		int x = dst.getLocation().getX();
		int y = dst.getLocation().getY();
		shankar.dragAndDropBy(source, x, y).release().perform();
		//shankar.clickAndHold(source).moveToElement(dst).release().perform();
		driver.close();
	}

}
