import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Demo_Selenium.Demo_Selenium.BrowserUtility;

public class UserMenuTC5 extends BrowserUtility{

public static void main(String[] args) throws Exception {
	launchBrowser("ch");
	loginToBrowser();
			
	WebDriver driver = BrowserUtility.driver;
    waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
    Thread.sleep(2000);
    
    quitBrowser();
	
}

}
