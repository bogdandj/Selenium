/*Napisati program koji
Ucitava stranicu https://www.kupujemprodajem.com/search.php?action=list&submit%5Bsearch%5D=Tra%C5%BEi&dummy=name
Zatvara reklamu (dijalog) klikom na dugme x
I zatim proverava da li se reklama ugasila. Ispisati odgovarajucu poruku

*/
package projekat_03_06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://crop-circle.imageonline.co/#circlecropresult");

		Thread.sleep(5000);

		WebElement uploadElement = driver.findElement(By.id("inputImage"));
		Thread.sleep(500);
		uploadElement.sendKeys("D:\\PhotoBox\\Kanja\\toto.png");
		Thread.sleep(500);
		driver.findElement(By.id("button")).click();

		
		boolean imgs = driver.findElements(By.xpath("//*[@id=\"result\"]/img")).size() != 0;

		System.out.println(imgs);
	}
}
