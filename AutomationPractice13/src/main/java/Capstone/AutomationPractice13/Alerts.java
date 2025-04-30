package Capstone.AutomationPractice13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver.php");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement alert = driver.findElement(By.name("alert"));
		alert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement confirm = driver.findElement(By.name("confirmation"));
		confirm.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement promp = driver.findElement(By.name("prompt"));
		promp.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().sendKeys("Alert is displayed");
	// Store the alert in a variable
		Alert alerts = driver.switchTo().alert();
		alerts.sendKeys("Alert is displayed");
		String alertMessage = alerts.getText();
		System.out.println(alertMessage);

		// Accept the alert to close it
		alerts.accept();
		
		Thread.sleep(6000);
	}

}
