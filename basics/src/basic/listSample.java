package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
		System.out.println(ele.size());
		for(WebElement e:ele) {
			System.out.println(e.getText());
		}
		Thread.sleep(5000);
		driver.close();
	}

}
