package genericliborutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataFromExcel {

	public void writedatainexcel(String Sheetname,int rowNum,int cellNum,String value)throws Exception
	{
		
		FileInputStream fis=new FileInputStream(IconStantUtility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh =book.getSheet(Sheetname);
		sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(IconStantUtility.excelpath);
		book.write(fos);
			
		}

	}


