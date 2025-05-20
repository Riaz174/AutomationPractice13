package Capstone.AutomationPractice13;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository30\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement owindow = driver.findElement(By.id("openwindow"));
		owindow.click();
		
		String currentwhandle = driver.getWindowHandle();
		System.out.println(currentwhandle);
		Set<String> whandles = driver.getWindowHandles();
		System.out.println(whandles);
		Iterator<String> iterators = whandles.iterator();
		String Firstwhandle = iterators.next();
		Thread.sleep(6000);
		String Secondwhandle = iterators.next();
		System.out.println("This is first window handle: " + Firstwhandle);
		System.out.println("This is second window handle: " + Secondwhandle);
		driver.switchTo().window(Secondwhandle);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.linkText("Contact"));
		contact.click();

	}

}
