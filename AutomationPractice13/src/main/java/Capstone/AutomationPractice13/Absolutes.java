package Capstone.AutomationPractice13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
		email.sendKeys("john@gmail.com");
		Thread.sleep(6000);
		WebElement pword = driver.findElement(By.xpath("//input[@type='password']"));
		pword.sendKeys("abcdef");
		Thread.sleep(6000);
		WebElement log = driver.findElement(By.xpath("//button[@data-testid='royal-login-button']"));
		log.click();
		Thread.sleep(6000);
		WebElement fpword = driver.findElement(By.linkText("Forgot password?"));
		fpword.click();
		
		

	}

}
