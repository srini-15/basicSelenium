package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic001 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]")).click();
		driver.switchTo().frame("app");			
		//for the hidden frame, directly pass the frame name or else it wont work
		
		driver.findElement(By.xpath("(//span[@class='MrEfLc'])[4]")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
