package MakeMyTrip_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MakeMyTrip_pages.Hotels_page;

public class Hotels_TestCase {
	WebDriver driver;
	 Hotels_page ht;
	 
	 @BeforeMethod
	public void launchBrowser()  {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
		
	 @Test
	public void Hotels_TestCase() {
	   Hotels_page ht=new Hotels_page(driver);
		ht.enterURL();
		ht.SelectHotel();

	}

	}


