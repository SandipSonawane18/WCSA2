package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChrome {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//to open the browser
		Thread.sleep(5000);//delay
		driver.close();//close the driver

	}

}
