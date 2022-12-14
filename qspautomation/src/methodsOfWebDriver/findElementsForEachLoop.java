package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsForEachLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("bike");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//li[@class='sbct']"));
		Thread.sleep(2000);
		
		for(WebElement bike:suggestion)
		{
			String list = bike.getText();
			System.out.println(list);
		}

	}

}
