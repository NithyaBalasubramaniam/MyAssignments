package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateDropdown {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //Login Module
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the Create Lead link from shortcuts
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the mandatory fields on the web page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestLeaf01");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLeaf02");
		
		//Select Employee in the source dropdown (using index)
		WebElement Source = driver.findElement(By.xpath("//select[contains(@id,'dataSource')]"));
		Select Dd1 = new Select(Source);
		Dd1.selectByIndex(4);
        	
		//Select Automobile in the Marketing Campaign (using visibleText)
		WebElement Source1 = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select Dd2 = new Select(Source1);
		Dd2.selectByVisibleText("Automobile");
		
		//Select Corporation in Ownership (using value)
		WebElement Source2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select Dd3 = new Select(Source2);
		Dd3.selectByValue("OWN_CCORP");
		
		//Click on the Create Lead button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Verify the title of the current web page
		String title = driver.getTitle();
        if(title.contains("Lead"))
        {
        	System.out.println("Success");
        }
        else
        {
            System.out.println("Not Success");
        }
        
        //Close the browser window
        driver.close();
	}}
	
	