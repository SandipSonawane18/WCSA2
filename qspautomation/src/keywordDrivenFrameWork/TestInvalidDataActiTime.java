package keywordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestInvalidDataActiTime extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestDataAct.xlsx", "invalidcreds");
		
		for(int i=1;i<=rc;i++) {
		 String username = flib.readexceldata("./data/TestDataAct.xlsx", "invalidcreds", i,0);
		 String password = flib.readexceldata("./data/TestDataAct.xlsx","invalidcreds",i,1);
		 
		 System.out.println(i);
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 Thread.sleep(3000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.name("username")).clear();
		}
		//close all the browser
		bt.CloseBrowser();
	}

}
