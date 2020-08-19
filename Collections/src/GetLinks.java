import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinks {

	public static void main(String[] args) throws Throwable {
	//	System.setProperty("webdriver.chrome.driver", "‪D:\\11oclockselenium\\Collections\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int s=links.size();
		System.out.println("Print the no of linkes are threre on that web page \t\t::"+s);
		Thread.sleep(2000);
		for(int i=0;i<=s;i++) {
			//get the links text
			String linknmae=links.get(i).getText();
			System.out.println(linknmae);
			//get each link url
			String linkurl=links.get(i).getAttribute("href");
			Thread.sleep(2000);
			System.out.println(linknmae+"/n"+linkurl);
		}
	
	}

}
