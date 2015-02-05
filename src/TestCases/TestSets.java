package TestCases;

import org.testng.annotations.Test;

import Core.LoginPage;
import Core.Logout;
import Core.TestCore;
import Core.searchset;

public class TestSets extends TestCore {
	
	@Test
	public void addset() throws InterruptedException{
		
		LoginPage lp = new LoginPage(driver);
		searchset ss = new searchset(driver);
		Logout lg = new Logout(driver);
		
		//Login Again
		lp.login();
		
		//Add and Remove a Set
		ss.addsets();
		
		//Do Logout
		lg.do_logout();
	}

}
