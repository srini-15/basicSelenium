package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableautomate001 {
	
	    public static void main(String[] args) {
	       

	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the sample website with the dynamic table
	        String url = "https://www.w3schools.com/html/html_tables.asp";
	        driver.get(url);

	        // Assuming the dynamic table is the first table on the page
	        WebElement table = driver.findElement(By.xpath("//table[1]"));

	        // Get all rows from the table
	        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
	        System.out.println(rows.size());
//	        // Skip the header row (contains th elements)
//	        for (int i = 1; i < rows.size(); i++) {
//	            // Get all columns in the row
//	            java.util.List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
//
//	            // Extract and print data from each column
//	            for (WebElement col : cols) {
//	                System.out.print(col.getText() + "\t");
//	            }
//	            System.out.println();
//	        }

	        // Close the browser
	        driver.quit();
	    }
	}


