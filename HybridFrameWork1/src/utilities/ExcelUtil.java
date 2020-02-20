package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtil {
	Workbook wb;
	
	public ExcelUtil() throws Exception{
		FileInputStream fi=new FileInputStream("D:\\11oclockselenium\\HybridFrameWork1\\TestInput\\OrangeHremfile.xlsx");
		wb=new XSSFWorkbook(fi);
	}
	public int rowCount(String sheetname){
		return wb.getSheet(sheetname).getLastRowNum();
	}
	public int colCount(String sheetname){
		return wb.getSheet(sheetname).getRow(0).getLastCellNum();
	}
	public String getdata(String sheetname,int row , int  cell){
		String data="";
		if(wb.getSheet(sheetname).getRow(row).getCell(cell).getCellType()==Cell.CELL_TYPE_NUMERIC){
		           int celldata= (int)  wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		           data=String.valueOf(celldata);
		}else 
		{
			data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
			
		}
		return data;
		
	}
	public void setData(String sheetnam,int row , int cell,String status) throws Throwable{
		Cell name=wb.getSheet(sheetnam).getRow(row).getCell(cell);
		
		name.setCellValue(status);
		Thread.sleep(3000);
		if(status.equalsIgnoreCase("Pass")){
			CellStyle style=wb.createCellStyle();
			Font font=wb.createFont();
			font.setColor(IndexedColors.GREEN.getIndex());
			font.setItalic(true);
			style.setFont(font);
			name.setCellStyle(style);
			Thread.sleep(3000);
		}
		else if(status.equalsIgnoreCase("Fail")){
			CellStyle style=wb.createCellStyle();
			Font font=wb.createFont();
			font.setColor(IndexedColors.RED.getIndex());
			font.setItalic(true);
			style.setFont(font);
			name.setCellStyle(style);
			Thread.sleep(3000);
		}
		else if(status.equalsIgnoreCase("Not Executed")){
			CellStyle style=wb.createCellStyle();
			Font font=wb.createFont();
			font.setColor(IndexedColors.BLUE.getIndex());
			font.setItalic(true);
			style.setFont(font);
			name.setCellStyle(style);
			
		}
		FileOutputStream output=new FileOutputStream("D:\\11oclockselenium\\HybridFrameWork1\\TestOutput\\orng.xlsx");
		wb.write(output);
		output.close();
		
		
	}

}
