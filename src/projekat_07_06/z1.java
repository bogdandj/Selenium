package projekat_07_06;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

		File file = new File("data/Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("form");

		for (int i = 1; i < 7; i++) {
			String name = sheet.getRow(i).getCell(0).getStringCellValue();
			String department = sheet.getRow(i).getCell(1).getStringCellValue();
			String phone = sheet.getRow(i).getCell(2).getStringCellValue();

			driver.findElement(By.className("add-new")).click();

			driver.findElement(By.id("name")).sendKeys(name);
			driver.findElement(By.id("department")).sendKeys(department);
			driver.findElement(By.id("phone")).sendKeys(phone);

			driver.findElement(By.xpath("//tr[last()]//*[@class=\"add\"]")).click();
			Thread.sleep(500);
		}

		List<WebElement> deleteBtns = driver.findElements(By.className("delete"));

		for (int i = 0; i < deleteBtns.size(); i++) {
			if (i != 5) {
				deleteBtns.get(i).click();
			}
			Thread.sleep(500);
		}

		deleteBtns = driver.findElements(By.className("delete"));
		if (deleteBtns.size() != 0) {
			System.out.println("Greska nisu pobrisani svi redovi");
		}

	}

	public static boolean elementExist(WebDriver driver, By by) {
		boolean exist = true;
		try {
			driver.findElement(by);
		} catch (Exception e) {
			exist = false;
		}
		return exist;
	}
}