package myExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyXLReadCode {
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	
	public static String stringDataRead(int row, int col) throws IOException
	{
		f=new FileInputStream("C:\\Users\\rahul\\Desktop\\Book1.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(row);
		Cell c = r.getCell(col);
		return c.getStringCellValue();
	}
	
	public static String integerDataRead(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\rahul\\Desktop\\Book1.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(row);
		Cell c = r.getCell(col);
		int a=(int)c.getNumericCellValue();
		return String.valueOf(a);
	}
	
}
