package projekat_08_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class z2 {

	@Test
	public void titleTest() {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 3, 4000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		boolean exist = true;
		boolean exist2 = true;

		driver.findElement(By.xpath("//*[@id='primary-menu']/ul/li[last()]")).click();
		driver.findElement(By.className("ellie-thumb-wrapper")).click();
		driver.findElement(By.className("quantity-up")).click();
		driver.findElement(By.name("add-to-cart")).click();

		try {
			driver.findElement(By.className("woocommerce-message"));
		}

		catch (Exception e) {
			exist = false;
		}
		
		WebElement text = driver.findElement(By.className("woocommerce-message"));

		Assert.assertTrue(text.getText().contains("added to your cart"), "Element ne postoji");

		driver.findElement(By.className("wc-forward")).click();

		String number = driver.findElement(By.className("qty")).getAttribute("value");

		int num = Integer.parseInt(number);

		Assert.assertEquals(num, 2);

		driver.findElement(By.className("remove")).click();

		try {
			driver.findElement(By.className("cart-empty"));
		}

		catch (Exception e) {
			exist2 = false;
		}
		
		WebElement text2 = driver.findElement(By.className("cart-empty"));

		Assert.assertTrue(text2.getText().contains("currently empty"), "Element ne postoji");
	}
}
