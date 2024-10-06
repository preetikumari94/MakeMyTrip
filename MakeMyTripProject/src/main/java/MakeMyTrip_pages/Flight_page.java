package MakeMyTrip_pages;

import org.openqa.selenium.WebDriver;

public class Flight_page {

	 public static WebDriver driver;
		
		public Flight_page(WebDriver driver)
		{
			this.driver = driver; }

		
		
//		public void enterURL()  {
//			driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-21/08/2024_BOM-DEL-22/08/2024&tripType=R&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
//		}
		
		
		public void enterURL() {
			driver.get("https://www.makemytrip.com/my-profile/");
		}
		
		
}
