

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	static WebDriver driver = null;
	
	static void launchBrowser(String sbrowser)
		{
		if(sbrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
	//  System.setProperty("webdriver.chrome.driver","C:\\Users\\susmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.out.println("you have not given the browser type correct");
		}
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/");
	}
	
	static void quitBrowser() {
		driver.quit();
	}
	
	static void loginToBrowser() throws Exception {
		
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
		 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		 Thread.sleep(2000);
		 
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='username']"))));
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jayasree.a@salesforce.com");
		 
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
		 	        
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Login']"))));
		 driver.findElement(By.xpath("//input[@id='Login']")).click();
		 	
		
		
	}
	
   static void waitForPageElementToDispaly(WebElement eleToWait) 
   {
	   WebDriverWait wait = new WebDriverWait(BrowserUtility.driver,30);
	    wait.until(ExpectedConditions.visibilityOf(eleToWait));
   }
	
	
}

