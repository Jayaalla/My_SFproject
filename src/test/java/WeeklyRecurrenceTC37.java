import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeeklyRecurrenceTC37 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
		
	   waitForPageElementToDispaly(driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")));
	   driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();
       Thread.sleep(2000); 
       
  	 waitForPageElementToDispaly(driver.findElement(By.id("tryLexDialogX")));
  	 driver.findElement(By.id("tryLexDialogX")).click();
  	 Thread.sleep(2000);
  	 
   	waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]")));
	driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]")).click();
    Thread.sleep(2000); 
	
    
   	waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")));
	driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")).click();
    Thread.sleep(2000); 
	
    waitForPageElementToDispaly(driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")));
	driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")).click();
    Thread.sleep(2000); 
	
    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Other')]")));
	driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
    Thread.sleep(2000); 

    
   	waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
	driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
    Thread.sleep(2000); 
    
    
    waitForPageElementToDispaly(driver.findElement(By.xpath("//div[@id='timePickerItem_38']")));
	driver.findElement(By.xpath("//div[@id='timePickerItem_38']")).click();
    Thread.sleep(2000); 
	

    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='IsRecurrence']")));
	driver.findElement(By.xpath("//input[@id='IsRecurrence']")).click();
    Thread.sleep(2000); 
	 
    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='rectypeftw']")));
	driver.findElement(By.xpath("//input[@id='rectypeftw']")).click();
    Thread.sleep(2000);  
	 
    
    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")));
	driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).click();
    Thread.sleep(2000);  
	 
    waitForPageElementToDispaly(driver.findElement(By.xpath("/td[@class='weekday selectedDate']")));
	driver.findElement(By.xpath("/td[@class='weekday selectedDate']")).click();
    Thread.sleep(2000);  
    
    waitForPageElementToDispaly(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")));
	driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
    Thread.sleep(2000);  
    
    waitForPageElementToDispaly(driver.findElement(By.xpath("//img[contains(@class,'monthViewIcon')]")));
	driver.findElement(By.xpath("//img[contains(@class,'monthViewIcon')]")).click();
    Thread.sleep(2000);  
    
	
	
	
	
	
	
	
	
	
	
	}

}
