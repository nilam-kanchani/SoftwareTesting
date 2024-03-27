package Tops.Assigment_selenium;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import basic.driverconnection;

@RunWith(Parameterized.class)
public class Prog14_fb_parametrized_junit {
    WebDriver driver ;
	String email,password;
	
  
public p014_fb_parametrized_junit( String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

@Before
public  void browser() {
    String url  = "https://www.facebook.com";
    driver = driverconnection.getDriver(url);
    }
@Test
public void login()throws InterruptedException {
	
   WebElement emailele = driver.findElement(By.id("email"));
   emailele.clear();
   emailele.sendKeys(email);
   WebElement passele = driver.findElement(By.id("pass"));
   passele.clear();
   passele.sendKeys(password);
   Thread.sleep(2000);
}
@Parameters
public static List<Object[]> getdata () {
	Object obj[][] = new Object[3][2];
	obj [0][0] = "nilam.kanchani94@gmail.com";
	obj [0][1] = "nilam.kanchani94";
	 
    obj [1][0] = "9620841097";
    obj [1][1] = "9620841097";
    
    obj [2][0] = "nilamshah";
    obj [2][1] = "nilamkanchani";
    
    		
   return Arrays.asList(obj); 		
			
}
}
