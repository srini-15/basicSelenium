package demoQA;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class bookStore01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream("./data.properties");
		p.load(fis);
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();",ele);
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
		//Thread.sleep(3000);
		ele.click();
		WebElement ele2 = driver.findElement(By.id("see-book-You Don't Know JS"));
		//System.out.println(ele2.getText());
		if(ele2.isDisplayed()) {
			ele2.getText().equals("You Don't Know JS");
			int z=ele2.getLocation().getX();
			int a=ele2.getLocation().getY();
			js.executeScript("window.scrollBy("+z+","+a+")");
			
			WebElement ele3 = driver.findElement(By.xpath("(//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[2]/../descendant::div[@class='rt-td'])[3]"));
			System.out.println("autour name is :"+ele3.getText());
			
			WebElement ele4 = driver.findElement(By.xpath("(//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[2]/../descendant::div[@class='rt-td'])[4]"));
			System.out.println("publisher name is :"+ele4.getText());
			ele2.click();
		}
		
		//Thread.sleep(3000);
		
		driver.quit();

	}

}
