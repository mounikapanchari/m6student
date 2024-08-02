package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import genericliborutility.JavaLibrary;
import objectRpository.CreateOrganizationPage;
import objectRpository.HomePage;
import objectRpository.OrganizationPage;

public class ORG_02 extends BaseClass{

	@Test(groups= {"smoke","sanity"})
	public void ORG02() throws Exception {
		JavaLibrary JUTIL=new JavaLibrary();
		 int num=JUTIL.generateRandomNumber(10000);
		ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
		String ORGNAME=EUTIL.readDataFromExcel   ("ORGANIZATIONS", 5, 1);
		String WEBSITE=EUTIL.readDataFromExcel("ORGANIZATIONS", 5, 2);
		String PHONO=EUTIL.readDataFromExcel("ORGANIZATIONS", 5, 3);
		String OTNO =EUTIL.readDataFromExcel("ORGANIZATIONS", 5, 4);
		String EID=EUTIL.readDataFromExcel("ORGANIZATIONS", 5, 5);
		HomePage hp=new HomePage(driver);
		hp.clickonorgnization();
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnCreateOrgButton();
		CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		cop.organizationoperation(ORGNAME+num,WEBSITE,PHONO,OTNO,EID);
		
Thread.sleep(3000);
		
	}
}
