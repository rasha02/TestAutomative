package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.ContactUsPage;
import pom.HomePage;

public class ContactUsTest {


	@BeforeTest
	public void setUp() {
		
		BaseClass BC = new BaseClass();
		BC.setUp();
		//driver = BC.getWebDriver();
	}
	
	@Test(priority =1)
	public void testContactUs() throws InterruptedException
	{
		
		HomePage HP = new HomePage();
		HP.clickOnContactUs();
		
		ContactUsPage CP = new ContactUsPage();
		CP.chooseSubtHeading();
		CP.fillEmailAdd();
		CP.fillOrdRef();
		CP.fillMssg();
		CP.submitForm();
		
		
		//Thread.sleep(4000);
		
		assertEquals(CP.getMssg(), "Your message has been successfully sent to our team.");
	
	
	
	}
	
	
	
	
	/*@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().close();

	}*/
}
