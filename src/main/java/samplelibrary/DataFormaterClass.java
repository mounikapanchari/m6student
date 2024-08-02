package samplelibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFormaterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis =FileInputStream("D:\\SeleniumFolder\\");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sample");
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sh.getRow(4).getCell(1));
		System.out.println(value);

	}

}
