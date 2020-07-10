package excelUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DivyaExcel {
	
	Workbook wb;
	public DivyaExcel() throws IOException {
		FileInputStream fi=new FileInputStream(" ");
		wb=new XSSFWorkbook(fi);
	}
	public int rowCount(String sheetname) {
		return wb.getSheet(sheetname).getLastRowNum();
	}
	public int colCount(String sheetname) {
		return wb.getSheet(sheetname).getRow(0).getLastCellNum();
	}
	public String getData(String sheetname,int row,int col) {
		String data = null;
		if(wb.getSheet(sheetname).getRow(row).getCell(col).getCellType()==Cell.CELL_TYPE_NUMERIC) {
			int cellData=(int)wb.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
			data=String.valueOf(cellData);
		}else {
		     data=wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
		}
		return data ;
		
	}
	public void setData(String sheetaname,int row,int col,String status ) throws IOException {
		Cell cell=wb.getSheet(sheetaname).getRow(row).getCell(col);
		cell.setCellValue(status);
		if(status.equalsIgnoreCase("Pass")) {
			CellStyle style=wb.createCellStyle();
			Font font=wb.createFont();
			style.setFont(font);
			font.setBold(true);
			font.setColor(IndexedColors.GREEN.getIndex());
			cell.setCellStyle(style);
		}
		else if(status.equalsIgnoreCase("Fail")){
			CellStyle style=wb.createCellStyle();
			Font font=wb.createFont();
			style.setFont(font);
			font.setBold(true);
			font.setColor(IndexedColors.RED.getIndex());
			cell.setCellStyle(style);
		}else if(status.equalsIgnoreCase("Not Executed")) {
			CellStyle style=wb.createCellStyle();
			Font font=wb.createFont();
			style.setFont(font);
			font.setBold(true);
			font.setColor(IndexedColors.BLUE.getIndex());
			cell.setCellStyle(style);
		}
		FileOutputStream fo=new FileOutputStream("");
		wb.write(fo);
		fo.close();
		
	}

}
