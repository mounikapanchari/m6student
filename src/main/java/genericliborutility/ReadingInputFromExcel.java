package genericliborutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingInputFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\SeleniumFolder\\Excel\\leads.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sample");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		String value=c.getStringCellValue();
		//String value=sh.getRow(3).getcell(2).getString
		//cellvalue();
		System.out.println(value);
		

	}

	
	
	
		
	}

}
