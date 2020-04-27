import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuaterlyReportTC19 extends BrowserUtility{

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
	 	
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='quarter_q']")));
	 driver.findElement(By.xpath("//select[@id='quarter_q']")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='open']")));
	 driver.findElement(By.xpath("//select[@id='open']")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']")));
	 driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']")).click();
	 Thread.sleep(2000);
	 
	 
    quitBrowser();
	}

}
