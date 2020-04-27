import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorMessageTC30 extends BrowserUtility{

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
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
	 driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='fname']")));
	 driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("");
	 Thread.sleep(2000);
	 	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='devname']")));
	 driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("xyz");
	 Thread.sleep(2000);

	 waitForPageElementToDispaly(driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")));
	 driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
	 Thread.sleep(2000);
	 
	 quitBrowser();
	
	
	}

}
