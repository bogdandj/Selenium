package domaci_10_06;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import domaci_10_06.FormPage;

public class FormTest {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/tpdkl/OneDrive/Desktop/form.html");
		
		FormPage formPage;
		formPage = new FormPage(driver);

		
		File file = new File("data/Form Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("form");

		for (int i = 1; i < 7; i++) {
			String name = sheet.getRow(i).getCell(0).getStringCellValue();
			String gender = sheet.getRow(i).getCell(1).getStringCellValue();
			double dob = sheet.getRow(i).getCell(2).getNumericCellValue();
			String email = sheet.getRow(i).getCell(3).getStringCellValue();
			String role = sheet.getRow(i).getCell(4).getStringCellValue();
			String waysOfDev = sheet.getRow(i).getCell(5).getStringCellValue();
			String comment = sheet.getRow(i).getCell(6).getStringCellValue();
			String s=String.valueOf(dob);  

			formPage.button();
			formPage.getFirstName().sendKeys(name);
			formPage.getRadio(gender).click();
			formPage.getDateOfBirth().sendKeys(s);
			formPage.getEmail().sendKeys(email);
			formPage.getRole().sendKeys(role);
			formPage.getWaysOfDevelopment(waysOfDev).click();
			formPage.getComment().sendKeys(comment);
			Thread.sleep(2000);
			formPage.button().click();
			Thread.sleep(2000);
			Assert.assertTrue(formPage.successfullSubmit(), "Nisu uspesno sacuvani podaci");

			
	}
		

		}
	
	

}
