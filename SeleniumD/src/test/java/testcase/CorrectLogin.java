package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class CorrectLogin extends BaseTest {

	@Test(priority = 1)

	public static void VerifyRegisterWithNewUser() {

		System.out.println("Start Execution");
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("tom");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("jerry");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Jerry1489@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

		String Exp = "Your registration completed";
		String Act = driver.findElement(By.xpath("//div[@class='result']")).getText();
		Assert.assertEquals(Exp, Act);

		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();

	}

	@Test(priority = 2)

	public static void VerifyLoginWithCorrectUsername() {

		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Jerry1489@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String Exp = "Jerry1489@gmail.com";
		String Act = driver.findElement(By.xpath("//a[@class='account']")).getText();
		Assert.assertEquals(Exp, Act);

	}

	@Test(priority = 3)
	public static void VerifyBookPurchase() {
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Jerry1489@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("(//a[@class=''])[2]")).click(); // absolute xpath used
		driver.findElement(By.xpath("//*[@class='active']")).click(); // dynamic xpath
		driver.findElement(By.xpath("//select[@id='products-orderby']")).click();

	}
}
