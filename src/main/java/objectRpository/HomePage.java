package objectRpository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is the home page pom class
 */
public class HomePage {

	@FindBy(xpath="//a[text()='Leads']")
	private WebElement LEADS;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement ORGANIZATION;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement CONTACTS;
	
	@FindBy(xpath="(//span[text()=' Administrator']/../following-sibling::td/img)[1]")
	
	private WebElement adminHover;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement LogoutBtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getLEADS() {
		return LEADS;
	}

	public WebElement getORGANIZATION() {
		return ORGANIZATION;
	}

	public WebElement getCONTACTS() {
		return CONTACTS;
	}

	public WebElement getAdminHover() {
		return adminHover;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	/**
	 * business library to click on leads
	 */
	public void clickOnleads() {
		LEADS.click();
		
	}
	/**
	 * business library to click on ORGANIZATION
	 */
	public void clickonorgnization () {
		ORGANIZATION.click();
		
	}
	/**
	 * business library to click on CONTACTS
	 */
	public void clickOCONTACTS() {
		CONTACTS.click();
	}
	
	/**
	 * business library to perform logout
	 * @throws Exception 
	 */
	public void logoutoperation(WebDriver driver) throws Exception{
		
		Actions act= new Actions(driver);
		act.moveToElement(adminHover).perform();
	/*try {
			Thread.sleep(2000);
		} catch(Exception e) {
			System.out.println("Mounika expcetion here");
			e.printStackTrace();
		}*/
		LogoutBtn.click();
		Thread.sleep(3000);
	}

}
