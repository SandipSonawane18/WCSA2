package WebBasedPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class chrom {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='widget-content']/descendant::input[@type='text'])[1]")).sendKeys("Automation");
		new Actions(driver).doubleClick(driver.findElement(By.xpath("(//div[@class='widget-content']/descendant::input[@type='text'])[1]"))).perform();
		
		Thread.sleep(3000);
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
				
	}

}
