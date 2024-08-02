package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import genericliborutility.JavaLibrary;
import objectRpository.CreateOrganizationPage;
import objectRpository.HomePage;
import objectRpository.OrganizationPage;

public class ORG_03 extends BaseClass{
		@Test(groups= {"smoke"})
		public void ORG03() throws Exception {
			JavaLibrary JUTIL=new JavaLibrary();
			 int num=JUTIL.generateRandomNumber(10000);
			ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
			String ORGNAME=EUTIL.readDataFromExcel   ("ORGANIZATIONS", 8, 1);
			String WEBSITE=EUTIL.readDataFromExcel("ORGANIZATIONS", 8, 2);
			String EMP=EUTIL.readDataFromExcel("ORGANIZATIONS", 8, 3);
			String ADD=EUTIL.readDataFromExcel("ORGANIZATIONS", 8, 3);
			String CITY=EUTIL.readDataFromExcel("ORGANIZATIONS", 8, 3);
			String STA=EUTIL.readDataFromExcel("ORGANIZATIONS", 8, 3);
			HomePage hp=new HomePage(driver);
			hp.clickonorgnization();
			OrganizationPage op = new OrganizationPage(driver);
			op.clickOnCreateOrgButton();
			CreateOrganizationPage cop=new CreateOrganizationPage(driver);
			cop.organizationoperation(ORGNAME+num,WEBSITE,EMP,ADD,CITY,STA);
			Thread.sleep(3000);
			
}}
