package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import genericliborutility.JavaLibrary;
import objectRpository.CreateOrganizationPage;
import objectRpository.HomePage;
import objectRpository.OrganizationPage;

public class ORG_4 extends BaseClass{
		@Test(groups= {"regression"})
		public void ORG01() throws Exception {
			JavaLibrary JUTIL=new JavaLibrary();
			int num=JUTIL.generateRandomNumber(10000);
			ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
			String ORGNAME=EUTIL.readDataFromExcel   ("ORGANIZATIONS", 11, 1);
			String WEBSITE=EUTIL.readDataFromExcel("ORGANIZATIONS", 11, 2);
			String EMP=EUTIL.readDataFromExcel("ORGANIZATIONS", 11, 3);
			String PHONO=EUTIL.readDataFromExcel("ORGANIZATIONS", 11, 4);
			String OTNO =EUTIL.readDataFromExcel("ORGANIZATIONS", 11, 5);
			String EID=EUTIL.readDataFromExcel("ORGANIZATIONS", 11, 6);
			String ADD=EUTIL.readDataFromExcel("ORGANIZATIONS", 11, 7);
			String CITY=EUTIL.readDataFromExcel("ORGANIZATIONS", 11, 8);
			String STA=EUTIL.readDataFromExcel("ORGANIZATIONS", 11, 9);
			HomePage hp=new HomePage(driver);
			hp.clickonorgnization();
			OrganizationPage op = new OrganizationPage(driver);
			op.clickOnCreateOrgButton();
			CreateOrganizationPage cop=new CreateOrganizationPage(driver);
			cop.organizationoperation(ORGNAME+num,WEBSITE,EMP,PHONO,OTNO,EID,ADD,CITY,STA);
			Thread.sleep(3000);

}
}