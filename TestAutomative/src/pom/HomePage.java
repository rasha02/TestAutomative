package pom;

import org.openqa.selenium.By;

public class HomePage {

  public void clickOnSignIn()
  
   {
	BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"))
			.click();
	}


  
  public void clickOnContactUs()
  {
	  
	  BaseClass.getWebDriver().findElement(By.id("contact-link")).click();
	  
	  
  }
}
