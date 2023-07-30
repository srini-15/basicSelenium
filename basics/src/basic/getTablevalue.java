package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTablevalue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		/List<WebElement> ele = driver.findElements(By.xpath("(//td)[5]/parent::tr/parent::tbody/tr[i]/td[j]"));
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				WebElement ele=driver.findElement(By.xpath("(//td)[5]/parent::tr/parent::tbody/tr["+i+"]/td["+j+"]"));
				System.out.println( ele.getText());
			}
		}
		 
	//		 for(WebElement e:ele) {
//			 System.out.println(e.getText());
//		 }
		Thread.sleep(3000);
		driver.quit();
	}

}
