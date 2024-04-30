package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		//Login Module
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click the "Leads" link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[2]")).click();
		
		//Enter the phone number
		WebElement PhoneNo = driver.findElement(By.name("phoneNumber"));
		PhoneNo.sendKeys("1234");
		
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[(text()='Find Leads')]")).click();
		
		//Capture the lead ID of the first resulting lead
		String text = driver.findElement(By.linkText("12020")).getText();
		System.out.println("First resulting Lead ID is: "+text);
		
		//Click the first resulting lead
		driver.findElement(By.linkText("12020")).click();
		
		//Click the "Delete" button
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		//Click "Find leads" again
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter the captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List
		WebElement Result = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		if (Result.isDisplayed()) {
			System.out.println("No Records To Display");
		} else {
            System.out.println("Not Success");
		}
		
		//Close the browser
		driver.close();
	}

}
