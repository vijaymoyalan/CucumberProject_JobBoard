package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class JobBoardActivity2 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given ("^Open job site URL$")
	public void givenJobURL()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@When("^User clicks Jobs for job list$")
	public void whenJobList()
	{
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/'][contains(.,'Jobs')]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String keyword = driver.findElement(By.xpath("//input[@name='search_keywords']")).getText();
		System.out.println("Text Keyword "+keyword);
	}
	
	@And("^Clicks on keywords text field for \"(.*)\" \"(.*)\" search$")
	public void andJobSearch(String job)
	{
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys(job);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();	
		String result = driver.findElement(By.xpath("//span[contains(.,'Search completed.')]")).getText();
		System.out.println(result+" for searched job "+job);
	}
	
	@And("^Search for Full Time jobs$")
	public void andFullTime()
	{
		driver.findElement(By.xpath("//a[@class='reset']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[contains(.,'Freelance')]")).click();
		driver.findElement(By.xpath("//label[contains(@class,'internship')]")).click();
		driver.findElement(By.xpath("//label[contains(@class,'part-time')]")).click();
		driver.findElement(By.xpath("//label[contains(@class,'temporary')]")).click();
		
		
		// selecting the job post
		driver.findElement(By.xpath("//h3[contains(.,'Automation Tester')]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// fetching the title
		System.out.println("Title of the job post is "+driver.findElement(By.xpath("//h1[@class='entry-title']")));
		
		// applying for the job post  
		driver.findElement(By.xpath("//input[contains(@class,'application_button button')]")).click();
											   
		  
		 // retrive email address
		  WebElement job_email = driver.findElement(By.xpath("//a[contains(@class,'job_application_email')]"));
		  String email = job_email.getText();
		  System.out.println("Send in your CV to email: "+email);	
		  
		  driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/'][contains(.,'Jobs')]")).click();
		  driver.findElement(By.xpath("//a[@class='reset']")).click();
	}
	
}
