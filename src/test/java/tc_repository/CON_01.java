package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import genericliborutility.JavaLibrary;
import objectRpository.Contacts;
import objectRpository.CreatingContact;
import objectRpository.CreatingLeadLPage;
import objectRpository.HomePage;
import objectRpository.LeadPage;

public class CON_01 extends BaseClass{
	@Test(retryAnalyzer= genericliborutility.RetryAnalyzerImplimentationClass.class)

	public void con01Tc() throws Exception {
		
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(10000);
		ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
		String FNAME=EUTIL.readDataFromExcel("CONTACTS", 2, 1);
		String LNAME=EUTIL.readDataFromExcel("CONTACTS",2,2);
		String TITLE=EUTIL.readDataFromExcel("CONTACTS",2,3);
		
		HomePage hp=new HomePage(driver);
		hp.clickOCONTACTS();
		Contacts cp=new Contacts(driver);
		cp.clickOnCreateContactButton();
		CreatingContact CC=new CreatingContact(driver);
		CC.CreatingContact(FNAME+num,LNAME,TITLE);
		System.out.println("CON01 excecution successful");

		Thread.sleep(3000);
}
}
