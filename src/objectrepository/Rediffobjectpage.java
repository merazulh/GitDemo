package objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rediffobjectpage {
	WebDriver driver;
	public  Rediffobjectpage(WebDriver driver) {
		
		
	this.driver=driver;
 }
	By username=By.xpath("");
	By password = By.name("");
	By submitte = By.id("");
	
	
	public WebElement username() {
		
	return	driver.findElement(username);
	}
	public WebElement password() {
	return	driver.findElement(password);
	}
	public WebElement submitte() {
	return	driver.findElement(submitte);
	}
	}
	
	

	




