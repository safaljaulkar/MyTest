package SeleniumTest.SeleniumD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RahulShettyTest {

	@Test(priority=1)
public void LoginWithCorrectInput() {
	}
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		// button
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
		// dropdown

		WebElement a = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
		Select b = new Select(a); // For select dropdown we created object
		b.selectByVisibleText("Consultant");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Alert popupO
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		// radio button
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		driver.close();
		
		

	}
@Test(priority=2)
public void LoginnWithIncorrectUsername() {
	
}
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahul");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select")).click();
	
	//WebElement a = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
	//Select b = new Select(a); 
	//b.selectByVisibleText("Consultant");
	//try {
		//Thread.sleep(2000);
	//} catch (InterruptedException e) {
		//e.printStackTrace();
	//}
	// Alert popupO
	driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
	// radio button
	driver.findElement(By.xpath("//input[@id='terms']")).click();
	driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
	
	//*[@id="login-form"]/div[1]
	driver.close();



}


	
	
	
	
	
}















