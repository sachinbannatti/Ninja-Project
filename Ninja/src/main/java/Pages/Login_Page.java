package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page  {

	WebDriver driver;
	Properties prop;
	public Login_Page (WebDriver driver) throws FileNotFoundException {
		prop=new Properties();
		File profile=new File("C:\\Users\\BusinessComputers.in\\Desktop\\Java\\Ninja\\src\\main\\java\\Config\\Config.Properties");
		FileInputStream fis=new FileInputStream(profile);
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement myAccount;
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement login;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailId;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginButton;
	
	public void myAccount() {
		myAccount.click();
	}
	
	public void login() {
		login.click();
	}
	
	public void emailId() {
		emailId.sendKeys(prop.getProperty("mailId"));
	}
	
	public  void password() {
		password.sendKeys(prop.getProperty("password"));
	}
	
	public void loginButton() {
		loginButton.click();
	}
	
}







