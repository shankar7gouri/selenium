package excelUtils;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickOption {
	@Test
	public void toIdCaps() {
		System.setProperty("webdriver.chrome.driver", "/Divya/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		By locator=By.cssSelector("");
		WebDriverWait wait =new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement rightClickme=driver.findElement(locator);
		actions.contextClick(rightClickme).build().perform();
		WebElement c=driver.findElement(By.cssSelector(""));
		String GetText=c.getText();
		System.out.println(GetText);
		driver.close();
	}

}
