package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_1 {
	


	public static void main(String[] args) throws NumberFormatException, InterruptedException {
		
		int coursePrice,verifyPrice;
		String price,coursePOld = null,coursePNew;
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		String pageText=driver.findElement(By.xpath("//h2[text()='Sign In']")).getText();
		if(pageText.equals("Sign In"))
		{
			System.out.println("Page is verified");
		}
		else
		{
			System.out.println("Page is not valid");
		}
		
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		String loginText=driver.findElement(By.xpath("//h1[text()='Learn Automation Courses']")).getText();
		if(loginText.equals("Learn Automation Courses"))
		{
			System.out.println("Login is successful");
		}
		else
		{
			System.out.println("Issue in login");
		}
		
		
		Thread.sleep(10000);
		
		String courseName=driver.findElement(By.xpath("//h2[text()='Java']")).getText();
		
		System.out.println(courseName);		
		
		Thread.sleep(10000);
		
		if(courseName.equals("JAVA"))
		{
			price=driver.findElement(By.xpath("//div[@class='home-container']//div[1]//div[2]//span[1]//b[1]")).getText();
			//int str_size=price.length();
			coursePOld=price.substring(1, price.length());
		
			//coursePrice=Integer.parseInt(coursePOld);
			System.out.println("Course price -"+coursePOld);
			
			driver.findElement(By.xpath("//h2[text()='Java']//following::button[1]")).click();
			
			
		}
		else
		{
			System.out.println("Course not added in the cart");
		}
		
		Thread.sleep(5000);
		
		// Verify course in cart
		String courseCount=driver.findElement(By.xpath("//span[@class='count'][1]")).getText();
		
		Thread.sleep(50000);
		
		driver.findElement(By.xpath("//button[@class='cartBtn']")).click();
		
		Thread.sleep(50000);
		if(courseName.equals("JAVA"))
		{
			String javaCoursePrice=driver.findElement(By.xpath("//div[@class='container-child']//div[1]//div[1]//h3//b[1]")).getText();
			coursePNew=javaCoursePrice.substring(1, javaCoursePrice.length());
			//verifyPrice=Integer.parseInt(coursePNew);
			System.out.println("Java course fees "+coursePOld);
			
			if(coursePNew.equals(coursePOld))
			{
				System.out.println("Price is correct");
				
			
			}
			else
			{
				System.out.println("Course price is incorrect");
			}
		}
		
		driver.findElement(By.xpath("//button[text()='Enroll Now']")).click();
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Pune");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='fade cart-modal modal show']//div[1]/div[3]/button[@class='action-btn']")).click();
		Thread.sleep(50000);
		
		String unquieid=driver.findElement(By.xpath("//h4[@class='uniqueId']/b")).getText();
		System.out.println("Your order id is "+unquieid);
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@class='action-btn white-action-btn']")).click();
		Thread.sleep(50000);
		
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		
		
	}

}
