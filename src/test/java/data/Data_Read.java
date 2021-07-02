package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.XLSBUnsupportedException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read {
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\Rajaneesh\\eclipse-workspace\\Data_Read\\Book1.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet sheetAt = w.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);

			Cell cell = row.getCell(1);
			System.out.println(cell);

		}
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(3);
			System.out.println(cell);

		}
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(4);
			System.out.println(cell);
			
		}
	}
}
