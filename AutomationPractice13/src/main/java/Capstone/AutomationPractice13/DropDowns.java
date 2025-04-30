package Capstone.AutomationPractice13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice13\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement cnewaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		cnewaccount.click();
		Thread.sleep(6000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("John");
		Thread.sleep(3000);
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Doe");
		Thread.sleep(3000);
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select bm = new Select(birthmonth);
		bm.selectByIndex(6);
		Thread.sleep(3000);
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select bd = new Select(birthday);
		bd.selectByValue("22");
		Thread.sleep(3000);
		WebElement byear = driver.findElement(By.name("birthday_year"));
		Select by = new Select(byear);
		by.selectByVisibleText("2019");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//*[@type='radio'])[2]"));
		gender.click();
		

	}

}
