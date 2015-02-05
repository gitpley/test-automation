package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends BaseClass{
	public Logout(WebDriver driver){
		super(driver);
		
	}
public void do_logout() throws InterruptedException{
	
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
}
}
