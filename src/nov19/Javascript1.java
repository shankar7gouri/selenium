package nov19;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Javascript1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("document.location='https://flipkart.com'");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(5000);
		//print title of the page and length of the title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println("page title::" +pagetitle);
		System.out.println("page title length is::" +pagetitle.length());
		//print url of the page and length of the url
		String pageurl=js.executeScript("return document.URL").toString();
		System.out.println("page url::" +pageurl);
		System.out.println("page url length is::" +pageurl.length());
		//print domain name and length of domain
		String pagedomain=js.executeScript("return document.domain").toString();
		System.out.println("page domain::" +pagedomain);
		System.out.println("page domain length is::" +pagedomain.length());
		Thread.sleep(5000);
		driver.close();
	


	}

}
