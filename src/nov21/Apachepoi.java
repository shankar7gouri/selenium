package nov21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apachepoi {

	public static void main(String[] args)throws Throwable {
		//read excell path
		FileInputStream fi=new FileInputStream("D://dummy1.xlsx");
		//get work book from file
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		//get sheet from workbook
		XSSFSheet ws=wb.getSheet("Login");  //give the name of the sheet
		//get the firstrow from sheet
		XSSFRow r=ws.getRow(0);
		//count no of  rows in a column
		int rc=ws.getLastRowNum();
		//count no of column
		int cc=r.getLastCellNum();
		System.out.println("no of rows are::"+rc+"  "+"no of columns"+cc);
		//print first column secondrow
		String username=ws.getRow(1).getCell(0).getStringCellValue();
		//print second column secomd row
		String password=ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username+"  "+password);
		fi.close();
		wb.close();
		
		

	}

}
