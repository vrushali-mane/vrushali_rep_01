package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class browserLaunch {

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
	List<WebElement> listSocialLinks=driver.findElements(By.xpath("//div[@class='social']//div/a"));

	for(WebElement ele:listSocialLinks)
	{
		//String links=ele.getText();
		//System.out.println("soial links clicked - "+links);
		ele.click();
	}
	}

}
