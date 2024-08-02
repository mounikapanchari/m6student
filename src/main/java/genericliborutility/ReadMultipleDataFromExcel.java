package genericliborutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.crypto.Data;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 
 /*
  * this is generic method for fetch multiple data from excel
  * @param sheetName
  * @param startingRow
  * @param starting Cell
  * @throw Exception
  */
public class ReadMultipleDataFromExcel {

	public  void readmultipledatafromexcel(String sheetname,int firtstRownum,int firstcellnum) throws Exception {
		
FileInputStream fis=new FileInputStream(IconStantUtility.excelpath);
Workbook book=WorkbookFactory.create(fis);
Sheet sh=book.getSheet(sheetname);
DataFormatter format=new DataFormatter();
for(int i =firtstRownum;i<=sh.getLastRowNum();i++)
{
	Row r=sh.getRow(i);
	for(int j=firstcellnum;j<=r.getLastCellNum()-1;j++)
	{
		String values=format.formatCellValue(r.getCell(j));
		System.out.println(values);
	}
	}
}



}
	


