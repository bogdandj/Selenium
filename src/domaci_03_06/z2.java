/*2.Napisati program koji :
Ucitava stranicu https://www.udemy.com/courses/search/?src=ukw&q=slksd
Klikce na dugme za jezik i proverava da li se prikazuje dijalog za promenu jezika*/

package domaci_03_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class z2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		boolean exist = true;

		driver.get("https://www.udemy.com/courses/search/?src=ukw&q=slksd");

		Thread.sleep(1000);

		driver.findElement(By.className("language-selector-button--button--1wgoL")).click();

		WebDriverWait wait = new WebDriverWait(driver, 12, 4000);
		// WebElement div =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("udlite-modal")));

		try {
			WebElement div = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("udlite-modal")));
		}

		catch (Exception e) {
			exist = false;
		}

		System.out.println(exist);

	}
}
