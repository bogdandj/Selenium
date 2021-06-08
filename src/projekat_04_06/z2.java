package projekat_04_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.open(arguments[0])", "https://www.google.com");
		js.executeScript("window.open(arguments[0])", "https://www.youtube.com");
		js.executeScript("window.open(arguments[0])", "https://www.facebook.com");

		driver.get("https://www.kupujemprodajem.com");

	}

}