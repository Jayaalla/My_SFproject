import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountReportTC14 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
	    		
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//li[@id='Account_Tab']")));
	    driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.id("tryLexDialogX")));
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//img[@id='ext-gen152']")));
	    driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//span[contains(text(),'26')]")));
	    driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//img[@id='ext-gen154']")));
	    driver.findElement(By.xpath("//img[@id='ext-gen154']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//td[@class='x-date-active x-date-selected']//a[@class='x-date-date']")));
	    driver.findElement(By.xpath("//td[@class='x-date-active x-date-selected']//a[@class='x-date-date']")).click();
	    Thread.sleep(2000);
	     
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//button[@id='ext-gen63']")));
	    driver.findElement(By.xpath("//button[@id='ext-gen63']")).click();
	    Thread.sleep(2000);
	   
	  
	  
	    
	    
	    
	    
	}

}
