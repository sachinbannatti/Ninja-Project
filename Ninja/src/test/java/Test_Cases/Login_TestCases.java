package Test_Cases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.base;
import Pages.Login_Page;

public class Login_TestCases extends base{
	public Login_TestCases() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;
	@BeforeMethod
	public  void setup() {
		
		initializeDriver();
	}
	@Test
	Login_Page lp=new Login_Page(driver);
	
	
	

}
