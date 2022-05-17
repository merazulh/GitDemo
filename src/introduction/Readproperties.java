package introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Readproperties {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
Properties prob = new Properties();
FileInputStream fi = new FileInputStream("C:\\Users\\merazul\\eclipse-workspace\\introduction\\src\\introduction\\config.properties");
	prob.load(fi);
	System.out.println(prob.get("browser"));
	String browsername= prob.getProperty("browser");
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\merazul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if (browsername.equals("safari")) {
	driver = new SafariDriver();
	}
	driver.get(prob.getProperty("url"));
	driver.manage().window().maximize();
	
}
}
