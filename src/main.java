import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		driver.findElement(By.id("search")).sendKeys("Happiness");
		
		driver.findElement(By.id("search-icon-legacy")).click();
	

	}

}
