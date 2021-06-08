/*Zadatak 
Maksimizirati prozor
Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
Od korisnika ucitati broj na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
I izvrsite akciju klik na odgovarajuci element
Na kraju programa ugasite pretrazivac.

*/
package domaci_31_05;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://s.bootsnipp.com/iframe/WaXlr");
		
		System.out.println("Unesite broj od 1 do 5");
		int x = s.nextInt();

		driver.findElement(By.id("rating-star-" + x)).click();
		Thread.sleep(5000);

		driver.close();

	}

}