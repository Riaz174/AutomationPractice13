package Capstone.AutomationPractice13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		/*WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		Thread.sleep(3000);
		WebElement all = driver.findElement(By.linkText("All"));
		all.click();
		Thread.sleep(6000);
		WebElement ahaul = driver.findElement(By.linkText("Amazon Haul"));
		ahaul.click();
		Thread.sleep(6000);
		WebElement mcare = driver.findElement(By.partialLinkText("Medical"));
		mcare.click();
		Thread.sleep(6000);*/
		WebElement bsellers = driver.findElement(By.partialLinkText("Best"));
		bsellers.click();
		WebElement nreleases = driver.findElement(By.linkText("New Releases"));
		nreleases.click();
		Thread.sleep(6000);
		WebElement abasics = driver.findElement(By.linkText("Amazon Basics"));
		abasics.click();
		
		
		
		
		
		
		

	}

}
