package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(WebElement link : links) {
		String href = link.getAttribute("href");
		if(href!=null && !href.isEmpty()) {
			System.out.println(href);
		}
	}
	System.out.println(links.size());
	
	driver.findElement(By.linkText("Samsung galaxy s6 ")).click();
		

	}

}
