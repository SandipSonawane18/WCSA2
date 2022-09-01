package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https:/www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
		

	}

}
