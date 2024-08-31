import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PracticeTest {
	public static void main(String[] args)  {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input [@id='username']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//input [@id='password']")).sendKeys("learning");
	
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[1])")).click();
	
	
	
	//*[@id="usertype"]
	
	
	
	System.out.println("1");
    
	
	
	//driver.navigate().back();

	}

}
