package PageObjectModel;

import java.io.IOException;

public class TestActiTimeLogOut extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readPropertFile(PROP_PATH, "username"), flib.readPropertFile(PROP_PATH, "password"));
		
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		hp.logoutActiTime();
		//hp.Createtask();
	}

}
