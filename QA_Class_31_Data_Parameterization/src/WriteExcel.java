import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Workbook wb = new XSSFWorkbook();
		Sheet s1 = wb.createSheet("Sheet 1");
		Sheet s2 = wb.createSheet("Sheet 2");
		Sheet s3 = wb.createSheet("Sheet 3");
		
		Row r1 = s1.createRow(0);
		Row r2 = s1.createRow(1);
		Row r3 = s1.createRow(2);
		
		Cell c1 = r1.createCell(0);
		Cell c2 = r1.createCell(1);
		Cell c3 = r1.createCell(2);
		Cell c4 = r1.createCell(3);
		Cell c5 = r1.createCell(4);
		
		c1.setCellValue(12345);
		c2.setCellValue(12.36);
		c3.setCellValue("Test");
		c4.setCellValue("Sample");

		
		try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA- 10th May 2024\\QA_Class_31_Data_Parameterization\\src\\TestSuite\\Test1.xlsx")) {
		    wb.write(fileOut);
		}
	}

}
