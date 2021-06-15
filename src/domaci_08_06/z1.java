package domaci_08_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		driver.get("https://demo.opensource-socialnetwork.org/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 3, 4000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.className("btn")).click();
		driver.navigate().to("https://demo.opensource-socialnetwork.org/u/Anika25");


		boolean messageExist = elementExist(driver, By.partialLinkText("Add friend"));

		Assert.assertTrue(messageExist, "Element ne postoji");

		driver.findElement(By.partialLinkText("Add friend")).click();

		boolean alert = elementExist(driver, By.className("alert"));

		Assert.assertTrue(alert, "Element ne postoji");

		boolean cancel = elementExist(driver, By.partialLinkText("Cancel Request"));

		Assert.assertTrue(cancel, "Element ne postoji");

		driver.navigate().refresh();

		Assert.assertTrue(cancel, "Element ne postoji");

		driver.findElement(By.partialLinkText("Cancel Request")).click();

		boolean cancelMessage = elementExist(driver, By.className("alert-danger"));

		Assert.assertTrue(cancelMessage, "Element ne postoji");

		boolean messageExist2 = elementExist(driver, By.partialLinkText("Add friend"));

		Assert.assertTrue(messageExist2, "Element ne postoji");

	}

	public boolean elementExist(WebDriver driver, By by) {
		boolean messageExist = true;
		try {
			driver.findElement(by);
		} catch (Exception e) {
			messageExist = false;
		}
		return messageExist;
	}

}