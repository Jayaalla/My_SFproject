import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OptyPipeLineReportTC17 extends BrowserUtility{

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

	 waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")));
	 driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
	 Thread.sleep(2000);
	 	 
	 quitBrowser();
	}

}
