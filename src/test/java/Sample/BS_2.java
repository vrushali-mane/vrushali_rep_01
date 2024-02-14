package Sample;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class BS_2 {

	public static void main(String[] args) {
		int cnt=0;
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Manage']"))).perform();
		
		driver.findElement(By.xpath("//div[@class='nav-menu-item-hover-div']//a[text()='Manage Categories']")).click();
		
		
		String parentWindow=driver.getWindowHandle();
		Set<String> allwindowSet=driver.getWindowHandles();
		List<String> allwindowList=new ArrayList<String>(allwindowSet);
		String manageCategoryWin=allwindowList.get(1);
		driver.switchTo().window(manageCategoryWin);
		
		
		int count=driver.findElements(By.xpath("//table[@class='category-table table table-borderless']//tbody/tr/td[1]")).size();
		System.out.println("No. of category present - "+count);
		
		String category="Python",newcategory="Python_1";
		
		driver.findElement(By.xpath("//div[@class='container-child']//div[1]/div/div/button[1]")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys(category);
		alt.accept();
		
		driver.switchTo().window(manageCategoryWin);
		
		int cnt1 = driver.findElements(By.xpath("//table[@class='category-table table table-borderless']//tr/td[1]")).size();
		System.out.println("New category count-"+cnt1);
				
		 List<WebElement> listnew=driver.findElements(By.xpath("//table[@class='category-table table table-borderless']//tbody//tr/td[1]"));
		 
		 for(WebElement ele2:listnew)
		 {
			String newlist=ele2.getText(); 
		 System.out.println(newlist);

		 }
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//List<WebElement> newlist=driver.findElements(By.xpath("//table[@class='category-table table table-borderless']//tbody//tr//td[1]"));
		
		//Boolean b= wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//table[@class='category-table table table-borderless']//tbody//tr//td[1]"), category));
				//textMatches(driver.findElements(By.xpath("//table[@class='category-table table table-borderless']//tbody//tr//td[1]")), category));	
		//System.out.println(b);
		
		/*List<WebElement> newcategoryList=driver.findElements(By.xpath("//table[@class='category-table table table-borderless']//tbody//tr//td[1]"));
		for(WebElement ele:newcategoryList)
		{
			String categoryName=ele.getText();
			System.out.println(categoryName);
			if(categoryName.equals(category))
			{
				System.out.println("Category is added successfully");
			}
			
		}*/
	
		
		//List<WebElement> edit=driver.findElements(By.xpath("//table[@class='category-table table table-borderless']//tbody//tr//td[3]/button[@class='action-btn']"));
		//System.out.println(edit.get(5).getText());
		/*edit.get(count).click();
		Alert updatealt=driver.switchTo().alert();
		updatealt.sendKeys(newcategory);
		updatealt.accept();*/
		
		/*count=0;
		List<WebElement> updatedcategoryList=driver.findElements(By.xpath("//table[@class='category-table table table-borderless']//tbody/tr"));
		for(WebElement ele:updatedcategoryList)
		{
			String categoryName=ele.getText();
			if(categoryName.equals(newcategory))
			{
				System.out.println("Category is updated successfully");
				count++;
				break;
			}
			
		}*/
		
		
		
	}

}
