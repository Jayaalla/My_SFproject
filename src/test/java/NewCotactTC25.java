import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCotactTC25 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
		
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]")));
	 driver.findElement(By.xpath("//li[@id='Contact_Tab']//a[contains(text(),'Contacts')]")).click();
	 Thread.sleep(2000);   
	
	 waitForPageElementToDispaly(driver.findElement(By.id("tryLexDialogX")));
	 driver.findElement(By.id("tryLexDialogX")).click();
	 Thread.sleep(2000);
	
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@name='new']")));
	 driver.findElement(By.xpath("//input[@name='new']")).click();
	 Thread.sleep(2000); 

	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='name_firstcon2']")));
	 driver.findElement(By.xpath("//input[@id='name_firstcon2']")).sendKeys("Jayasree");
	 Thread.sleep(2000); 
	 	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
	 driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Alla");
	 Thread.sleep(2000); 
	
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='con4']")));
	 driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("JayasreeAlla");
	 Thread.sleep(2000); 
	
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")));
	 driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
	 Thread.sleep(2000); 
	
	 quitBrowser();
	 
	
	
	
	}

}
