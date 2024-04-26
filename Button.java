package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
        boolean Button = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
        System.out.println("The Button is Enabled: " +Button);
        
        Point location = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
        System.out.println("The position of the SUBMIT Button is: "+location);
          
        String cssValue = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("Color");
	    System.out.println("The background Color is: "+cssValue);
	    
	    Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
	    System.out.println("The height and width is: "+size);
	
        driver.findElement(By.name("j_idt88:j_idt90")).click();
        System.out.println("Title of the page is: " + driver.getTitle());
        
        driver.close();
	}

}
