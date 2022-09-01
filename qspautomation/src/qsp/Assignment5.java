//Child close
package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
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
		driver.switchTo().window(ch);
		System.out.println("child"+driver.getTitle());
		driver.close();
		
	}

}
