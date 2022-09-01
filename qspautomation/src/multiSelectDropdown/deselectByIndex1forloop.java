package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByIndex1forloop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandip/OneDrive/Desktop/HTML.Docs/multiselectdropdown.html");
		Thread.sleep(2000);
		WebElement multiselectdd = driver.findElement(By.id("menu"));
		Select multi = new Select(multiselectdd);
		
		for(int i = 0;i<3;i++)
		{
			multi.selectByIndex(i);
			Thread.sleep(2000);
			
		}

	}

}
