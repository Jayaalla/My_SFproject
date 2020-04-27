import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeveloperrsConsoleTC8 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
	    
		waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	    Thread.sleep(2000);
        
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")));
	    driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
	    Thread.sleep(2000);

	    waitForPageElementToDispaly(driver.findElement(By.xpath("//div[@id='gridcolumn-1099-titleEl']")));
	    driver.findElement(By.xpath("//div[@id='gridcolumn-1099-titleEl']")).click();
	    Thread.sleep(2000);
	    
	    
	    quitBrowser();   
	    
	    
	}

}
