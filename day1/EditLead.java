package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		
		//Click on the Leads Button. 
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the Field Using Xpath
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("TestLeaf1");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("TestLeaf2");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("TestLeaf3");
		
		//Enter the Field Using any Locator of Your Choice. 
		driver.findElement(By.name("departmentName")).sendKeys("TestLeaf4");
		driver.findElement(By.name("description")).sendKeys("TestLeaf5");
		driver.findElement(By.name("primaryEmail")).sendKeys("TestLeaf6@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(State);
		state.selectByVisibleText("Indiana");
		
		//Click on Create Button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Click on the edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the Description Field
		driver.findElement(By.name("description")).clear();
		
		//Fill Important Note Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("MuhammadBru");
		
		//Click on the update button. 
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Get the Title of the Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close the browser window
		driver.close();	

	}

}
