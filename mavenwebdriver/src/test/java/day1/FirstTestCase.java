package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//launch browser
	//	ChromeDriver driver = new ChromeDriver();
		//another approache
		WebDriver driver = new ChromeDriver();
		
		//Open URL 
		driver.get("https://www.opencart.com/");
		
		//validate title should be "Your Store"
		
		String actual_title = driver.getTitle();
		if(actual_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
  //close browser
		driver.close();
		//driver.quit();
	}

}
