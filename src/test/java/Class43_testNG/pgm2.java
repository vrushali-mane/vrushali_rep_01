package Class43_testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class pgm2 {
	
	@Parameters({"p1","p2"})
	@Test
	public void pgm2(String browserName,String appUrl)
	{
		System.out.println("Browser Name"+browserName);
		System.out.println("URL Name"+appUrl);
	}

}
