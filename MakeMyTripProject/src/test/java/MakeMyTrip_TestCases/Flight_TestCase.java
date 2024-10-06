package MakeMyTrip_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MakeMyTrip_pages.Flight_page;
import MakeMyTrip_pages.Login_page;



public class Flight_TestCase {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Flight_page fg=new Flight_page(driver);
		Login_page li=new Login_page(driver);
		
		fg.enterURL();
		li.clickpopup();
		li.clicksearch();

	}

}
