package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	
	
	public static WebDriver startBrowser(String browserName,String url)
	{
		 WebDriver driver=null;
		if(browserName.equals("Chrome")||browserName.equals("GE"))
		{
			driver=new ChromeDriver();
				
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}
