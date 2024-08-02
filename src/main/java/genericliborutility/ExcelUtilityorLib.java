package genericliborutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityorLib
/*
 * This method is used to read single data from excel
 */
{

	public String readDataFromExcel(String sheetName,int rowNum,int cellnum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IconStantUtility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rowNum).getCell(cellnum));
		return value;
	}

}
