//Both Close
package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> browser = driver.getWindowHandles();
		
		
		Iterator<String> it = browser.iterator();
		String pw = it.next();
		String ch = it.next();
		
		//for child
		{
			Thread.sleep(2000);
		driver.switchTo().window(ch);
		driver.switchTo().window(pw);
		driver.close();
		}
	}

}
