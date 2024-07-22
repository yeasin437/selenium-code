package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//tag Id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//only Id
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
        
		//tag class
		driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys("mobile");
	
		//tag attribute tag name optional
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("iphone");
		
		//tag class attribute tag name optional
		driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"\"]")).sendKeys("laptop");
	}

}
