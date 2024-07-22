package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/");
	driver.manage().window().maximize();
	
	//name 
	//driver.findElement(By.name("user-name")).sendKeys("Yeasin");
	
	//id
	//boolean isDisplayed = driver.findElement(By.id("password")).isDisplayed();
	//System.out.println(isDisplayed);
	
	//linktext 
	//driver.findElement(By.linkText("TestNG")).click();
	//partial Link Text
//	driver.findElement(By.partialLinkText("protractor")).click();
	
	//class
List<WebElement> headerLinks = 	driver.findElements(By.className("leaf"));
System.out.println(headerLinks.size());

  //Tag Name
 List<WebElement>links = driver.findElements(By.tagName("a"));
 System.out.println(links.size());
 
 List<WebElement> imgLinks = driver.findElements(By.tagName("img"));
 System.out.println(imgLinks.size());
	

	}

}
