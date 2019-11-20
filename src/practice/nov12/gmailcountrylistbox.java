package practice.nov12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class gmailcountrylistbox {

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504235901%7Ce%7Cfacebook%7C&placement=&creative=318504235901&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIqcPmq7fm5QIVQ4WPCh3m8wFXEAAYASAAEgJnVfD_BwE");
		driver.manage().window().maximize();
	    
		 Select countrylistbox=new Select(driver.findElement(By.id("year")));
		 boolean value=countrylistbox.isMultiple();
		 System.out.println(value);
		    List<WebElement>olist=countrylistbox.getOptions();
		    System.out.println("no of countries are available::"+olist.size());
		    for(int i=1;i<olist.size();i++)
		    {
		    	String countryname=olist.get(i).getText();
		    	System.out.println(countryname);
		    	olist.get(i).click();
		    }
	        driver.close();

	}

}
