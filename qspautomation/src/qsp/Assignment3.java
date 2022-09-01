package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=CjwKCAjwrZOXBhACEiwA0EoRDzDi7vmsss0wLQ8-LW7NmXVipFWJ8ra5oPn5o_be06lpyCbcC7dg0hoCHNcQAvD_BwE&gclid=CjwKCAjwrZOXBhACEiwA0EoRDzDi7vmsss0wLQ8-LW7NmXVipFWJ8ra5oPn5o_be06lpyCbcC7dg0hoCHNcQAvD_BwE");
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
		Thread.sleep(4000);
		WebElement copiedtext = driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neutral-400 fw-400']"));
		//driver.FE(by.xpath("//h2[contains(text='Fly anywhere. Fly everywhere0']"))
		
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		for(int i = 0;i<=2;i++)
		{
			act.clickAndHold(copiedtext).perform(); //clickAndHold Method
		}
		
		Thread.sleep(2000);
		Robot robo=new Robot();
	
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).click();
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		driver.findElement(By.name("btnk")).click();
						
	}

}
