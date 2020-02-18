package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtil {

	Workbook wb;
	public ExcelFileUtil() throws Exception{
			FileInputStream fi=new FileInputStream("D:\\11oclockselenium\\TP\\TestInput\\OrangeHremExcel1.xlsx");
			wb=new XSSFWorkbook(fi);
		
	}
	public int rowCount(String sheetname){
		return wb.getSheet(sheetname).getLastRowNum();
		}
	public int colCount(String sheetname){
		return wb.getSheet(sheetname).getRow(0).getLastCellNum();
		}
	public String getData(String sheetname,int row,int col){
	String data="";
		
		 if(wb.getSheet(sheetname).getRow(row).getCell(col).getCellType()==Cell.CELL_TYPE_NUMERIC){
			 int celldata=(int)wb.getSheet( sheetname).getRow(row).getCell(col).getNumericCellValue();
			 data =String.valueOf(celldata);
		 }else{
			data=wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
		 }
		 return data;
	}
	public void setData(String sheetname,int row,int col,String status) throws Exception{
		 Cell cell=wb.getSheet(sheetname).getRow(row).getCell(col);
		 cell.setCellValue(status);
		 if(status.equalsIgnoreCase("pass")){
			 CellStyle style=wb.createCellStyle();
			 Font font=wb.createFont();
			 style.setFont(font);
			 font.setBold(true);
			 font.setColor(IndexedColors.GREEN.getIndex());
			 cell.setCellStyle(style);
		 }
		 else if(status.equalsIgnoreCase("fail")){
			 CellStyle style=wb.createCellStyle();
			 Font font=wb.createFont();
			 style.setFont(font);
			 font.setBold(true);
			 font.setColor(IndexedColors.RED.getIndex());
			 cell.setCellStyle(style);
		 }
		 else if(status.equalsIgnoreCase("not executed")){
			 CellStyle style=wb.createCellStyle();
			 Font font=wb.createFont();
			 style.setFont(font);
			 font.setBold(true);
			 font.setColor(IndexedColors.BLUE.getIndex());
			 cell.setCellStyle(style);
		 }
		 FileOutputStream fo=new FileOutputStream("D:\\11oclockselenium\\TP\\TestOutput\\tprep.xlsx");
		 wb.write(fo);
		 fo.close();
		 
		
	}
}
