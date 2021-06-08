/*1.Zadatak
Napisati program koji ucitava stranicu Zadatak1.html
I ceka dok se na stranici ne pojave bar 20 poruka (20 div-a)
*/

package domaci_01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class z1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("C:\\Users\\tpdkl\\OneDrive\\Desktop\\Zadatak1.html");

		for (int i = 0; i < 20; i++) {
			WebDriverWait wait = new WebDriverWait(driver, 12, 4000);
			WebElement div = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id-" + i)));
		}

		driver.close();

	}
}