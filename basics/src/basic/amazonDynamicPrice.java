package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonDynamicPrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi ");	
		d.findElement(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/descendant::div[@aria-label=\"redmi a2\"]")).click();
		d.findElement(By.partialLinkText("Redmi A2 (Classic Black, 2GB RAM, 32GB Storage) ")).click();
		WebElement ele = d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div//descendant::span[@class=\"a-price-whole\"]"));
		System.out.println( ele.getText());
		d.quit();
	}

}
