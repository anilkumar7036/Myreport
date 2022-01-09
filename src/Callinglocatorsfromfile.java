import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Callinglocatorsfromfile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream  fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\eclipsefolder\\Selniumtexting\\Properties\\Locators.properties");
		
		Properties prop = new  Properties();
		
		prop.load(fis);
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe"); 
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        
        driver.get(prop.getProperty("url"));
        
        Thread.sleep(2000);
        
       
        
         // driver.findElement(By.xpath(".//h5[text() ='Elements']")).click();
       // Thread.sleep(2000);
        
        driver.findElement(By.xpath(prop.getProperty("SideNav_Textbox"))).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id(prop.getProperty("fullname_text"))).sendKeys(prop.getProperty("fullName_value"));
        Thread.sleep(2000);
        
        driver.findElement(By.id(prop.getProperty("email-txt"))).sendKeys(prop.getProperty("email_value"));
        Thread.sleep(2000);
        driver.findElement(By.xpath(prop.getProperty("Current_adress"))).sendKeys(prop.getProperty("current_adresss"));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath(prop.getProperty("sideNav-Checkbox"))).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath(prop.getProperty("toggle"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//span[text() ='Desktop']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(prop.getProperty("downloads_ckb"))).click();
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
