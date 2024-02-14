package dataProviderdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Utility;

public class Test_1 {
  @Test(dataProvider = "loginCreds" , dataProviderClass = CustomDataProider.class)
  public void loginApp(String user,String pwd) {
	  
	  WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
	  driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(user);
	  driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	  
	  Assert.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Manage']")).isDisplayed());
	  
	  
	  driver.quit();
  }
}
