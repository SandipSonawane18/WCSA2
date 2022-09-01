package OprationalMethodsOfDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sandip/OneDrive/Desktop/HTML.Docs/multiselectdropdown.html");
		WebElement MultipleDD = driver.findElement(By.id("menu"));
		Select Status = new Select(MultipleDD);
		boolean St = Status.isMultiple();
		System.out.println(St);
		
		

	}

}
