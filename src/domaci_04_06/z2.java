/*2.Zadatak
Napisati program koji:
Ucitava stanicu https://www.wikipedia.org/
Sa stranice sakuplja sve linkove (jezike) i svaki link otvara u novom prozoru pretrazivaca
Svaki link potrebno je otvoriti u novom tabu.
Skripta: window.open(arguments[0]);*/

package domaci_04_06;

import java.util.List;
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://wikipedia.org");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);

		for (int i = 0; i < 10; i++) {

			List<WebElement> lang = driver.findElements(By.xpath("//*[@class='central-featured']/div/a"));
			String link = lang.get(i).getAttribute("href");
			js.executeScript("window.open(arguments[0])", link);
		}

	}
}
