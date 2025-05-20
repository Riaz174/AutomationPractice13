package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin {
	public WebDriver driver;
	@FindBy(name = "firstname") WebElement fname;
	@FindBy(name = "lastname") WebElement lname;
	
	public  signin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void userName() {
		fname.sendKeys("Ali");
		
	}
	public void lName() {
		lname.sendKeys("Ahmad");
		
	}

}
