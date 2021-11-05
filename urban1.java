package Urban_Ladder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class urban1 {

	RemoteWebDriver driver1;

	
	
	public urban1(RemoteWebDriver driver1)
    {
        //this.driver=driver;
        this.driver1=driver1;
        PageFactory.initElements(driver1, this);  
       
    }
	
	//option-kids room
	@FindBy(xpath="//span[@class='topnav_itemname'][normalize-space()='Kids Room']")
	WebElement kids_room;
	
	//option kids chair
	@FindBy(xpath="//li[@class='topnav_item kidsroomunit']//li[3]//ul[1]/li[1]")
	WebElement kids_chair;
	
	//option product
	@FindBy(xpath="//a[@title='Chable Chair - Caribe (Matte Finish, Caribe)']")
	WebElement product;
	
	//add to cart
	@FindBy(xpath="//button[@id='add-to-cart-button']")
	WebElement cart;
	
	//change zip
	@FindBy(xpath="//a[@class='link-color']")
	WebElement pincode;
	
	@FindBy(xpath="//input[@placeholder='YOUR PINCODE']")
	WebElement code;
	
	//checkout
	@FindBy(xpath="//div[@class='large-4 columns btn_wrap']//button[@id='checkout-link']")
	WebElement check;
	
	//shipping
	@FindBy(xpath="//input[@id='order_email']")
	WebElement s_mail;
	
	@FindBy(xpath="//input[@id='order_ship_address_attributes_zipcode']")
	WebElement s_pin;
	
	@FindBy(xpath="//textarea[@id='order_ship_address_attributes_address1']")
	WebElement s_address;
	
	@FindBy(xpath="//input[@id='order_ship_address_attributes_firstname']")
	WebElement s_fname;
	
	@FindBy(xpath="//input[@id='order_ship_address_attributes_lastname']")
	WebElement s_lname;
	
	@FindBy(xpath="//input[@id='order_ship_address_attributes_phone']")
	WebElement s_phnum;
	
	@FindBy(xpath="//input[@id='address-form-submit']")
	WebElement done;

	public void kids_room() {
		Actions actions = new Actions(driver1);
		actions.moveToElement(kids_room).perform();
	}
	
	public WebElement kids_chair() {
		return kids_chair;
	}
	public void product() {
		product.click();
	}
	public void cart() {
		cart.click();
	}
	public void pincode() {
		pincode.click();
	}
	public void code() {
		code.clear();
		code.sendKeys("400037");
	}
	public void check() {
		check.click();
	}
	
	public void s_mail() throws IOException {
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\91877\\Desktop\\M2 assessment\\urbanladder.properties");
		pro.load(fis);
		s_mail.sendKeys(pro.getProperty("Email"));;
	}
	public void s_pin() throws IOException {
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\91877\\Desktop\\M2 assessment\\urbanladder.properties");
		pro.load(fis);
		s_pin.sendKeys(pro.getProperty("PinCode"));;
	}
	public void s_address() throws IOException {
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\91877\\Desktop\\M2 assessment\\urbanladder.properties");
		pro.load(fis);
		s_address.sendKeys(pro.getProperty("Address"));;
	}
	public void s_fname() throws IOException {
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\91877\\Desktop\\M2 assessment\\urbanladder.properties");
		pro.load(fis);
		s_fname.sendKeys(pro.getProperty("FirstName"));;
	}
	public void s_lname() throws IOException{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\91877\\Desktop\\M2 assessment\\urbanladder.properties");
		pro.load(fis);
		s_lname.sendKeys(pro.getProperty("LastName"));;
	}
	public void s_phnum() throws IOException{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\91877\\Desktop\\M2 assessment\\urbanladder.properties");
		pro.load(fis);
		s_phnum.sendKeys(pro.getProperty("Mobile"));;
	}
	public void done() {
		done.click();
	}
	public void screenshot() throws IOException 
    {
        File src=null;
        src = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
        Files.copy(src, new File("C:\\Users\\91877\\Desktop\\JAVA-T\\Batch2\\Screenshots\\"+"scr-"+System.currentTimeMillis()+".png"));
    }
}
