import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditViewTC12 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
	    		
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//li[@id='Account_Tab']")));
	    driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.id("tryLexDialogX")));
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='fcf']")));
	    driver.findElement(By.xpath("//select[@id='fcf']")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")));
	    driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
	    Thread.sleep(2000);
	    
        waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='fname']")));
	    driver.findElement(By.xpath("//input[@id='fname']")).clear();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("abcdeabc");
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='fcol1']")));
	    driver.findElement(By.xpath("//select[@id='fcol1']")).click();
	    Thread.sleep(2000);
	    
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Name')]")));
	    driver.findElement(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Name')]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='fop1']")));
	    driver.findElement(By.xpath("//select[@id='fop1']")).click();
	    Thread.sleep(2000);
	
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//select[@id='fop1']//option[contains(text(),'contains')]")));
	    driver.findElement(By.xpath("//select[@id='fop1']//option[contains(text(),'contains')]")).click();
	    Thread.sleep(2000);
	
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='fval1']")));
	    driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("<a>");
	    Thread.sleep(2000);
	

	    waitForPageElementToDispaly(driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")));
	    driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")).click();
	    Thread.sleep(2000);
	    
	    quitBrowser();
	    
	    
	    
	    
	}

}
