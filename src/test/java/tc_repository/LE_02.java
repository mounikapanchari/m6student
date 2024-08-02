package tc_repository;

import org.testng.annotations.Test;

import genericliborutility.BaseClass;
import genericliborutility.ExcelUtilityorLib;
import objectRpository.CreatingLeadLPage;
import objectRpository.HomePage;
import objectRpository.LeadPage;
@Test(groups= {"sanity"})
public class LE_02 extends BaseClass {
		public void le02Tc() throws Exception {
			ExcelUtilityorLib EUTIL=new ExcelUtilityorLib();
			String FNAME=EUTIL.readDataFromExcel("Leads",5,1 );
			String LNAME=EUTIL.readDataFromExcel("Leads",5,2);
			String CNAME=EUTIL.readDataFromExcel("Leads",5,3);
			String TIT=EUTIL.readDataFromExcel("Leads",5,4);
			String NOEMP=EUTIL.readDataFromExcel("Leads",5,5);
			String PHO=EUTIL.readDataFromExcel("Leads",5,6);
			String MOB=EUTIL.readDataFromExcel("Leads",5,7);
			String ID=EUTIL.readDataFromExcel("Leads",5,8);
	
			System.out.println("Fname: " + FNAME + ", LName: " + LNAME + ", CompanyName:" + CNAME + ", TIT: " + TIT + ", No of Emps: " + NOEMP +", Phone: " +  PHO + ", Moblile: " + MOB + ", Email ID: " + ID );
			HomePage hp=new HomePage(driver);
			hp.clickOnleads();
			LeadPage lp=new LeadPage(driver);
			lp.clickOnCreateLeadButton();
			CreatingLeadLPage CL=new CreatingLeadLPage(driver);
			CL.createlead(FNAME,LNAME,CNAME,NOEMP,TIT,PHO,MOB,ID);
			System.out.println("LE02 excecution successful");
}
}
