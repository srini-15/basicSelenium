package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicapp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div")).click();
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();//a[@aria-label='Google apps']
		driver.switchTo().frame("app");// why app is provided here?
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//*[@class='j1ei8c'])[4]/descendant::[@href='https://www.youtube.com?authuser=0']")).click();
		WebElement ele = driver.findElement(By.xpath("//li[contains(@class,'j1ei8c')]//descendant::a[@href=\"https://www.youtube.com\"]"));
		ele.click();

		System.out.println("elo");
		Thread.sleep(5000);
		driver.close();
	}	

}
