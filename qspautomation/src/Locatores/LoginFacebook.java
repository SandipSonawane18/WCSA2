package Locatores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("8380954224");
		
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("13renuka12");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
		

	}

}
