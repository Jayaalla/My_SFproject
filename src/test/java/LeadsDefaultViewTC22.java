import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsDefaultViewTC22 extends BrowserUtility{

	
		public static void main(String[] args) throws Exception {
			launchBrowser("ch");
			loginToBrowser();
			WebDriver driver = BrowserUtility.driver;
			
		 waitForPageElementToDispaly(driver.findElement(By.xpath("//li[@id='Lead_Tab']")));
		 driver.findElement(By.xpath("//li[@id='Lead_Tab']")).click();
		 Thread.sleep(2000);
		 
	     waitForPageElementToDispaly(driver.findElement(By.id("tryLexDialogX")));
		 driver.findElement(By.id("tryLexDialogX")).click();
		 Thread.sleep(2000);
		
		 waitForPageElementToDispaly(driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]")));
		 driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]")).click();
		 Thread.sleep(2000);
		 

		 waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")));
		 driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		 Thread.sleep(2000);
		
		 
		 waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		    Thread.sleep(2000);
	        
		    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		    Thread.sleep(2000);
		   quitBrowser();

	}

}
