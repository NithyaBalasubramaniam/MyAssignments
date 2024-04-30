package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		//Login Module
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    //Click on the Create new account button
		driver.findElement(By.partialLinkText("account")).click();
		
		// Enter the First name and last Name
		WebElement FName = driver.findElement(By.name("firstname"));
		FName.sendKeys("Test");		
		WebElement LName = driver.findElement(By.name("lastname"));
		LName.sendKeys("Leaf");
		
		//Enter the E-mail address
		WebElement Mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    Mail.sendKeys("Test@gmail.com");
		
		//Enter the New password.
		WebElement Pwd = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		Pwd.sendKeys("123");
		
		//Handle all three dropdowns in Date of birth 
		WebElement Day = driver.findElement(By.id("day"));
		Select Date = new Select(Day);
		Date.selectByIndex(03);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select Bmonth = new Select(Month);
		Bmonth.selectByVisibleText("May");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select Byear = new Select(Year);
		Byear.selectByVisibleText("2001");
		
		//Select the radio button in Gender
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
