package testcases_Urban;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Urban_Ladder.urban1;

public class gridtest 
{
	RemoteWebDriver driver1;
	@BeforeTest
	@Parameters("browser")
    public void setup(String browser) throws IOException, InterruptedException
	{
		String nodeURL="http://192.168.0.102:4444/wd/hub";
        DesiredCapabilities dc=null;
        if(browser.equalsIgnoreCase("chrome"))
        {
        dc=DesiredCapabilities.chrome();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WINDOWS);
        }
        
        else
        {
            dc=DesiredCapabilities.firefox();
            dc.setBrowserName("firefox");
            dc.setPlatform(Platform.WINDOWS);
        }
       
        driver1=new RemoteWebDriver(new URL(nodeURL), dc);
	}
	
	@Test(priority=0)
	public void log() throws IOException, InterruptedException {

		driver1.get("https://www.urbanladder.com/");
		
		urban1 ur=new urban1(driver1);
		ur.kids_room();
		
		ur.kids_chair().click();
		ur.screenshot();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void log2() throws IOException, InterruptedException {
		urban1 ur=new urban1(driver1);
		ur.product();
		
		for(String winHandle : driver1.getWindowHandles()){
		   driver1.switchTo().window(winHandle);
		}
		ur.cart();
		ur.screenshot();
		Thread.sleep(2000);
	}

	@Test(priority=2)
	public void log3()  {
		urban1 ur=new urban1(driver1);
		ur.pincode();
		ur.code();
		ur.check();	
	}
	
	@Test(priority=3)
	public void log4() throws IOException, InterruptedException {
		urban1 ur=new urban1(driver1);
		
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