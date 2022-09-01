package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktm.com/en-in.html");
		Thread.sleep(3000);
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		Thread.sleep(2000);
		WebElement BookNow = driver.findElement(By.xpath("//div[@class='c-btn ']/descendant::a[@class='c-btn__link c-btn__link--primary-dark ']"));
		boolean status = BookNow.isDisplayed();
		System.out.println(status);

	}

}