package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Deceleration
	@FindBy(name="username")private WebElement usn;
	@FindBy(name="pwd")private WebElement pass;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement checkbox;
	@FindBy(xpath="//a[contains(text(),'Actimind')]")private WebElement linkActiTime;
	@FindBy(xpath="//a[contains(text(),'License')]")private WebElement licenseLink;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logoActiTime;
	
	//initialization
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	
	}

	
	//utilization

	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getLinkActiTime() {
		return linkActiTime;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	public WebElement getLogoActiTime() {
		return logoActiTime;
	}
	// Operational method
	public void validLoginActiTime(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
		
	}
	public void invalidLoginActiTime(String invalidusername,String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidusername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(3000);
		usn.clear();
	}	

}
