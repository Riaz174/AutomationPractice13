package Capstone.AutomationPractice13;

import org.testng.annotations.Test;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook homef = new HomeOfFacebook(driver);
	  homef.userName(n);
	  homef.password(s);
	  homef.login();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ali", "abcdef" },
      new Object[] { "Saleem", "ghijkl" },
      new Object[] {"Rabia", "mnopqrs" },
    };
  }
}
