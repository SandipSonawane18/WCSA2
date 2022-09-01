package WebBasedPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupAccept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandip/OneDrive/Desktop/HTML.Docs/alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		
	}
}
