package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import objectRpository.CreatingLeadLPage;
import objectRpository.HomePage;
import objectRpository.LeadPage;
@Test(groups={"smoke"})
public class LE_01 extends BaseClass {
public void le01Tc() throws Exception {
	ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
	String FNAME=EUTIL.readDataFromExcel("Leads", 2, 1);
	String LNAME=EUTIL.readDataFromExcel("Leads",2,2);
	String CNAME=EUTIL.readDataFromExcel("Leads",2,3);
	
	HomePage hp=new HomePage(driver);
	hp.clickOnleads();
	LeadPage lp=new LeadPage(driver);
	lp.clickOnCreateLeadButton();
	CreatingLeadLPage CNL=new CreatingLeadLPage(driver);
	CNL.createlead(FNAME,LNAME,CNAME);
	System.out.println("LE01 excecution successful");
}
}
