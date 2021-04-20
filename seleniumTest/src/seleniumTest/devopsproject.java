package seleniumTest;



import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class devopsproject {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/revathysivadas/Documents/Selenium-Rev/lib/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8080");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.linkText("About Us")).click();
	System.out.println("title of page is: " + driver.getTitle());
	
	String test = driver.findElement(By.tagName("b")).getText();
	assertEquals(test, "about");
	System.out.println(test);
	System.out.println("Test Succeeded!!");
	driver.quit();
	
	} 
	}

