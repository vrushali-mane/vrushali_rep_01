package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigenment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		Thread.sleep(10000);
		
		driver.findElement(By.id("name")).sendKeys("VrushaliMane");
		driver.findElement(By.id("email")).sendKeys("vrushali.mane89@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shivansh");
	}

}
