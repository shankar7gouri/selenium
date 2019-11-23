package nov20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().window().maximize();
		//store table
		WebElement table=driver.findElement(By.className("dataTable"));
		//get collection of rows in table
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		for(int i=1;i<rows.size();i++)
		{
			//get collecion of columns frome rows
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				//get cell data
				String celldata=cols.get(j).getText();
				System.out.println(celldata+"\n" );
			}
			System.out.println("\n"+"Row no"+i+"  "+"no of columns::"+cols.size());
			System.out.println("================================================");			
						
						
						
						
						
						
						
						
						
			}
		driver.close();
		}
		

	}


