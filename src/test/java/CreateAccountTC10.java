import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountTC10 extends BrowserUtility{

	public static void main(String[] args) throws Exception  {  
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
	    		
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//li[@id='Account_Tab']")));
	    driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.id("tryLexDialogX")));
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[contains(@name,'new')]")));
	    driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='acc2']")));
	    driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Jayasree");
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='acc6']")));
	    driver.findElement(By.xpath("//select[@id='acc6']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//option[contains(text(),'Technology Partner')]")));
	    driver.findElement(By.xpath("//option[contains(text(),'Technology Partner')]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='00N5w00000HaM5B']")));
	    driver.findElement(By.xpath("//select[@id='00N5w00000HaM5B']")).click();
	    Thread.sleep(2000);
	    
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//option[contains(text(),'High')]")));
	    driver.findElement(By.xpath("//option[contains(text(),'High')]")).click();
	    Thread.sleep(2000);
	    
	    
        quitBrowser();
	}

}
