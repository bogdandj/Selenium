package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentPage extends BasicPage {
	
	public AppointmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;

	

	public WebElement getFacilitySelect() {
		return driver.findElement(By.id("combo_facility"));
	}
	
	public WebElement getHospitalReadmission() {
		return driver.findElement(By.className("checkbox-inline"));
	}
	
	public WebElement getCheckbox() {
		return driver.findElement(By.className("checkbox-inline"));
	}
	
	public WebElement getRadioButton() {
		return driver.findElement(By.xpath("//*[@name='programs'][@value='\"+ radioInputName +\"']"));
	}
	
	public WebElement getInputDate() {
		return driver.findElement(By.className("input-group"));
	}
	
	public WebElement getTextArea() {
		return driver.findElement(By.id("txt_comment"));
	}
	
	public WebElement getButtonAppointment() {
		return driver.findElement(By.id("btn-book-appointment"));
	}
	
	public boolean isFormPresented() {
		List<WebElement> forms = driver.findElements(By.id("id=appointment"));
		if(forms.size() == 0) {
			return false;
		}
		else {
			return true;
		}
	}

}




