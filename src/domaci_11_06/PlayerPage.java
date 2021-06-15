package domaci_11_06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PlayerPage {
	
	
	private WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;


	public PlayerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getRadioButton() {
		return this.driver.findElement(By.xpath("html/body/div/header/p[2]"));
	}

	public void playVideo() {
		
	}
	
	public WebElement getCurrentTime() {
		return this.driver.findElement(By.xpath("//*[@aria-label='Current time']"));
	}
	
	public String getTimeString() {
		return this.driver.findElement(By.xpath("//*[@aria-label='Current time']")).getText();
	}
	
	public WebElement getCurrentVolume() {
		return this.driver.findElement(By.xpath("//*[@aria-label='Volume']"));
	}
	
	public String getVolumeString() {
		return this.driver.findElement(By.xpath("//*[@aria-valuenow]")).getText();
	}
	
	int i=Integer.parseInt(getVolumeString());  
	
	public void volumeDown(int i) {
		js.player.decreaseVolume("arguments[0]/100)", i);
		
	}

	
}
