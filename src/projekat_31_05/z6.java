/*Napisti program koji:
Ucitava stranicu http://cms.demo.katalon.com/
Hvata sve linkove iz navigacije i vraca listu WebElemenata
i ispisuje u konzoli tekst svakog linka
*/

package projekat_31_05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://cms.demo.katalon.com/");
		Thread.sleep(2000);

		WebElement nav = driver.findElement(By.tagName("nav"));
		List<WebElement> links = nav.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}

	}

}