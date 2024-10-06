package MakeMyTrip_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MakeMyTrip_pages.Flight_page;
import MakeMyTrip_pages.Hotels_page;
import MakeMyTrip_pages.Login_page;

public class Hotels_TestCase {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Hotels_page ht=new Hotels_page(driver);
		
		ht.enterURL();
		ht.SelectHotel();

	}

	}


