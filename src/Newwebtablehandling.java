import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwebtablehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/webtables");
		
		WebElement table = driver.findElement(By.xpath(".//div[@class ='rt-tbody']"));
		
		List<WebElement> rows = table.findElements(By.tagName("div"));
		
		for(int i= 0 ;i<rows.size();i++) {
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("div"));
			
			for(int j=0 ;j<cols.size();j++) {
				String cellvalues  = cols.get(j).getText();
				System.out.println(cellvalues);
			}
			//System.out.println("");
			
		}
		
		

	}

}
