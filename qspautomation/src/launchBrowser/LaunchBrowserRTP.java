package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; // took input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser name, Chrome or Firefox");
		String browservalue = sc.nextLine();
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();//to open chrome
			driver.manage().window().maximize();
			driver.get("https:/www.google.com");
			Thread.sleep(5000);
		}
		else if(browservalue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();//to open chrome
			driver.manage().window().maximize();
			driver.get("https:/www.google.com");
			Thread.sleep(5000);
			
		}
		else
		{
			System.out.println("Please enter valid Input");
		}		
	}

}
