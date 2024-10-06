package MakeMyTrip_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {

	 public static WebDriver driver;
		
		public Login_page(WebDriver driver)
		{
			this.driver = driver; }

		By LoginAndCreateAccount = By.xpath("//div[@class='landingContainer eng']//div[1]//ul[1]//li[4]");
		By personalAccount = By.xpath("//div[@class='appendBottom25']//ul//li[1]");
		By countryNameAndCode = By.xpath("//div[@class='modalFieldInner makeFlex hrtlCenter error']/div[1]");
		By India =By.xpath("//div[@class='cntrycode__list']//div[1]");
		By EnterMobileNumber = By.xpath("//input[@placeholder='Enter Mobile Number']");
		By continueButton = By.xpath("//button[@class='capText font16']"); 
		By enterOTP = By.id("otp");
		By LoginButton =By.xpath("//button[@data-cy='login']");
		By popup = By.xpath("//span[@class='commonModal__close']");
		By search =By.xpath("//div[@class='fsw ']//p//a");
		public void enterURL()  {
			driver.get("https://www.makemytrip.com/");
		}
		
		public void clickLogin() {
			driver.findElement(LoginAndCreateAccount).click();
		}
		
		public void clickPersonalAccount() {
			driver.findElement(personalAccount).click();
		}
		
		public void clickcountryNameAndCode()  {
			driver.findElement(countryNameAndCode).click();
		}
		
		public void selectIndia()  {
			driver.findElement(India).click();
		}
		
		public void EnterMobileNumber(String mobileNumber)  {
			driver.findElement(EnterMobileNumber).sendKeys(mobileNumber);
		}
		
		public void clickcontinueButton()   {
			driver.findElement(continueButton).click();
			
		}
		public void enterOTP(String OTP)   {
			driver.findElement(enterOTP).sendKeys(OTP);
			
		}
		public void clickLoginButton()   {
			driver.findElement(LoginButton).click();
			
		}
		public void clickpopup() {
		
		driver.findElement(popup).click();}
		
		public void clicksearch() {
			
			driver.findElement(search).click();
}}
