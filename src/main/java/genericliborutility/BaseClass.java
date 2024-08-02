package genericliborutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRpository.HomePage;
import objectRpository.LoginPage;


public class BaseClass {
	public static WebDriver driver = null;
	public  PropertiesUtilorLib PUTIL = null;
	public SeliniumUtility SUTIL = new SeliniumUtility();
	
	@BeforeSuite(alwaysRun=true)
	public void CreateDbConnection() {
		System.out.println("db connection successful");
	}
	
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() throws Exception {
		PUTIL=new PropertiesUtilorLib();
		System.out.println("URL not equal to NULL");
		String URL=PUTIL.getDataFromProperties("url");
		/*if (URL != null) {
			System.out.println("URL not equal to NULL");
		} else {
			System.out.println("URL is NULL");
		}*/
		
		driver = new ChromeDriver();
		SUTIL.implicitWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("launching successful");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void LoginOperation() throws Exception {
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		
		LoginPage LP=new LoginPage(driver);
	    LP.LoginOperation(USERNAME,PASSWORD);
		System.out.println("login successful");
	}
	
	@AfterMethod(alwaysRun=true)
	public void LogoutOperation() throws Exception {
		/*try {
			Thread.sleep(3000);
		} catch(Exception e) {
			System.out.println("Mounika expcetion here");
			e.printStackTrace();
		}*/
		HomePage hp=new HomePage(driver);
		
		hp.logoutoperation(driver);
		System.out.println("logout successful");
		Thread.sleep(3000);
	}
	
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		driver.close();
		System.out.println("browser closed");
		
	}
	
	@AfterSuite(alwaysRun=true)
	public void CloseDbConnection() {
		System.out.println("db  connection closed");
	}
}
