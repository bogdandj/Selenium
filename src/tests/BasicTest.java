package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.AppointmentPage;
import pages.LoginPage;
import pages.SummaryPage;

public abstract class BasicTest {

	protected WebDriver driver;
	protected LoginPage loginPage;
	protected AppointmentPage appointmentPage;
	protected SummaryPage summaryPage;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		loginPage = new LoginPage(driver);
		appointmentPage = new AppointmentPage(driver);
		summaryPage = new SummaryPage(driver);
	}
	

	@AfterMethod
	public void cleanup() {
		this.driver.quit();
	}

}