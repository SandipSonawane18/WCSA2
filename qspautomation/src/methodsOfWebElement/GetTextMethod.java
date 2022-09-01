package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktm.com/en-in.html");
		Thread.sleep(3000);
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		Thread.sleep(2000);
		WebElement Title = driver.findElement(By.xpath("//p[@class='glide__content-headline--main glide__content-headline--secondary']"));
		String heading = Title.getText();
		System.out.println(heading);
		
		
	}
	
}