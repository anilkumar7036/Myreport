import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//normal alert
		driver.findElement(By.cssSelector("button#alertButton")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		String alerttexting =a.getText();
		System.out.println("Normal alert message :"+alerttexting);
		Thread.sleep(2000);
		a.accept();
		//conform alert
		driver.findElement(By.xpath(".//button[@id = 'confirmButton']")).click();
		Thread.sleep(1000);
		Alert a1 = driver.switchTo().alert();
		String alerttexting1 =a1.getText();
		System.out.println("Conform alert message :"+alerttexting1);
		Thread.sleep(2000);
		a1.accept();
		driver.findElement(By.xpath(".//button[@id = 'confirmButton']")).click();
	     	a1.dismiss();
		//Prompt alert
	     	
		driver.findElement(By.xpath(".//button[@id = 'promtButton']")).click();
		Alert a2 = driver.switchTo().alert();
		String alertprompt =a2.getText();
		System.out.println("Prompt  alert message:"+alertprompt);
		a2.sendKeys("anilkumar");
		a2.accept();
		driver.findElement(By.xpath(".//button[@id = 'promtButton']")).click();
		a2.dismiss();
	}

}
