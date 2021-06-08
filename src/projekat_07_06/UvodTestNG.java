package projekat_07_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UvodTestNG {

	@Test
	public void titleTest() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Google"), "Nevalidan title");
		
		//System.out.println(driver.getTitle());
	}
	
	@Test
	public void titleTest2() {
		System.out.println("Test 2");
	}
}
