package OprationalMethodsOfDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sandip/OneDrive/Desktop/HTML.Docs/multiselectdropdown.html");
		WebElement MultipleDD = driver.findElement(By.id("menu"));
		Select Status = new Select(MultipleDD);
		
		for(int i=2;i<=5;i++)
		{
			Status.selectByIndex(i);
		}
		
		List<WebElement> firstoption = Status.getAllSelectedOptions();
				
		
		for(WebElement selected:firstoption)
		{
				String allselected = selected.getText();
				System.out.println(allselected);
				
		}
	}	
}