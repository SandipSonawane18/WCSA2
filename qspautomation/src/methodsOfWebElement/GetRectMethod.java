package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktm.com/en-in.html");
		Thread.sleep(3000);
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		Thread.sleep(2000);
		WebElement BookNow = driver.findElement(By.xpath("//div[@class='c-btn ']/descendant::a[@class='c-btn__link c-btn__link--primary-dark ']"));
		Rectangle location = BookNow.getRect();
		
		System.out.println("The Location of the Book Now Button Is as Follows");
		System.out.println("Height Of Button="+location.getHeight());
		System.out.println("width Of Button="+location.getWidth());
		System.out.println("X-axis Distance="+location.getX());
		System.out.println("Y-axis Distance="+location.getY());

	}

}