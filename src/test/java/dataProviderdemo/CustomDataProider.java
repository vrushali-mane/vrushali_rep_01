package dataProviderdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomDataProider {
  @DataProvider(name="loginCreds")
  
  public static Object[][] customLoginCheck() {
	
	  Object [][] arr=new Object[2][2];
	  
	  arr[0][0] = "test@gmail.com";
	  arr[0][1] = "test@123";
	  
	  arr[1][0] = "admin@email.com";
	  arr[1][1] = "admin@123";
	  
	  return arr;
	  
  }
}
