package dataDriverFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

public String readExceldata(String excelPath, String SheetName, int rowcount, int cellcount) throws EncryptedDocumentException, IOException {
		// create parameter
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);//go to specified sheet
		Row row = sh.getRow(rowcount);// go to specified row
		Cell cell = row.getCell(cellcount);//go to specified column
		String data = cell.getStringCellValue();//get the data from cell
		return data;
		
 }
	//to count the no of rows
	public int getRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException 

	{
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	int rc = sh.getLastRowNum();
	return rc;
	}
	
	//generic reusable method to write the data in excel file
	
	public void writeDataExcel(String excelPath, String sheetName, int rowCount, int cellCount, Date data) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
	}


}
