package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchset extends BaseClass {

	public searchset(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		
		public void addsets() throws InterruptedException{
		driver.findElement(By.xpath(TestCore.object.getProperty("AddSet"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(TestCore.object.getProperty("Input"))).sendKeys(TestCore.config.getProperty("Input"));
		Thread.sleep(1000);
		driver.findElement(By.id(TestCore.object.getProperty("Search"))).click();
		Thread.sleep(1000);
		driver.findElement(By.id(TestCore.object.getProperty("Search"))).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(TestCore.object.getProperty("Search_Element")));
		Thread.sleep(1000);
		element.findElement(By.xpath(TestCore.object.getProperty("AddPley"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("Remove"))).click();
		Thread.sleep(2000);
	
	}

}
