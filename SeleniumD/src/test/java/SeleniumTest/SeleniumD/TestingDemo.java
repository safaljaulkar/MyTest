package SeleniumTest.SeleniumD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestingDemo {
	public static void main(String[] args) throws InterruptedException {
	
       //    ref                    class
	WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		// Text field
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		// button
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
		// dropdown

		WebElement a = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
		Select b = new Select(a); // For select dropdown we created object
		b.selectByVisibleText("Consultant");
		Thread.sleep(2000);
		// Alert popup
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		// radio button
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		// driver.quit();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();

	     // fields
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("rahul shetty");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rahulshetty@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Rahul@123");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		// dropdown select
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();
		// radio
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();

		// calendar
		// driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).click();

		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/input")).click();

		WebElement dateToSelect = driver.findElement(By.xpath("btn btn-success"));
		dateToSelect.click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}}
