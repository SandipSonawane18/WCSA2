package PageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		Flib flip = new Flib();
		
		lp.validLoginActiTime(flip.readPropertFile(PROP_PATH, "username"), flip.readPropertFile(PROP_PATH, "password"));

	}

}
