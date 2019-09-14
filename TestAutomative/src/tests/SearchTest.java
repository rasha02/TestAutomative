package tests;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.SearchClass;

public class SearchTest {

	@BeforeTest
	public void setUp() {
		
		BaseClass BC = new BaseClass();
		BC.setUp();
		//driver = BC.getWebDriver();
	}
	
	
	
	@Test
	public void checkAllItemsIStock()
	{
		
		SearchClass SC = new SearchClass();
		SC.search("dress");
		
		List <WebElement> itemsList = SC.getInStockButtons();
		
		//itemsList.size();		
		for (WebElement item : itemsList)
		{
			assertEquals(item.getText(),"In stock");
		}
		
	}
	
	
	
	
	
	
	
	/*@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().close();

	}*/
}
