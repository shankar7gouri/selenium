package nov21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apachepoi2 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("‪‪‪D:\\excel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Login");
		int rc=ws.getLastRowNum();
		System.out.println("no of rows are::"+rc);
		for(int i=1;i<rc;i++)
		{
			String user=ws.getRow(i).getCell(0).getStringCellValue();
			String pass=ws.getRow(i).getCell(1).getStringCellValue();
		}
		
		

	}

}
