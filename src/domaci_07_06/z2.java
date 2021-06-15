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

public class z2 {

	@Test
	public void titleTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 3, 4000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.className("udlite-text-input"))
				.sendKeys("2021 Complete Python Bootcamp From Zero to Hero in Python");
		driver.findElement(By.className("udlite-text-input")).sendKeys(Keys.ENTER);

		driver.findElement(By.className("udlite-focus-visible-target")).click();
		Thread.sleep(1000);
		boolean exist = true;

		try {
			driver.findElement(By.className("styles--btn--express-checkout--28jN4")).isEnabled();
		}

		catch (Exception e) {
			exist = false;
		}

		Assert.assertTrue(exist, "Element ne postoji");

		driver.findElement(By.className("styles--btn--express-checkout--28jN4")).click();

		try {
			driver.findElement(By.id("auth-to-udemy-title"));
		}

		catch (Exception e) {
			exist = false;
		}

		Assert.assertTrue(exist, "Element ne postoji");

	}
}