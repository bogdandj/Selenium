package projekat_04_06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement searchInput = driver.findElement(By.name("q"));
		WebElement serachBtn = driver.findElement(By.className("gNO89b"));

		js.executeScript("arguments[0].value=arguments[1]", searchInput, "IT Bootcamp");
		js.executeScript("arguments[0].click()", serachBtn);

	}

}