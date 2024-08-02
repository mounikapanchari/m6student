package objectRpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
@FindBy(xpath="//img[@title=\"Create Lead...\"]")
private WebElement CreateNewLeadButton;
public LeadPage(WebDriver driver){
	PageFactory.initElements(driver,this);	
}
public WebElement getCreateNewLeadButton(){
	return CreateNewLeadButton;
}
/**
 * 
 */
public void clickOnCreateLeadButton() {
	CreateNewLeadButton.click();
	
}
}