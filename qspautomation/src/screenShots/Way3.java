package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {
	//using downcasting of WebDriver Interface to  RemoteWebdriver driver class

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot3.jpg");
		Files.copy(src,dest);
		
		

	}

}
