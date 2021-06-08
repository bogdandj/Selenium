package projekat_31_05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cms.demo.katalon.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("s")).sendKeys("Flying Ninja");
		driver.findElement(By.className("search-submit")).click();
		
		driver.quit();
		
	}

}