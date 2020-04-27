import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RS_TC33 extends BrowserUtility{

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

	 waitForPageElementToDispaly(driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'Jayasree Alla')]")));
	 driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'Jayasree Alla')]")).click();
	 Thread.sleep(2000);   
	
	 
	 quitBrowser();
	
	}

}
