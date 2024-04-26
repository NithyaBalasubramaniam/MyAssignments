package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		boolean selected = driver.findElement(By.id("j_idt87:j_idt102")).isSelected();
		System.out.println("The Button is Disabled: "+selected);
		
		driver.findElement(By.id("j_idt87:multiple")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[1]")).click();
	}

}
