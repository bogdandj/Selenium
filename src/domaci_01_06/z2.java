/*2. Zadatak
Napisti program koji:
Ucitava stranicu Zadatak2.html (skinite ovu stranicu kao na casu)
Dodaje 10 poruka na stranicu klikom na dugme
Potrebno je iskoristiti Explicit Wait za cekanje da dugme postane dostupno
Na kraju programa ispisati neku poruku za kraj
*/

package domaci_01_06;

import org.openqa.selenium.By;
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

		driver.get("C:\\Users\\tpdkl\\OneDrive\\Desktop\\Zadatak2.html");

		for (int i = 0; i < 10; i++) {
			driver.findElement(By.id("showInBtn")).click();
			WebDriverWait wait = new WebDriverWait(driver, 12, 4000);
			WebElement div = wait.until(ExpectedConditions.elementToBeClickable(By.id("id-" + i)));
		}
		System.out.println("Kraj");
		driver.close();

	}
}