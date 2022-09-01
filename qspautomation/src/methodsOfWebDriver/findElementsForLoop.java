package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsForLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("bike");
		Thread.sleep(3000);
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(int i=0;i<webelements.size();i++)
		{
			WebElement sugg = webelements.get(i);
			String listOfSuggestion = sugg.getText();
			System.out.println(listOfSuggestion);
		}

	}

}
