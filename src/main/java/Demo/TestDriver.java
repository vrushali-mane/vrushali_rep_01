package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestDriver {

	public static void main(String[] args) 
	{
		//ChromeDriver driver=new ChromeDriver();
		//WebDriver dv=new ChromeDriver();
		EdgeDriver driver1=new EdgeDriver();
		//FirefoxDriver driver2=new FirefoxDriver();
		//driver2.get("https://www.google.com");
		driver1.get("https://www.google.com");
		
		//driver.get("https://www.google.com");
		
		//dv.get("https://www.google.com");
		//driver.quit();
		//driver.close();
		//dv.close();
		driver1.close();
		//driver2.close();
	}

}
