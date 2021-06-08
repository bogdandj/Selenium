/*
2.Zadatak
Napisati program koji:
Ucitava stranicu http://cms.demo.katalon.com/
Hvata link Cart iz navigacije
i ispisuje u konzoli href atribut tog taga - tj ispisace http://cms.demo.katalon.com/cart/ 
preko metode .getAttribute
i ispisuje tekst tog linka 
*/

package projekat__01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cms.demo.katalon.com/");

		driver.manage().window().maximize();
		WebElement shopLnk = driver.findElement(By.xpath("//*[@id='primary-menu']/ul/li[last()]/a"));

		String lnk = shopLnk.getAttribute("href");
		System.out.println(lnk);

	}

}