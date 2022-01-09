import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlistelements {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  =  new ChromeDriver();
		
         driver.get("https://demoqa.com/select-menu");
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
         
         WebElement dropdownxpath  = driver.findElement(By.id("oldSelectMenu"));
         
         Select s = new Select(dropdownxpath);
         
         s.selectByIndex(0);
         Thread.sleep(2000);
         
         s.selectByVisibleText("White");
         Thread.sleep(2000);
         s.selectByValue("8");
         Thread.sleep(2000);
         
         WebElement multidropdownxpath  = driver.findElement(By.name("cars"));
         
         Select mcs = new Select (multidropdownxpath);
         mcs.selectByIndex(3);
         Thread.sleep(5000);
         mcs.selectByVisibleText("Volvo");
         Thread.sleep(5000);
         mcs.selectByValue("saab");
         Thread.sleep(5000);
         mcs.deselectByIndex(1);
        Thread.sleep(5000);
         mcs.deselectByVisibleText("Audi");
         Thread.sleep(5000);
         
         
         
      
         
         
         
	}

}
