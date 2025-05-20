package Capstone.AutomationPractice13;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository30\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement sbox = driver.findElement(By.id("twotabsearchtextbox"));
		sbox.sendKeys("Computer");
		Actions action = new Actions(driver);
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("c").keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		sbox.clear();
		Thread.sleep(6000);
		sbox.click();
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		

	}

}
