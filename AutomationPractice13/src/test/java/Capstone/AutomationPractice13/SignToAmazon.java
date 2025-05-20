package Capstone.AutomationPractice13;

import org.testng.annotations.Test;

import Amazon.pages.Home;
import Amazon.pages.signin;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignToAmazon extends Utilities {

  @Test
  public void f() {
	  Home home = new Home(driver);
	  home.emailh();
	  signin sign = new signin(driver);
	  sign.userName();
	  sign.lName();
  }
    
  }


