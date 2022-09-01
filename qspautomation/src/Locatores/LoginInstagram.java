package Locatores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("sandip");
		driver.findElement(By.name("password")).sendKeys("sandip123");
		Thread.sleep(2000);
		WebElement Login = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		boolean statusOfLogin = Login.isEnabled();
		System.out.println(statusOfLogin);
		
		
	}

}
