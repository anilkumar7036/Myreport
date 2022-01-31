import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		WebElement table = driver.findElement(By.xpath(".//table[@class = 'dataTable']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		
		for (int i = 0 ; i<rows.size();i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
		for (int j=0 ; j<cols.size();j++) {
			String Cellvalues = cols.get(j).getText();
			System.out.print("  " +Cellvalues+"  ");
	
		
		}
			System.out.println("  ");
		
			}

	}

}
