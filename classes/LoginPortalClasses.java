package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPortalClasses {

	public void loginWith(String email, String password, WebDriver driver) throws InterruptedException {
		String email_xpath = "//input[@name='email']";
		String password_xpath = "//input[@name='password']";
		WaitFunction.waitFunctionUntillElementVisible(email_xpath, driver);
		driver.findElement(By.xpath(email_xpath)).sendKeys(email);
		
		System.out.println("email entered");
		WaitFunction.waitFunctionUntillElementVisible(password_xpath, driver);
		driver.findElement(By.xpath(password_xpath)).sendKeys(password);
		
		System.out.println("password entered");
	}

}
