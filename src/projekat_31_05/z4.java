package projekat_31_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("s")).sendKeys("Pogresan Tekst");
		driver.findElement(By.name("s")).clear();
		driver.findElement(By.name("s")).sendKeys("Flying Ninja");
		driver.findElement(By.className("search-submit")).click();
		
		driver.quit();
		
	}

}