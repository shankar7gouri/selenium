package nov19;

import java.util.List;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class Table1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\qedgetable.html");
		driver.manage().window().maximize();
		// get sapecific data from table
		String tabletext=driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).getText();
		System.out.println(tabletext);
		//store table into webelement
		WebElement table=driver.findElement(By.name("qedgetech"));
		//count no of rows in table
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		for(int i=1;i<rows.size();i++)
		{
			//get collection of columns in each row
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				
			}
		System.out.println("Row no::"+i+"  "+"column no::"+cols.size());
		
		}
		
		driver.close();
	}

}
