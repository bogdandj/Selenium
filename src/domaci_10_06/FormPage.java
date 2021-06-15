package domaci_10_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FormPage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public FormPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 5);
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getRadio(String value) {
		System.out.println(value);
		return driver.findElement(By.xpath("//*[@name='gender'][@value='" + value + "']"));
		
	}

	public WebElement getDateOfBirth() {
		return driver.findElement(By.id("dob"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getRole() {
		return driver.findElement(By.id("role"));
	}

	public WebElement getWaysOfDevelopment(String value) {
		return driver.findElement(By.xpath("//*[@type='checkbox'][@value='" + value + "']"));
	}

	public WebElement getComment() {
		return driver.findElement(By.id("comment"));
	}

	public WebElement button() {
		return wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
	}

	public boolean successfullSubmit() {
		return driver.findElements(By.cssSelector("[style='visibility: visible']")) != null;
	}

}
