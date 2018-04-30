package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions 
{
	WebDriver driver;

	@Test
	public void test_UsingHardAssertion() 
	{
		driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Google", driver.getTitle());
		WebElement myAccount = driver.findElement(By.linkText("Gmail"));
		Assert.assertTrue(myAccount.isDisplayed());
		myAccount.click();
		
   
	}
}
