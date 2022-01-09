import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1") ;
		String  text = driver.findElement(By.xpath(".//h1[@id ='sampleHeading']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2") ;
		String  text1 = driver.findElement(By.xpath(".//h1[@id ='sampleHeading']")).getText();
		System.out.println(text1);
	}

}