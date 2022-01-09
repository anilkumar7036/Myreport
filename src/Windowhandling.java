import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\selnium dowloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.cssSelector("button#tabButton")).click();
		
		Set<String> childwindows = driver.getWindowHandles();
		
		Iterator<String> itr = childwindows.iterator();
		
		while(itr.hasNext()) {
			
		String childwindow = itr.next();
		
		if (childwindow.equals(parentwindow)) {
			System.out.println("This is parent window");
		}else {
			driver.switchTo().window(childwindow);
			String Childwindowtext = driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
			System.out.println(Childwindowtext);
			String expText = "This is a sample page";
			
			if(Childwindowtext.equals(expText)) {
				System.out.println("Text present in the child window");
			}else {
				System.out.println("Text not matching in the child window");
			}
		}
		
		}
		
		
		
	}

}
