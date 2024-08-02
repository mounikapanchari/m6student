package genericliborutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingnment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement element=driver.findElement(By.xpath("//input[@name='user_name']"));
				element.sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("root");
		element.submit();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("aradhya");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("png");
		driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("Zebra");
	
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("35686878");
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("4578787989");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("com@gmail.com");
		driver.findElement(By.xpath("//textarea[@name=\"lane\"]")).sendKeys("tcpaliya");
		driver.findElement(By.xpath("//input[@name=\"pobox\"]")).sendKeys("65778");
		driver.findElement(By.xpath("//input[@name=\"code\"]")).sendKeys("2345");
		driver.findElement(By.xpath("//input[@name=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("bangloor");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("karnataka");
		driver.findElement(By.xpath("//select[@name=\"leadsource\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"Employee\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"industry\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"Banking\"]")).click();
		//driver.findElement(By.xpath("name=\"leadstatus\"")).click();
		//driver.findElement(By.xpath("//option[@value=\"Contacted\"]")).click();
		driver.findElement(By.xpath("//select[@name=\"rating\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"Active\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"  Save  \"]")).click();
		
		
		
		
		
		
		
		
		
	}

}
