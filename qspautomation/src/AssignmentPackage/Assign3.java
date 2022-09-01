package AssignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open a popup window")).click();
		//Parent Window handling
		String parent = driver.getWindowHandle();
		//Both Window handling
		Set<String> allhandle = driver.getWindowHandles();
		//child window close only
		
		for(String handle:allhandle)
		{
			if(!parent.equals(handle))
			{
				Thread.sleep(3000);
				driver.switchTo().window(handle);
				driver.close();
			}
			
		}
		
	}

}
