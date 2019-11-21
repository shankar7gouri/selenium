package nov19;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("document.location='http://orangehrm.qedgetech.com/'");
		driver.manage().window().maximize();
		js.executeScript("document.querySelector('#txtUsername').value='test'");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@'");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(3000);
		String url=js.executeScript("return document.URL").toString();
		if(url.contains("dash"))
		{
			System.out.println("Login success");
		}
		else
		{
			String msg=js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
			System.out.println(msg+"   "+ "login fail");
			Thread.sleep(3000);
		}
		driver.close();
	}

}
