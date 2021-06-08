/*Napisati program koji
Ucitava stranicu https://www.kupujemprodajem.com/search.php?action=list&submit%5Bsearch%5D=Tra%C5%BEi&dummy=name
Zatvara reklamu (dijalog) klikom na dugme x
I zatim proverava da li se reklama ugasila. Ispisati odgovarajucu poruku

*/
package projekat_03_06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/Zadatak3.html");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		System.out.println("Pocetak");
		List<WebElement> elements = driver.findElements(By.id("blbl"));
		if (elements.size() > 0) {
		} else {
		}

		System.out.println("Kraj");

	}

	public static boolean isElementExist(WebDriver driver, By by) {
		boolean postoji = true;
		try {

			driver.findElement(by);

		} catch (Exception e) {
			postoji = false;
		}
		return postoji;
	}

	public static boolean exist(WebDriver driver, By by) {
		return driver.findElements(by).size() > 0;
	}

}