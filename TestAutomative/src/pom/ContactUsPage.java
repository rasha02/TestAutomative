package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	
	
	
	public void chooseSubtHeading()
	{
		
	new Select (BaseClass.getWebDriver().findElement(By.id("id_contact"))).selectByVisibleText("Webmaster");
	}

	public void fillEmailAdd()
	{
		
	BaseClass.getWebDriver().findElement(By.id("email")).sendKeys("test@gmail.com");
	
	}
	
	public void fillOrdRef ()
	{
	BaseClass.getWebDriver().findElement(By.id("id_order")).sendKeys("254");	
	}
	
	public void fillMssg()
	{
	BaseClass.getWebDriver().findElement(By.id("message")).sendKeys("Helooooo");
	}
	
	
	public void submitForm()
	{
	BaseClass.getWebDriver().findElement(By.id("submitMessage")).click();
	}
	
	
	public String getMssg()
	{
		
		return BaseClass.getWebDriver().findElement(
				By.xpath("//*[@id=\"center_column\"]/p")).getText();

	}
}

