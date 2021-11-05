package testcases_Urban;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Urban_Ladder.urban;

public class test_cases {

	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91877\\Desktop\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	@Test(priority=0)
	public void log() throws IOException, InterruptedException {

		driver.get("https://www.urbanladder.com/");
		
		urban ur=new urban(driver);
		ur.kids_room();
		
		ur.kids_chair().click();
		ur.screenshot();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void log2() throws IOException, InterruptedException {
		urban ur=new urban(driver);
		ur.product();
		
		for(String winHandle : driver.getWindowHandles()){
		   driver.switchTo().window(winHandle);
		}
		ur.cart();
		ur.screenshot();
		Thread.sleep(2000);
	}

	@Test(priority=2)
	public void log3()  {
		urban ur=new urban(driver);
		ur.pincode();
		ur.code();
		ur.check();	
	}
	
	@Test(priority=3)
	public void log4() throws IOException, InterruptedException {
		urban ur=new urban(driver);
		
		ur.s_mail();
		ur.s_pin();
		ur.s_address();
		ur.s_fname();
		ur.s_lname();
		ur.s_phnum();
		
		ur.done();
		ur.screenshot();
		Thread.sleep(2000);
	
	}
	
	
}
