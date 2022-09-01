package keywordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestValidActiTime extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		//read the property from files
		 String username = flib.readPropertFile("./data/config.properties","username");
		 String password = flib.readPropertFile("./data/config.properties","password");
		 
		 //valid login
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 Thread.sleep(3000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(3000);
		 
		 bt.CloseBrowser();//close browser
	
	}
}
