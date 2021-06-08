package projekat_31_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("ACCOUNT")).click();
		
		
		WebElement loginForm = driver.findElement(By.className("login"));
		
		loginForm.findElement(By.name("username")).sendKeys("customer");
		Thread.sleep(2000);
		loginForm.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		loginForm.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		WebElement nav = driver.findElement(By.tagName("nav"));
		
		nav.findElement(By.linkText("Logout")).click();
		
		driver.quit();
		
	}

}