
/*3.Zad (Za vezbanje)
Napisati program koji:
Ucitati stranicu https://boomf.com/boomf-bomb
Kliknite na Create Your Own dugme
I postavlja sliku na svaku od stranica kocke kao i poruku za kocku

*/
package projekat_03_06;

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

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://boomf.com/boomf-bomb");

		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("jFhzlh")).click();
		Thread.sleep(3000);

		driver.findElement(By.className("middle")).click();
		Thread.sleep(3000);
		WebElement uploadImage2 = driver.findElement(By.xpath("//input[@accept=\"image/*\"]"));
		Thread.sleep(3000);
		uploadImage2.sendKeys("D:\\PhotoBox\\Kanja\\toto.png");
		Thread.sleep(3000);
		driver.findElement(By.className("fnMfZy")).click();
		

	}
}
