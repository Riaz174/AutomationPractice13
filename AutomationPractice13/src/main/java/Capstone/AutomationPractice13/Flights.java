package Capstone.AutomationPractice13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		Thread.sleep(6000);
		WebElement dates = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		dates.click();
		Thread.sleep(6000);
		WebElement dpartdate = driver.findElement(By.xpath("(//div[@class='uitk-date-number uitk-date-number-default uitk-type-300 uitk-type-regular'])[27]"));
		dpartdate.click();
		

	}

}
