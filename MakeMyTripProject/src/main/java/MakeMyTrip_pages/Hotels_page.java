package MakeMyTrip_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hotels_page {

	 public static WebDriver driver;
		
		public Hotels_page(WebDriver driver)
		{
			this.driver = driver; }

		
		
		public void enterURL()  {
			driver.get("https://www.makemytrip.com/hotels/hotel-listing/?checkin=09052024&city=CTGOI&checkout=09062024&roomStayQualifier=1e0e&locusId=CTGOI&country=IN&locusType=city&searchText=Goa&regionNearByExp=3&rsc=1e1e0e");
		}
		
		
		public void SelectHotel() {
			driver.findElement(By.xpath("//div[@class='infinite-scroll-component ']/div[2]/div[1]")).click();
		}
		

}
