import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfirsttraining {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath(".//a[text( ) = 'Sign in']")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys("anilgulla943@gmail.com");
		
		driver.findElement(By.tagName("a")).click();
		

		driver.findElement(By.partialLinkText("use Inco")).click();
		
		driver.findElement(By.partialLinkText("Learn more")).click();
		
		driver.findElement(By.className("appbar-helpcenter-sections__link appbar-helpcenter-sections--community appbar-helpcenter-sections--active"));
	     
		//driver.findElement(By.xpath(".//span[text()='Next']")).click();
	     
	     
	
	
	}

}
