package Step;

import cucumber.api.java.en.Given;

public class Stepdefinationone {

	@Given("^open file$")
	public static void fileOpen() throws InterruptedException {
		
			System.out.println("open file");
	}
	@Given("^load browser$")
	public static void openBrowser() {
			System.out.println("open browser");
	}
	@Given("^close file$")
	public static void closeFile() {
			System.out.println("close file");
	}
	
	@Given("^one www\\.google\\.com$")
	public void one_www_google_com() throws Throwable {
	   
	}

	@Given("^Two www\\.google\\.com$")
	public void two_www_google_com() throws Throwable {
	    
	}
}
