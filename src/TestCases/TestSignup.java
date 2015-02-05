package TestCases;

import org.testng.annotations.Test;

import Core.Logout;
import Core.SignupPage;
import Core.TestCore;

public class TestSignup extends TestCore{
	

	@Test
	public void test_signup() throws InterruptedException{
		

		SignupPage sp = new SignupPage(driver);
		Logout lg = new Logout(driver);
		
		//Go to Sign up Page
		sp.open_signup_page();
		
		//Signup
		sp.signup();
		
		//verify that user has successfully signup
		sp.verify_signup();
		
		//Logout from application to so that you can test Login functionality now
		lg.do_logout();
		
		
	}
	

}
