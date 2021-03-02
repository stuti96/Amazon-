package Firstpackage;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public void readExcel() throws Exception {
		File f = new File("C:\\Users\\STUTI\\Excel data\\TestExcel.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
		String data = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Excel data  " + data);
		wb.close();

	}

	public void multipleData() throws Exception {

		File f = new File("C:\\Users\\STUTI\\Excel data\\TestExcel.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(1);
		// get total no of rows
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		for (int i=0;i<rowcount;i++)
		{
			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
		}
		wb.close();
	}

	public static void main(String[] args) throws Exception {

		LearnExcel le = new LearnExcel();
		le.readExcel();
		le.multipleData();

	}

}
