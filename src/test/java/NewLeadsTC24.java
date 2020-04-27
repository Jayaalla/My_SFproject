import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadsTC24 extends BrowserUtility{

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
	
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@name='new']")));
	 driver.findElement(By.xpath("//input[@name='new']")).click();
	 Thread.sleep(2000);
	 
	  waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
	 driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
	 Thread.sleep(2000);
	
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='lea3']")));
	 driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
	 Thread.sleep(2000);
	
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")));
	 driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
	 Thread.sleep(2000);
	
	quitBrowser();
	}
}

