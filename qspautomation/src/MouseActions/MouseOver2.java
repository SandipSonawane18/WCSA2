package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		WebElement desktopmouse = driver.findElement(By.xpath("//a[.='Desktops']"));
		WebElement mac1mouse = driver.findElement(By.xpath("//a[.='Mac (1)']"));
		Actions act = new Actions(driver);
		act.moveToElement(desktopmouse).moveToElement(mac1mouse).click().perform();
	}

}
