package keywordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
//read the data
	public String readexceldata(String excelPath, String SheetName, int rowcount, int cellcount) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);//go to specified sheet
		Row row = sh.getRow(rowcount);// go to specified row
		Cell cell = row.getCell(cellcount);//go to specified column
		String data = cell.getStringCellValue();//get the data from cell
		return data;
		
 }
	// to get the row count from excel
public int getRowCount(String excelPath, String SheetName) throws EncryptedDocumentException, IOException 
{
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(SheetName);//go to specified sheet
	int rc= sh.getLastRowNum();// go to specified row
	return rc;
	
}
// write the data from excel file

public void writeExceldata(String excelPath, String SheetName, int rowcount, int cellCount, Date data) throws EncryptedDocumentException, IOException 
{
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(SheetName);//go to specified sheet
	Row row = sh.getRow(rowcount);
	
	Cell cell = row.createCell(cellCount);
	cell.setCellValue(data);
	
	FileOutputStream fos=new FileOutputStream(excelPath);
	wb.write(fos);
	
}
// read data property file

public String readPropertFile(String propPath,String key) throws IOException 
{
	FileInputStream fis = new FileInputStream(propPath);
	Properties prop = new Properties();
	prop.load(fis);
	String value = prop.getProperty(key);
	return value;
	
 }	
}



