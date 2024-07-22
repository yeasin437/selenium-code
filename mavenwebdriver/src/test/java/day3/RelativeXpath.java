package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("Laptop");
		
		//Xpath with multiple attribute
	//	driver.findElement(By.xpath("//input[@placeholder='Search store'][@aria-label='Search store']")).sendKeys("phone");
        
		//xpath with multiple attributes with and operator
	//	driver.findElement(By.xpath("//input[@placeholder='Search store'and @aria-label='Search store']")).sendKeys("phone");
		
		//xpath with multiple attributes with or operator
		driver.findElement(By.xpath("//input[@placeholder='Search store'or @aria-label='Search store']")).sendKeys("phone");
		
	}

}
