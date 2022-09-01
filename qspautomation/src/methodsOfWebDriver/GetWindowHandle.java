package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.linkText("Open a popup window")).click(); //click on link-Open a popup window
	String ParentHandle = driver.getWindowHandle();
	System.out.println(ParentHandle);
	
	Set<String> allHandle = driver.getWindowHandles();
	
			for(String handle:allHandle) 
			{
				System.out.println(handle);
			}
	}

}
