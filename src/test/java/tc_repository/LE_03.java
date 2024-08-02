package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import objectRpository.CreatingLeadLPage;
import objectRpository.HomePage;
import objectRpository.LeadPage;

@Test(groups= {"regression"})
	public class LE_03 extends BaseClass {
		public void le03Tc() throws Exception {
			ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
			String FNAME=EUTIL.readDataFromExcel("Leads", 8, 1);
			String LNAME=EUTIL.readDataFromExcel("Leads",8,2);
			String CNAME=EUTIL.readDataFromExcel("Leads",8,3);
			String STRE=EUTIL.readDataFromExcel("Leads",8,4);
			String POCOD=EUTIL.readDataFromExcel("Leads",8,5);
			String COUNT=EUTIL.readDataFromExcel("Leads",8,6);
			String POBOX=EUTIL.readDataFromExcel("Leads",8,7);
			String CITY=EUTIL.readDataFromExcel("Leads",8,8);
			String STATE=EUTIL.readDataFromExcel("Leads",8,9);
			
			HomePage hp=new HomePage(driver);
			hp.clickOnleads();
			LeadPage lp=new LeadPage(driver);
			lp.clickOnCreateLeadButton();
			CreatingLeadLPage CNL=new CreatingLeadLPage(driver);
			CNL.createlead(FNAME,LNAME,CNAME,STRE,POCOD,COUNT,POBOX,CITY,STATE);
			System.out.println("LE01 excecution successful");
		}
		}

