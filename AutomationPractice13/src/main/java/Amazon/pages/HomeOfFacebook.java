package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Connect with friends and the world around you on Facebook.')]") WebElement text;
	@FindBy(id = "email") WebElement emailf;
	@FindBy(id = "pass") WebElement pword;
	@FindBy(name = "login") WebElement logf;
	
	public HomeOfFacebook(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
public String VerificationOfText() {
	String tx = text.getText();
	return tx;
}
public void userName(String id) {
	emailf.sendKeys(id);
}
public void password(String id) {
	pword.sendKeys(id);
}
public void login() {
	logf.click();
	
		
	}

}
