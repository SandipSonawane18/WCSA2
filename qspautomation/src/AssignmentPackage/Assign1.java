//getWindowHandle-close both Parent and child 
package AssignmentPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open a popup window")).click();
		String ParentHandle = driver.getWindowHandle();
		
		Set<String> allHandles = driver.getWindowHandles();
		// Close the both windows
		
		for(String both:allHandles)
		{
			driver.switchTo().window(both);
			driver.close();
		}
		
		

}
}
