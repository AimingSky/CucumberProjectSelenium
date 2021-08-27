package Step;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import classes.Broswer;
import classes.LoginPortalClasses;
import cucumber.api.java.en.Given;

public class Stepdefinationone {

	static WebDriver driver;
	static Broswer broswer = new Broswer();
	LoginPortalClasses loginPortal = new LoginPortalClasses();;
	
	
	@Given("^open file$")
	public static void fileOpen() throws InterruptedException {
			driver.get("http://aimingsky.in/login.jsp");
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			System.out.println("open file");
	}
	@Given("^load browser$")
	public static void openBrowser() {
		broswer.LaunchDriver("chrome");
			System.out.println("open browser");
		driver = broswer.getDriver();	
	}
	@Given("^close file$")
	public static void closeFile() {
			System.out.println("close file");
	}
	
	@Given("^close broswer$")
	public static void browserclose() {
			broswer.close();
			System.out.println("close broswer");
	}
	
	@Given("^one www\\.google\\.com$")
	public void one_www_google_com() throws Throwable {
	   
	}

	@Given("^Login with credentials$")
	public void loginPortal(Map<String,String> dataTable) throws Throwable {
		
		String password = dataTable.get("password");
		String email = dataTable.get("email");
		
	    loginPortal.loginWith(email,password,driver);
	}
}
