package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktm.com/en-in.html");
		Thread.sleep(3000);
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		Thread.sleep(2000);
		WebElement BookNow = driver.findElement(By.xpath("//div[@class='c-btn ']/descendant::a[@class='c-btn__link c-btn__link--primary-dark ']"));
		Point location = BookNow.getLocation();	
		int xAxis = location.getX();
		int yAxis = location.getY();
		System.out.println("The Location of the Book Now Button Is as Follows");
		System.out.println("X-axis Distance="+xAxis);
		System.out.println("Y-axis Distance="+yAxis);

	}

}