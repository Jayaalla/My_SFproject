import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditedLastNameTC34 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
	
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
	    
		waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	    Thread.sleep(2000);
        
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
	    Thread.sleep(2000);

	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[@id='moderatorMutton']")));
	    driver.findElement(By.xpath("//a[@id='moderatorMutton']")).click();
	    Thread.sleep(2000);

		waitForPageElementToDispaly(driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")).click();
	    Thread.sleep(2000);

	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aboutMeContentId']")));
	    Thread.sleep(2000);
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='lastName']")));
	    WebElement LN = driver.findElement(By.xpath("//input[@id='lastName']"));
	    LN.clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Pasala");
	    Thread.sleep(2000);
	    
		waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")));
	    driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
	    Thread.sleep(2000);
	    
        quitBrowser();
        
	
	
	}

}
