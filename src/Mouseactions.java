import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\eclipsefolder\\Selniumtexting\\Properties\\Locators.properties");

     Properties prop = new Properties();
	prop.load(fis);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	
	WebElement doubleclickbut = driver.findElement(By.cssSelector(prop.getProperty("doubleclick_buuton")));
	WebElement rightclickbut =driver.findElement(By.cssSelector(prop.getProperty("rightclick_button")));
	Actions act = new Actions(driver);
	act.moveToElement(doubleclickbut).doubleClick().build().perform();
	Thread.sleep(2000);
	act.moveToElement(rightclickbut).contextClick().build().perform();
	Thread.sleep(2000);
	
	driver.navigate().to("https://demoqa.com/text-box");
	WebElement fullnameel = driver.findElement(By.id(prop.getProperty("fullname_text")));
	WebElement emailname = driver.findElement(By.id(prop.getProperty("email-txt")));
	act.keyDown(fullnameel,Keys.SHIFT).sendKeys(prop.getProperty("fullName_value")).build().perform();
	act.keyUp(emailname,Keys.SHIFT).sendKeys(prop.getProperty("email_value")).build().perform();
	
	
	}

}
