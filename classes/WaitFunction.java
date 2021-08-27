package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaitFunction {

	public static void waitFunctionUntillElementVisible(String element,WebDriver driver) throws InterruptedException{
		
		System.out.println("Wait untill element visible");
		int count = 0 ;
		while(count <10) {
			try {
				if(driver.findElement(By.xpath(element)).isDisplayed()){
				Thread.sleep(20);
				break;
				}
				count++;
				Thread.sleep(1000);
			}catch(NullPointerException e) {
				e.printStackTrace();
				throw new RuntimeException("Driver is null "+ e.getMessage());
			}catch(Exception e) {
				Thread.sleep(30);
				count++;
			}
		}
	}
}
