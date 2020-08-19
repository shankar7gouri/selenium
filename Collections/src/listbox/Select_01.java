package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_01 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//store the list box
		
		Select daylist=new Select(driver.findElement(By.id("day")));
     List<WebElement> dList=daylist.getOptions();
     int ni=dList.size();
     System.out.println("Print no of itemes in the daylist::"+ni);
     System.out.println();
     
	daylist.selectByIndex(20);
	Thread.sleep(2000);
	daylist.selectByValue("23");
	Thread.sleep(2000);
	daylist.selectByVisibleText("25");
	Thread.sleep(2000);
	for (int i=0;i<=ni;i++ ) {
		String pvalue=dList.get(i).getText();
		System.out.println("Print the values from the dayList box::"+pvalue);
		dList.get(i).click();
	}
	
	Select mList=new Select(driver.findElement(By.id("month")));
	   List<WebElement> mnList=mList.getOptions();
	     int mi=mnList.size();
	     System.out.println("Print no of itemes in the daylist::"+mi);
	     System.out.println();
	
	mList.selectByIndex(10);
	Thread.sleep(2000);
	mList.selectByVisibleText("Sept");
	Thread.sleep(2000);
	//mList.selectByValue("Jan");
	Thread.sleep(2000);
	for (int j=0;j<=mi;j++ ) {
		String pvalue_01=mnList.get(j).getText();
		System.out.println("Print the values from the dayList box::"+pvalue_01);
	}
	
	Select yList=new Select(driver.findElement(By.id("year")));
	   List<WebElement> yeList=yList.getOptions();
	     int yi=yeList.size();
	     System.out.println("Print no of itemes in the daylist::"+yi);
	     System.out.println();
	yList.selectByIndex(20);
	Thread.sleep(2000);
	yList.selectByVisibleText("1993");
	Thread.sleep(2000);
	yList.selectByValue("2020");
	for (int k=0;k<=yi;k++ ) {
		String pvalue_02=yeList.get(k).getText();
		System.out.println("Print the values from the dayList box::"+pvalue_02);
	}
	
	
		

	}

}
