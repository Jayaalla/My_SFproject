import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewAContactTC29 extends BrowserUtility{

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

		 waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Alla, Jayasree')]")));
		 driver.findElement(By.xpath("//a[contains(text(),'Alla, Jayasree')]")).click();
		 Thread.sleep(2000);

	     quitBrowser();
	
	}

}
