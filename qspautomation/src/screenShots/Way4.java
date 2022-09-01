package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way4 {
	//using downcasting of WebDriver Interface to  EventFiringWebdriver driver class

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		EventFiringWebDriver efd = new EventFiringWebDriver(driver);
		File src = efd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot4.jpg");
		Files.copy(src,dest);
		
		
	}

	private static EventFiringWebDriver EventFiringWebDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
