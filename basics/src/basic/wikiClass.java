package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikiClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.get("https://en.wikipedia.org/wiki/Tamil_Nadu");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js=(JavascriptExecutor)d;
		WebElement ele = d.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[3]"));
		int x= ele.getLocation().getX();
		int y= ele.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(5000);
		
		d.close();

	}

}
