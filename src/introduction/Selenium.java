package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium {

	@Test
	public void loging() {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\merazul\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();  
driver.get("https://facebook.com");

	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("merazul.haque@yahoo.com");
	driver.findElement(By.id("pass")).sendKeys("M4049035505&s");
	driver.findElement(By.name("login")).click();
}
	}

 