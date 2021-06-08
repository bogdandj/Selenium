package projekat_07_06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class z2 {

	@Test
	public void googleSearchResultTest() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		driver.findElement(By.className("gLFyf")).sendKeys("It bootcamp");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

		List<WebElement> el = driver.findElements(By.className("g"));

		Assert.assertEquals(el.size(), 7, "Invlid number of search results.");
	}
}