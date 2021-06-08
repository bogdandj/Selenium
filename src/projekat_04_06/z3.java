package projekat_04_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class z3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement apps = driver.findElement(By.className("gb_B"));
		js.executeScript("arguments[0].click();", apps);

		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

		WebElement more = driver.findElement(By.className("NQV3m"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", more);

	}
}
