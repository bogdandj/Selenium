package projekat__01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kupujemprodajem.com/search.php?action=list&submit%5Bsearch%5D=Tra%C5%BEi&dummy=name");

		driver.manage().window().maximize();

		driver.findElement(By.className("kpBoxCloseButton")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='priceSecondSelection']/div")).click();
		driver.findElement(By.id("search_by_price_number_min")).sendKeys("100");
		driver.findElement(By.id("search_by_price_number_max")).sendKeys("200");
		driver.findElement(By.xpath("//*[@name='data[currency]'][@value='eur']")).click();

	}

}