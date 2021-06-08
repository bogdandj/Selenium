/*1.Zadatak 
Napisati program koji:
Ucitava stranicu https://www.google.com/
Hvata body element sa stranicu i njemu setuje atribut 
style na vrednost “background: nekaBoja”
Skripta: arguments[0].style=”background: black”;
(Za vezbanje) Setuje prosledjenu boju:
Skripta: arguments[0].style=”background:” + arguments[1];
Boje za testiranje - red, green, blue, …*/

package domaci_04_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://google.com");

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement area = driver.findElement(By.className("LLD4me"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].style='background: ' + arguments[1]", area, "blue");

	}
}
