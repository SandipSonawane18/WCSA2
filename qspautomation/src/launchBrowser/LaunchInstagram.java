package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchInstagram {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//to open the browser
		
		driver.manage().window().maximize(); // to maximise the window
		
		driver.get("https://www.Instagram.com"); //launch the URL
		
		Thread.sleep(5000);//delay
		
		driver.close();//close the driver

	}

}
