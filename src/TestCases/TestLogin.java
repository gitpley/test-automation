package TestCases;



import org.testng.annotations.Test;

import Core.LoginPage;
import Core.Logout;
import Core.TestCore;

public class TestLogin extends TestCore {
	
	@Test
	public void Login() throws InterruptedException{
		
		
		LoginPage lg = new LoginPage(driver); 
		
		//Do Login
		lg.login();
		Thread.sleep(3000);
		
		
		//Verify Login
		lg.verify_login();
		
		
		//Do Logout
		Logout logout = new Logout(driver);
		logout.do_logout();
		
	}

}
