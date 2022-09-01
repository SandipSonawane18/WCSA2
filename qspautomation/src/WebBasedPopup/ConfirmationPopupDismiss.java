//using dismiss method for confirmation popup
package WebBasedPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopupDismiss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandip/OneDrive/Desktop/HTML.Docs/confirmation.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		al.dismiss();
			
	}
}
