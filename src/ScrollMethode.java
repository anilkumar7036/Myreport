import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollMethode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)", "");
		
	WebElement scrolltoElement = 	driver.findElement(By.xpath(".//h2[text() ='What is a window in Selenium?']"));
	js.executeScript("arguments[0].scrollIntoView()",scrolltoElement );
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath(".//button[@class='modal__close']")).click();
		
	boolean value =	driver.findElement(By.xpath(".//h2[text() ='What is a window in Selenium?']")).isDisplayed();
	
	if(value==true) {
		System.out.println("Element found in dom");
	}else {
		System.out.println("Element not found in dom");
	}
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0,document.body.scrollTop)");
	}
}