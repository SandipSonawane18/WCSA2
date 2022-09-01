package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandip/OneDrive/Desktop/HTML.Docs/username.html");
		driver.findElement(By.id("un")).sendKeys("Admin");
		
		WebElement frameElement = driver.findElement(By.id("frid"));
		
		driver.switchTo().frame(frameElement); //frame using frame-name
		Thread.sleep(3000);
		driver.findElement(By.id("pwd")).sendKeys("Admin123");
	}
		

}
