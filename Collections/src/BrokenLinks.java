import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Launch the ChromeBrowser
		 WebDriver driver=new ChromeDriver();
		 
		 //maximize the window
		 driver.manage().window().maximize();
		 
		 //Implicit wait for 10 sec
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //Launch the url
		 driver.get("");
		 
		 //Capture links from a webpage
        List<WebElement> links=driver.findElements(By.tagName("a"));
        
        //count the no of links
        int noofLinks=links.size();
        
        for(int i=0;i<=noofLinks;i++) {
        	
        	//By using href attribute we can get Url of required links
        	String getallLinks=links.get(i).getAttribute("href");
        	
        	//Get all the links
        	System.out.println(getallLinks);
        	
        	
        	URL url=new URL(getallLinks);
        	
        	//Create connection using url object 'url'
        	HttpURLConnection connection=(HttpURLConnection)url.openConnection();
        	
        	//wait for  2 sec
        	Thread.sleep(2000);
        	
        	//establish connection
        	connection.connect();
        	
        	// It returns the responce code. if responce code is above 400=its a broken link
        	int respCode=connection.getResponseCode();
        	
        	if(respCode>=400) {
        		System.out.println(links+" - "+" it is the broken link");
        	}
        	else
        	{
        		System.out.println(links+" - "+" It's Valid link");
        	}
        	
        	
        }
        
        
	}

}
