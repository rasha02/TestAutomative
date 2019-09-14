package tests;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.LoginPage;

public class LoginPageTest {

	@BeforeTest
	public void setUp() {
		
		BaseClass BC = new BaseClass();
		BC.setUp();
		//driver = BC.getWebDriver();
	}

	@Test(priority = 1)
	public void testLoginMissingPassword() {

		HomePage HP = new HomePage();
		HP.clickOnSignIn();
		

		LoginPage LP = new LoginPage();
		LP.Login("test@gmail.com", "");
		
		//String missingPasswordText = LP.getErrorMssg();
		assertEquals(LP.getErrorMssg(), "Password is required.");
	}

	@Test(priority = 2)
	public void testLoginWithIncorrectPassword() {
		
		HomePage HP = new HomePage();
		HP.clickOnSignIn();
		
		LoginPage LP = new LoginPage();
		LP.Login("test@gmail.com", "testpass");
		
		//String incorrectPasswordText = LP.getErrorMssg();
		assertEquals(LP.getErrorMssg(), "Authentication failed.");
	}
	
	
  /*	@Test(priority = 2)
	public void testLoginWithExixtingEmailAdress() throws InterruptedException
	{
		driver.findElement(By.id("email_create")).sendKeys("test@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		String alreadyExixtedEmailAdress = driver.findElement(
				By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText();

		assertEquals(
				alreadyExixtedEmailAdress,
				"An account using this email address has already been registered. Please enter a valid password or request a new one.");
	}*/

	/*@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().close();

	}*/

}
