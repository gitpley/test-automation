package Core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;








import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestCore {

	public static WebDriver driver = null;
	public static Properties object = new Properties();
	public static Properties config = new Properties();
	
		
	
	
			
			
				
				@BeforeSuite
				public static void setup() throws IOException{
					
					if (driver==null){
						
						FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//TestProperties//config.properties"); 
						
						config.load(fis);
						fis = new FileInputStream(System.getProperty("user.dir")+"//src//TestProperties//object.properties");
						object.load(fis);
						//logs.debug("Config file loaded");
						if(config.getProperty("browser").equals("firefox")){
							
							driver = new FirefoxDriver();
							
							}else if(config.getProperty("browser").equals("chrome")){
								
								System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver_win32\\chromedriver.exe");
								driver = new ChromeDriver();
								
							}
					
					driver.navigate().to(config.getProperty("url"));
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					
				}

				}
		
		@BeforeTest
		public void isExecutable(){
			
			if(driver.getTitle().contains("404")){
				
				System.out.println("Page not Found Error");
				throw new SkipException("Test Skipped because of 404 error");
			}
		}
				
		@AfterSuite
		public void tearDown(){
			
			driver.quit();
			
		}
 	}



