package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import genericliborutility.JavaLibrary;
import objectRpository.CreateOrganizationPage;
import objectRpository.HomePage;
import objectRpository.LeadPage;
import objectRpository.OrganizationPage;

public class ORG_01 extends BaseClass{
	@Test(groups= {"smoke","regression"})
	public void ORG01() throws Exception {
		JavaLibrary JUTIL=new JavaLibrary();
		 int num=JUTIL.generateRandomNumber(10000);
		ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
		String ORGNAME=EUTIL.readDataFromExcel   ("ORGANIZATIONS", 2, 1);
		String WEBSITE=EUTIL.readDataFromExcel("ORGANIZATIONS", 2, 2);
		String EMP=EUTIL.readDataFromExcel("ORGANIZATIONS", 2, 3);
		HomePage hp=new HomePage(driver);
		hp.clickonorgnization();
		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnCreateOrgButton();
		CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		cop.organizationoperation(ORGNAME+num,WEBSITE,EMP);
		

		
	}
	
		
		

}
