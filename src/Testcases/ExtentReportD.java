package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportD {
	ExtentReports extent;
@BeforeTest	
public void config() {
	
String path=	System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle(" Test Automation ");
	reporter.config().setReportName("Test Result");
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	
	extent.setSystemInfo("Tester", "Merazul");

	}
@Test
public void initialDemo() {
	extent.createTest("initialDemo");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\merazul\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://rahulshettyacademy.com");
System.out.println(	driver.getTitle());
	extent.flush();
	
	
	
}	
}
