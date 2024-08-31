package Technogeeks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {

		// ref class obj
		WebDriver driver = new ChromeDriver();

		// to launch browser
		driver.get("https://www.amezon.in/");

		// To get the current url
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// second way for  get url 
		//System.out.println(driver.getCurrentUrl());

		// Print the title
		System.out.println(driver.getTitle());
		
		//for backward  and forward
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
 
		driver.navigate().refresh();
		driver.manage().window().maximize();
		// driver.close()   //close current open browser
		driver.quit();      //close all open window
		

	

	}

}
