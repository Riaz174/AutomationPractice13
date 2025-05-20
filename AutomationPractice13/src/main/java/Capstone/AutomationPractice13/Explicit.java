package Capstone.AutomationPractice13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository30\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement sbox = driver.findElement(By.id("twotabsearchtextbox"));
		sbox.sendKeys("Computer");
		WebDriverWait sk = new WebDriverWait(driver,10);//This is for a specific element
		sk.until(ExpectedConditions.elementToBeClickable(sbox));
		
		

	}

}
