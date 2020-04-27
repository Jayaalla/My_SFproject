import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TabsCustomizationTC35 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
		
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
	 driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();
	 Thread.sleep(2000);   
	
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[contains(@name,'customize')]")));
	 driver.findElement(By.xpath("//input[contains(@name,'customize')]")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='duel_select_1']//option[contains(text(),'Content')]")));
	 driver.findElement(By.xpath("//select[@id='duel_select_1']//option[contains(text(),'Content')]")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")));
	 driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@name='save']")));
	 driver.findElement(By.xpath("//input[@name='save']")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	 driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	 Thread.sleep(2000);
	 
	 waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
	 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	 Thread.sleep(2000);
	 
	 
	 launchBrowser("ch");
		loginToBrowser();
	 
	 quitBrowser();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
