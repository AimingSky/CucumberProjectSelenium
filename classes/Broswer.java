package classes;

import java.io.File;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Broswer{

	static WebDriver driver;
	WebDriver driverFinal = null;
	public void LaunchDriver(String name) {
		if(name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			
			// Add the WebDriver proxy capability.

			Proxy proxy = new Proxy();
			proxy.setHttpProxy("myhttpproxy:3337");
			options.setCapability("proxy", proxy);
//			// Add a ChromeDriver-specific capability.
//			options.addExtensions(new File("/path/to/extension.crx"));
//			ChromeDriver driver = new ChromeDriver(options);
//			
			this.driver = new ChromeDriver(); 
			driver.manage().window().maximize();
		}
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void close() {
		driver.close();
		System.out.println("driver closed");
	}
}
