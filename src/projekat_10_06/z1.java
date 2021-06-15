package projekat_10_06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class z1 {

	private WebDriver driver;

	@BeforeMethod

	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		
	}

	@Test
	public void titleTest() throws InterruptedException {
		driver.get("http://cms.demo.katalon.com/");
		boolean exist = true;
		driver = new ChromeDriver();

		Actions builder = new Actions(driver);
		
		Thread.sleep(1000);

		WebElement el = driver.findElement(By.className("product"));
		
		builder.moveToElement(el);

		try {
			driver.findElement(By.className("ajax_add_to_cart")).isDisplayed();
		} catch (Exception e) {
			exist = false;
		}

		Assert.assertTrue(exist, "Element ne postoji");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Kraj");
		driver.quit();
	}
}