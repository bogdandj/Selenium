package domaci_07_06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class z1 {

	@Test
	public void titleTest() {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 3, 4000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.className("udlite-text-input")).sendKeys("Selenium");
		driver.findElement(By.className("udlite-text-input")).sendKeys(Keys.ENTER);

		driver.findElement(By.className("udlite-select-container")).click();
		driver.findElement(
				By.xpath("//*[@class='udlite-select-container udlite-select-container-large']/select/option[4]"))
				.click();

		List<WebElement> ratings = driver.findElements(By.xpath("//*[@data-purpose='rating-number']"));

		double first = Double.valueOf(ratings.get(0).getText());
		double last = Double.valueOf(ratings.get(ratings.size()-1).getText());
		Assert.assertTrue(first > last, "First rating is smaller than the last rating");

	}
}