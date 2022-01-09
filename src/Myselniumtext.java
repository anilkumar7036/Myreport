import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myselniumtext {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//a[text () = 'Hot New Releases']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Movers and Shakers")).click();
		Thread.sleep(2000);
		
		/*
		 * driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		 * Thread.sleep(2000);
		 */
		

		
		
		 // driver.findElement(By.xpath(".//a[text() = 'Fresh']")).click();
		  //Thread.sleep(2000);
		 // driver.findElement(By.xpath(".//a[text()='Amazon Pay']")).click();
		 // Thread.sleep(2000);
		 // driver.findElement(By. xpath(".//a[text() ='Health, Household & Personal Care']")).click();
		 // Thread.sleep(2000);
		 
		//driver.findElement(By.linkText("Gift Ideas")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hp i5 laptops");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
