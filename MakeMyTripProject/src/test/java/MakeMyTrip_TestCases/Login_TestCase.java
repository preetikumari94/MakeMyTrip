package MakeMyTrip_TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MakeMyTrip_pages.Login_page;


public class Login_TestCase {

	
		public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Login_page li=new Login_page(driver);
			li.enterURL();
			li.clickpopup();
			li.clicksearch();
			
	}
		


	}

