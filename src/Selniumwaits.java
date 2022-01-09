import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selniumwaits {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait (driver ,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("timerAlertButton")));
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		a.accept();
		// opening alert again
		driver.findElement(By.id("timerAlertButton")).click();
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		WebElement element2 = w.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.id("timerAlertButton"));
				
			}
		});
		element2.click();
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		
		a1.accept();
		a1.accept();
	}

}
