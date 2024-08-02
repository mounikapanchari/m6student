package genericliborutility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class SeliniumUtility {
	public Actions act=null;
	public Select s=null;
	/**
	 *1. this method is maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}
	
	/**
	 * 2.this method is using for implicitwait
	 * @param driver
	 * @param time
	 */
	public void implicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	/**
	 * 3.this method is used to move to a perticular element
	 * @param driver
	 * @param element
	 */
	public void movingTowardsAnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.moveToElement(element).perform();
}
	
	/**
	 * 4.this method is used to perform right click operation
	 * @param driver
	 */
	public void rightClick(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.contextClick(element).perform();
	}
	
	/**
	 *5.this method is used to click on element 
	 * @param driver
	 * @param element
	 */
	public void clickOnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.click(element);
	}
	
	/**
	 * 6.this method is used to scroll to a perticular element
	 * @param driver
	 * @param element
	 */
public void scrollToAperticularElement(WebDriver driver,WebElement element) {
act=new Actions(driver);
act.scrollToElement(element).perform();
}

/**
 * 7.this method is used to drag an element to its destination
 * @param driver
 * @param src
 * @param dest
 */
public void dragSrcToDest(WebDriver driver,WebElement src,WebElement dest) {
	act=new Actions(driver);
	act.dragAndDrop(src,dest).perform();
}

/**
 *8. this method is used to drag a pointer
 * @param driver
 * @param src
 * @param x
 * @param y
 */
public void dragPointer(WebDriver driver,WebElement src, int x,int y) {
act=new Actions(driver);
act.dragAndDropBy(src,x,y).perform();
}

/**
 *9. this method is used to click and hold
 * @param driver
 * @param element
 */
public void clickAndHoldAnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.clickAndHold(element).perform();	
}

/**
 * 10.this method is used to release an element
 * @param driver
 * @param element
 */
public void releaseAnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.release(element).perform();
}
/**
 * 11.this method is used to select an option from dropdown based on index
 * @param element
 * @param indexno
 */
public void selectAnElementBasedOnIndex (WebElement element,int indexno) {
s=new Select(element);
s.selectByIndex(indexno);
}
/**
 * 12.this method is used to select an option from dropdown based on value att
 * @param element
 * @param value
 */
public void selectAnElementBasedOnValueAttribute(WebElement element,String value) {
s=new Select(element);
	s.selectByValue(value);
} 

/**
 *13. this method is used to select an option from dropdown based on visible text
 * @param element
 * @param text
 */
public void selectAnElementBasedOnVisibleText(WebElement element,String text) {
	s=new Select(element);
	s.selectByVisibleText(text);
}
/**
 *14. this method will give all the  options
 * @param element
 * @return
 */
public List<WebElement> getAllOptionsFromDropDown(WebElement element){
s=new Select(element);
List<WebElement> options=s.getOptions();
return options;

} 
/**
 * 15.this method will give all the selected options
 * @param element
 * @return
 */
public List<WebElement> getAllSelectedOptionsFromDropDown(WebElement element){
s=new Select(element);
List<WebElement> options=s.getAllSelectedOptions();
return options;

}
/**
 *16. this method is used to deselect an option from dropdown based on index
 * @param element
 * @param indexno
 */
public void deselectAnElementBasedOnIndex (WebElement element,int indexno) {
s=new Select(element);
s.deselectByIndex(indexno);
}
/**
 * 17.this method is used to deselect an option from dropdown based on value attri
 * @param element
 * @param value
 */
public void deselectAnElementBasedOnValueAttribute(WebElement element,String value) {
s=new Select(element);
	s.deselectByValue(value);
}
/**
 *18. this method is used to select an option from dropdown based on visible text
 * @param element
 * @param text
 */
public void deselectAnElementBasedOnVisibleText(WebElement element,String text) {
	s=new Select(element);
	s.deselectByVisibleText(text);

}
/**19.
 * to deselect all options
 * @param element
 */
public void deselectAlloptions(WebElement element) {
	s=new Select(element);
	s.deselectAll();
}
/**
 * 20.this method will help to accept the alert
 * @param driver
 */
public void toAcceptAlert(WebDriver driver) {
Alert alt=driver.switchTo().alert();
alt.accept();
}
/**
 * 21.this method will helpt to dismiss the alert
 * @param driver
 */
public void toDismissAlert(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
	
}
/**
 * 22.this method will help to pass the alert msg
 * @param driver
 * @param msg
 */
public void toPassAlertMsg(WebDriver driver,String msg) {
	Alert alt=driver.switchTo().alert();
	alt.sendKeys("msg");
}
/**
 * 23.this method will help to read the alert msg
 * @param driver
 * @return
 */
public String toFetchAlertMsg(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	String alertMsg=alt.getText();
	return alertMsg;
	
}
/**
 * 24.this method will help us to perform js operations
 * @param driver
 * @param value
 */

public void operationsWithJs(WebDriver driver,String value) {
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript(value);
}
/**
 * 25.
 * @param string
 * @param path
 */
public void captureScreenshot(WebDriver driver,String path) throws Exception{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(path);
	Files.copy(src, dest);
	}
/**
 * 26.
 * @param driver
 * @param element
 * @param time
 * @throws Exception
 */
public void ifElementClickFails(WebDriver driver,WebElement element,int time) throws Exception {
	int count=0;
	int reclickCount=4;
	while(count<=reclickCount) {
		element.click();
		Thread.sleep(time);
		break;
		
	}
}
	/**
	 * 
	 */
	public void windowPopUpHandle(WebDriver driver) 
	{
		String parentWindow=driver.getWindowHandle();
		Set<String>allWindow=driver.getWindowHandles();
		Iterator<String>itr=allWindow.iterator();
		while(itr.hasNext())
		{
			String values=itr.next();
			String title=driver.switchTo().window(values).getTitle();
			if(title.contains(values)) {
				break;
			}
		}
	}

}

















	
	
	
	
	
	
	
	
	
	
	
	
