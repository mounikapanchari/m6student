package objectRpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingContact {

	
	@FindBy(xpath="//input[@name=\"firstname\"]")
	private WebElement FirstName ;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@id=\"title\"]")
	private WebElement Title;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"][1]")
	private WebElement saveBtton;


	public CreatingContact(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}


	public WebElement getFirstName() {
		return FirstName;
	}


	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getTitle() {
		return Title;
	}


	public WebElement getSaveBtton() {
		return saveBtton;
	}
	
	public void CreatingContact(String fname,String lname,String tit ) {
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		Title.sendKeys(tit);
		saveBtton.click();
	}

	
}
