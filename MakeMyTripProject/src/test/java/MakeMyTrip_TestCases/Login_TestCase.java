package MakeMyTrip_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MakeMyTrip_pages.Login_page;


public class Login_TestCase {
	WebDriver driver;
	Login_page li;
	@BeforeMethod
		public void launchBrowser() {
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
			
			@Test
			public void Login_TestCase() {
			Login_page li=new Login_page(driver);
			li.enterURL();
			li.clickpopup();
			li.clicksearch();
			
	}
		


	}

