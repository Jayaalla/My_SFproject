import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewOptyTC16 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
		
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
	 driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.id("tryLexDialogX")));
	 driver.findElement(By.id("tryLexDialogX")).click();
	 Thread.sleep(1000);

	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@name='new']")));
	 driver.findElement(By.xpath("//input[@name='new']")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='opp3']")));
	 driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("Jaya");
	 Thread.sleep(2000);
	   
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//a[@id='opp4_lkwgt']//img[contains(@class,'lookupIcon')]")));
	 driver.findElement(By.xpath("//a[@id='opp4_lkwgt']//img[contains(@class,'lookupIcon')]")).click();
	 Thread.sleep(2000);
	 
	 driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[contains(@class,'dataCell')]")).click();

	 
	 
	 
	
	
	}

}
