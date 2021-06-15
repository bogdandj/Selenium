package projekat_10_06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestPage {
	

	private WebDriver driver;

	public RequestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAddFriend() {
		return driver.findElement(By.xpath("//*[contains(text(), 'Add friend')]"));
	}
	
	public WebElement getCancelRequest() {
		return driver.findElement(By.xpath("//*[contains(text(), 'Cancel Request')]"));
	}
	
	public WebElement getMessage() {
		return driver.findElement(By.xpath("//*[@class='ossn-system-messages-inner']/div"));
	}
	
	//numberOfElementsToBe
	
	public String getMessageRequest() {
		return driver.findElement(By.className("alert-success")).getText();
	}
	
	public boolean isAddFriendButtonPresent() {
		List<WebElement> buttons = driver.findElements(By.xpath("//*[contains(text(), 'Add friend')]"));
		if(buttons.size() == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isCancelRequestButtonPresent() {
		List<WebElement> buttons = driver.findElements(By.xpath("//*[contains(text(),  'Cancel Request')]"));
		if(buttons.size() == 0) {
			return false;
		}
		else {
			return true;
		}
	}

}