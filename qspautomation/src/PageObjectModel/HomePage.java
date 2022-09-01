package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(id="profile-link")private WebElement Administrator;
	@FindBy(xpath="//a[.='Create new tasks']")private WebElement createtask;
	@FindBy(xpath="//a[.='View Time-Track']")private WebElement viewTimeTracl;
	@FindBy(xpath="//a[.='Logout']")private WebElement logOut;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	
	//utilization
	public WebElement getAdministrator() {
		return Administrator;
	}
	public WebElement getCreatetask() {
		return createtask;
	}
	public WebElement getViewTimeTracl() {
		return viewTimeTracl;
	}
	public WebElement getLogOut() {
		return logOut;
	}
	
	//operational method
	public void logoutActiTime()
	{
		
		logOut.click();
	}
	//operational method 2
	public void Createtask() {
		createtask.click();
		
	}
	
	
	
	

}
