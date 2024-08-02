package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import objectRpository.CreatingLeadLPage;
import objectRpository.HomePage;
import objectRpository.LeadPage;
	@Test(groups= {"smoke","sanity"})
	public class LE_04 extends BaseClass {
	public void le04Tc() throws Exception {
		ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
		String FNAME=EUTIL.readDataFromExcel("Leads",11 , 1);
		String LNAME=EUTIL.readDataFromExcel("Leads",11,2);
		String CNAME=EUTIL.readDataFromExcel("Leads",11,3);
		String NOEMP=EUTIL.readDataFromExcel("Leads",11,4);
		String TIT=EUTIL.readDataFromExcel("Leads",11,5);
		String PHO=EUTIL.readDataFromExcel("Leads",11,6);
		String MOB=EUTIL.readDataFromExcel("Leads",11,7);
		String ID=EUTIL.readDataFromExcel("Leads",11,8);
		String STRE=EUTIL.readDataFromExcel("Leads",11,9);
		String POCOD=EUTIL.readDataFromExcel("Leads",11,10);
		String COUNT=EUTIL.readDataFromExcel("Leads",11,11);
		String POBOX=EUTIL.readDataFromExcel("Leads",11,12);
		String CITY=EUTIL.readDataFromExcel("Leads",11,13);
		String STATE=EUTIL.readDataFromExcel("Leads",11,14);
		HomePage hp=new HomePage(driver);
		hp.clickOnleads();
		LeadPage lp=new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		CreatingLeadLPage CNL=new CreatingLeadLPage(driver);
		CNL.createlead(FNAME,LNAME,CNAME,NOEMP,TIT,PHO,MOB,ID,STRE,POCOD,COUNT,POBOX,CITY,STATE);
		System.out.println("LE04 excecution successful");
	}
	}
