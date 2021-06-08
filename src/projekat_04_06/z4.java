package projekat_04_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://getbootstrap.com/docs/5.0/forms/select/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement footer = driver.findElement(By.tagName("footer"));
		js.executeScript("arguments[0].scrollIntoView()", footer);

	}

}