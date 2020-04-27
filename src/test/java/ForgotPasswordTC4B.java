import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordTC4B extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		 launchBrowser("ch");
			WebDriver driver = BrowserUtility.driver;

	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	Thread.sleep(2000);
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='username']"))));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaya.a@salesforce.com");
	 
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@12");
	 	        
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Login']"))));
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	 
	}

}
