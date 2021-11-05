package setpdef;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


@RunWith(Cucumber.class)
public class Urban_Stepdef {
		WebDriver driver=null;
		public Urban_Stepdef() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91877\\Desktop\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			driver.get("https://www.urbanladder.com/?src=g_header");
		}
		
			@Given("^I hover on the Kid's Room$")
		    public void i_hover_on_the_kids_room() throws Throwable {
		 		WebElement kids_room=driver.findElement(By.xpath("//span[@class='topnav_itemname'][normalize-space()='Kids Room']"));
				Actions actions = new Actions(driver);
				actions.moveToElement(kids_room).perform();
				
		    }

		    @Then("^I select Kid's Chair$")
		    public void i_select_kids_chair() throws Throwable {
		        driver.findElement(By.xpath("//li[@class='topnav_item kidsroomunit']//li[3]//ul[1]/li[1]")).click();
		    }

		    @Then("^I click Chable chair Electric blue$")
		    public void i_click_chable_chairelectric_blue() throws Throwable {
		        driver.findElement(By.xpath("//a[@title='Chable Chair - Caribe (Matte Finish, Caribe)']")).click();
		    }

		    @Then("^I click Add to Cart$")
		    public void i_click_add_to_cart() throws Throwable {
		    	for(String winHandle : driver.getWindowHandles()){
		 		   driver.switchTo().window(winHandle);
		 		}
		       driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
		       
		    }

		    @Then("^I change zip code and click checkout$")
		    public void i_change_zip_code_and_click_checkout() throws Throwable {
		        driver.findElement(By.xpath("//a[@class='link-color']")).click();
		        driver.findElement(By.xpath("//input[@placeholder='YOUR PINCODE']")).clear();
		        driver.findElement(By.xpath("//input[@placeholder='YOUR PINCODE']")).sendKeys("400037");
		        driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']//button[@id='checkout-link']")).click();
		    }

		    @And("^the values are : \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
		    public void the_values_are_somethingsomethingsomethingsomethingsomething_and_something(String email, String pincode, String address, String firstname, String lastname, String mobile) throws Throwable {
		        driver.findElement(By.xpath("//input[@id='order_email']")).sendKeys(email);
		        driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_zipcode']")).sendKeys(pincode);
		        driver.findElement(By.xpath("//textarea[@id='order_ship_address_attributes_address1']")).sendKeys(address);
		        driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_firstname']")).sendKeys(firstname);
		        driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_lastname']")).sendKeys(lastname);
		        driver.findElement(By.xpath("//input[@id='order_ship_address_attributes_phone']")).sendKeys(mobile);
		        driver.findElement(By.xpath("//input[@id='address-form-submit']")).click();
		    }

}
