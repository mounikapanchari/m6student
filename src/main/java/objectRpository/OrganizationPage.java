package objectRpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is the pom class to click oncreate org button
 */
public class OrganizationPage {
		@FindBy(xpath="//img[@title=\"Create Organization...\"]")
		private WebElement createOrganization;

		public OrganizationPage(WebDriver driver) {
				PageFactory.initElements(driver,this);
		}
		


public WebElement getCreateOrganization() {
			return createOrganization;
		}



		public void setCreateOrganization(WebElement createOrganization) {
			this.createOrganization = createOrganization;
		}



/**
 * business library to click on create organization
 */
public void clickOnCreateOrgButton() {
	createOrganization.click();
}


   
 
}

		
	


