package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class JobBoardActivity1 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given ("^Open wp admin URL$")
	public void givenFunctionName()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-login.php");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);		
	}
	
	@When ("^User enter \"(.*)\" and \"(.*)\"$")
	public void whenFunctionName(String username, String password)
	{
		// finding the element and passing credentials
		  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
	
	@And ("^Click on menu item Users$")
	public void andFunctionNameMenu()
	{
		// clicking on the user menu item
		driver.findElement(By.xpath("(//div[contains(@class,'wp-menu-name')])[9]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@And ("^Click on Add New button fill details and click on new button$")
	public void andFuntionNameNew()
	{
		driver.findElement(By.xpath("(//a[@href='https://alchemy.hguy.co/jobs/wp-admin/user-new.php'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='user_login'][contains(@id,'login')]")).sendKeys("Aug1508");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("aug1508@gmail.com");
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("AUG");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("SDET");
		driver.findElement(By.xpath("//input[@value='Add New User']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}
	
	@Then ("^Verify the user creation$")
	public void thenFunctionNameCreation()
	{
		String message = driver.findElement(By.xpath("//p[contains(.,'New user created. Edit user')]")).getText();
		System.out.println(message);
		Assert.assertEquals(message.contains("New user created"), true);
	}
	
	@And ("^Close the browser$")
	public void andCloseBrowser()
	{
		driver.close();
		
	}

}
