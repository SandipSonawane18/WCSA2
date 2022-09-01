package JavaScriptExecutorMethods;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Sandip/OneDrive/Desktop/HTML.Docs/disabledelement.html");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"i1\").value='admin'");
		
	}
}
