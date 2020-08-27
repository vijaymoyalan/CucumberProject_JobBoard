package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class JobBoardActivity3 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given ("^Open jobs sites URL$")
	public void givenJobURL()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@And ("^Go to Post a Job pages$")
	public void andPostJob()
	{
		driver.findElement(By.xpath("//a[contains(.,'Post a Job')]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	
	@When ("^job information detail is filled \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
	public void whenJobInfo(String email,String title, String appemail, String website, String company) throws InterruptedException
	{
		
		// entering the email ID#
		driver.findElement(By.xpath("//input[@name='create_account_email']")).sendKeys(email);
		Thread.sleep(2000);
		
		// entering the new job details
		 driver.findElement(By.xpath("//input[@name='job_title']")).sendKeys(title);
		 Thread.sleep(5000);
		 
		 
		// entering the discription
		// driver.findElement(By.xpath("//div[@class='field required-field']//div[@class='wp-job_description-wrap']//div[@class='wp-editor-container']//div[@id='mceu_16']//iframe[@id='job_description_ifr']//body[@id='tinymce']//p[1]")).sendKeys("Test Opening");
		 
	    // scrolling the page down
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 

		 
	// entering other details
		 // application email
		 System.out.println("Application Email "+email);
		 String txt1=driver.findElement(By.xpath("//input[contains(@name,'application')]")).getText();
		 System.out.println(txt1);
		 driver.findElement(By.xpath("//input[contains(@name,'application')]")).sendKeys(appemail);
		 Thread.sleep(5000);
		 
		 // website
		 driver.findElement(By.xpath("//input[@name='company_website']")).sendKeys(website);
		 Thread.sleep(2000);
		 
		 // company name
		 driver.findElement(By.xpath("//input[@name='company_name']")).sendKeys(company);
		 Thread.sleep(2000);
		 
	// publishing the job
		 WebElement publish = driver.findElement(By.xpath("//input[@name='submit_job']"));
		 publish.click();
		 System.out.println("job vacancy is submitted for review");
		 Thread.sleep(2000);
	
	// republish after review
		 driver.findElement(By.xpath("//input[@type='submit'][contains(@id,'button')]")).click();
		 System.out.println("job vacancy is published");
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		 
	// publish confirmation
		 driver.findElement(By.xpath("//div[@class='editor-post-publish-panel__header-published'][contains(.,'Published')]"));
		 
	// Job successfully posting
		 String posting = driver.findElement(By.xpath("//div[@itemprop='text']")).getText();
		 System.out.println(posting);
		 Assert.assertEquals("Job submitted successfully. Your listing will be visible once approved.",posting);	
	}
	
	@Then ("^Goto the Job page$")
	public void thenJobPage()
	{
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);		
	}
	
	@And ("^Confirm job listings \"(.*)\"$")
	public void andJobListing(String job)
	{
		driver.findElement(By.xpath("input[@name='search_keywords']")).sendKeys(job);
		List<WebElement> Posting = driver.findElements(By.xpath("(//div[@class='position'])[1]"));
		for(int i=0;i< Posting.size();i++)
		{
			if(job == Posting.get(i).getText())
				System.out.println("Job has been posted");
			else
				System.out.println("Job posting is pending for approval");
		}
	}
	
	@And ("^Close browsers")
	public void andClose()
	{
		driver.close();
	}

}
