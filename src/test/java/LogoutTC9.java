import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutTC9 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
	    
		waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	    Thread.sleep(2000);
        
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	    Thread.sleep(2000);
	    
	    quitBrowser();

	}

}
