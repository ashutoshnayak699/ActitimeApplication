package actitme.genericlab;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	
	//from properties
		public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("E:\\selenium\\properties file\\demo.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
		}
		
		//from excelsheet
		public String getDataFromExcelsheet(String sheetname,int rownum,int cellnum)throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream("E:\\selenium\\typesofwork.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sh=book.getSheet(sheetname);
			DataFormatter format=new DataFormatter();
			String value=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
			return value;
		}

}
