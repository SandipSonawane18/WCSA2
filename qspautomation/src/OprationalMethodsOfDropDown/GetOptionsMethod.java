package OprationalMethodsOfDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sandip/OneDrive/Desktop/HTML.Docs/multiselectdropdown.html");
		WebElement MultipleDD = driver.findElement(By.id("menu"));
		Select Status = new Select(MultipleDD);
		List<WebElement> AllOptions = Status.getOptions();
		
		for(int i=0;i<AllOptions.size();i++)
		{
			WebElement op = AllOptions.get(i);
					String options = op.getText();
					System.out.println(options);
					Thread.sleep(2000);
		}		
	}	
}