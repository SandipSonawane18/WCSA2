package DataReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make file ready to read the data
		Sheet sh = wb.getSheet("bikesnfo");//go to specified sheet
		Row row = sh.getRow(3);// go to specified row
		Cell cell = row.getCell(0);//go to specified column
		String data = cell.getStringCellValue();//get the data from cell
		System.out.println(data);

	}
}
