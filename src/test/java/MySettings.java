import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MySettings extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
	    
		waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	    Thread.sleep(2000);
        
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
	    Thread.sleep(2000);
        
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']")));
	    driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']")).click();
	    Thread.sleep(2000);
	
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[@id='LoginHistory_font']")));
	    driver.findElement(By.xpath("//a[@id='LoginHistory_font']")).click();
	    Thread.sleep(2000);
	
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
	    Thread.sleep(2000);
	
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']")));
	    driver.findElement(By.xpath("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']")).click();
	    Thread.sleep(2000);
	
        waitForPageElementToDispaly(driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")));
	    driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
	    Thread.sleep(2000);
	    

        waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='p4']")));
	    driver.findElement(By.xpath("//select[@id='p4']")).click();
	    Thread.sleep(2000);
	

        waitForPageElementToDispaly(driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]")));
	    driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]")).click();
	    Thread.sleep(2000);

        waitForPageElementToDispaly(driver.findElement(By.xpath("//td[@id='bodyCell']//td//td[1]//div[1]")));
	    driver.findElement(By.xpath("//td[@id='bodyCell']//td//td[1]//div[1]")).click();
	    Thread.sleep(2000);

        waitForPageElementToDispaly(driver.findElement(By.xpath("//option[contains(text(),'Reports')]")));
	    driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
	    Thread.sleep(2000);
	     
        waitForPageElementToDispaly(driver.findElement(By.xpath("//img[contains(@class,'rightArrowIcon')]")));
	    driver.findElement(By.xpath("//img[contains(@class,'rightArrowIcon')]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//div[@id='EmailSetup']//a[contains(@class,'header setupFolder')]")));
	    driver.findElement(By.xpath("//div[@id='EmailSetup']//a[contains(@class,'header setupFolder')]")).click();
	    Thread.sleep(2000);
	   
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[@id='EmailSettings_font']")));
	    driver.findElement(By.xpath("//a[@id='EmailSettings_font']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='sender_name']")));
	    WebElement ele = driver.findElement(By.xpath("//input[@id='sender_name']"));
	    ele.clear();
	    driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("Jayasree Alla");
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='sender_email']")));
	    WebElement ele1 = driver.findElement(By.xpath("//input[@id='sender_email']"));
	    ele1.clear();
	    driver.findElement(By.xpath("//input[@id='sender_email']")).sendKeys("Jayaalla@gmail.com");
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='auto_bcc1']")));
	    driver.findElement(By.xpath("//input[@id='auto_bcc1']")).click();
	    Thread.sleep(2000);
	    
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@name='save']")));
	    driver.findElement(By.xpath("//input[@name='save']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//div[@id='CalendarAndReminders']//a[@class='header setupFolder']")));
	    driver.findElement(By.xpath("//div[@id='CalendarAndReminders']//a[@class='header setupFolder']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[@id='Reminders_font']")));
	    driver.findElement(By.xpath("//a[@id='Reminders_font']")).click();
	    Thread.sleep(2000);
	    

	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='testbtn']")));
	    driver.findElement(By.xpath("//input[@id='testbtn']")).click();
	    Thread.sleep(2000);
	    
	    quitBrowser();
	
	
	}

}
