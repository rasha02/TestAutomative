package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;

	
	public void setUp() {
		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("http://automationpractice.com");

		driver.manage().window().maximize();

	}
	
	
	public static WebDriver getWebDriver()
	{
		return driver;
	}
}
