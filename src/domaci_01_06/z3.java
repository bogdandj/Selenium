/*3.Zadatak
Napisti program koji:
Ucitava stranicu https://yts.mx/
Vrsi pretragu za tekst “Anna” i na kraju ispisuje sve rezultate koji su ponudjeni (pogledaj sliku)
Na kraju programa ispisati sve nazive filmova
Za implementaciju iskoristiti implicitno cekanje*/

package domaci_01_06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class z3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://yts.mx/");

		driver.findElement(By.id("quick-search-input")).sendKeys("Anna");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> movies = driver.findElements(By.xpath("//div[@class='hidden-sm']/ul"));

		System.out.println(movies.size());

		for (int i = 0; i < movies.size(); i++) {
			String name = movies.get(i).getText();
			System.out.println(name);
		} 

	}

}
