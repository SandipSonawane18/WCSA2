package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorCheck {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='7']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='×']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='=']")).click();
	String solution = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
	System.out.println("Answer is"+ solution);
	

	}

}
