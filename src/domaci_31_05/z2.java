/*Zadatak
Napisati program koji vrsi dodavanje 5 reda u tabelu. 
Maksimizirati prozor
Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
Dodati red podataka - jedan red u jednoj iteraciji 
Kliknite na dugme Add New
Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
Kliknite na zeleno Add dugme
Na kraju programa ugasite pretrazivac.*/


package domaci_31_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.className("add-new")).click();
			driver.findElement(By.name("name")).sendKeys("Bogdan Djuric");
			driver.findElement(By.name("department")).sendKeys("QA");
			driver.findElement(By.name("phone")).sendKeys("065618919");
			driver.findElement(By.xpath("//table/tbody/tr[last()]/td[last()]/a[1]")).click();
			driver.findElement(By.className("add-new")).click();
		}

		Thread.sleep(5000);

		driver.close();

	}

}