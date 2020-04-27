import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo_Selenium.Demo_Selenium.BrowserUtility;

public class ForgotPasswordTC4A extends BrowserUtility{

public static void main(String[] args) throws Exception {
    launchBrowser("ch");
	WebDriver driver = BrowserUtility.driver;

	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	Thread.sleep(2000);
		 
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='forgot_password_link']"))));
	 driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
	 Thread.sleep(2000);
		 
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='un']"))));
	 driver.findElement(By.xpath("//input[@id='un']")).sendKeys("jayasree.a@salesforce.com");;
	 Thread.sleep(2000);
	
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='continue']"))));
	 driver.findElement(By.xpath("//input[@id='continue']")).click();
	 Thread.sleep(2000);
		 
	quitBrowser();	
	
	}

}
