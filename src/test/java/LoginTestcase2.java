import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestcase2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
	//  System.setProperty("webdriver.chrome.driver","C:\\Users\\susmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/");
		
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
		}




	


