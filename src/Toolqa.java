import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolqa {
	
	


	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe"); 
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        
        driver.get("https://demoqa.com/elements");
        
        Thread.sleep(2000);
        
       
        
         // driver.findElement(By.xpath(".//h5[text() ='Elements']")).click();
       // Thread.sleep(2000);
        
        driver.findElement(By.xpath(".//span[text() = 'Text Box']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("userName")).sendKeys("Anilkumar");
        Thread.sleep(2000);
        
        driver.findElement(By.id("userEmail")).sendKeys("anilgulla913@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//textarea[@placeholder='Current Address']")).sendKeys("5-136c,S/o srinivasrao,chavitipalem,santhamaguluru,praksam,andhrapradesh");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath(".//span[text() = 'Check Box']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//button [@aria-label = 'Toggle']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//span[text() ='Desktop']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//span[text() ='Downloads']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//span[text() = 'Text Box']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.id("permanentAddress")).sendKeys("5-136c,S/o srinivasrao,chavitipalem,santhamaguluru,praksam,andhrapradesh");
        Thread.sleep(2000);
        driver.navigate().to("https://demoqa.com/radio-button");
        
        driver.findElement(By.xpath(".//label[text() = 'Yes']")).click();
        
        
        
        
     
	
	
	}

}
