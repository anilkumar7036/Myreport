import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingelementsbylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/selenium-webdriver/dropdown-in-selenium/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		 
		 List<WebElement> listtextbox = driver.findElements(By.tagName("h2"));
		 String explink = "What is Select Class in Selenium?";
		 
        listtextbox.size();
        System.out.println("no of h2 tags :"+listtextbox.size() );
        
        for (int i =0 ;i<listtextbox.size();i++) {
        	
        	String actlink = listtextbox.get(i).getText();
        	if (actlink.equals(explink)) {
        		System.out.println(explink + "Found in tools Qa page");
        	}else {System.out.println(explink + "Not Found in tools Qa page");
        	}
        
        
        
        }
        	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //listtextbox.get(0).sendKeys("anil");
		// listtextbox.get(1).sendKeys("kumar");
		// listtextbox.get(2).sendKeys("gulla");
		// listtextbox.get(3).sendKeys("adressvalue");
		// List<WebElement> radiobutton = driver.findElements(By.tagName("button")); 
		// radiobutton.get(0).click();

	}

}
