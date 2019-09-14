package pom;

import org.openqa.selenium.By;

public class LoginPage {

	public void Login(String Email, String Password)
	{
		
		BaseClass.getWebDriver().findElement(By.id("email")).sendKeys(Email);
		BaseClass.getWebDriver().findElement(By.id("passwd")).sendKeys(Password);
		//BaseClass.getWebDriver().findElement(By.id("SubmitLogin")).click();
		BaseClass.getWebDriver().findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
	
	}
	
	
	
	public String getErrorMssg()
	{
		
		return BaseClass.getWebDriver().findElement(
				By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();

	}
	
}
