package Capstone.AutomationPractice13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		Thread.sleep(6000);
		String whandle = driver.getWindowHandle();
		System.out.println(whandle);
		driver.close();

	}

}
