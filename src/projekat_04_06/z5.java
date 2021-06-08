package projekat_04_06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/ajax-infinite-scroll-template/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> paragraphs = driver.findElements(By.xpath("//*[@id='result']/p"));

		while (paragraphs.size() < 150) {
			WebElement loadMore = driver.findElement(By.id("more"));
			js.executeScript("arguments[0].scrollIntoView()", loadMore);

			paragraphs = driver.findElements(By.xpath("//*[@id='result']/p"));
		}

	}

}