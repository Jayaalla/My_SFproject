import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Demo_Selenium.Demo_Selenium.BrowserUtility;

public class MyProfile06 extends BrowserUtility{

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
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Alla");
	    Thread.sleep(2000);
	    
		waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")));
	    driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
	    Thread.sleep(2000);
	    

		waitForPageElementToDispaly(driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")));
	    driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
	    Thread.sleep(2000);
	    
	    //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")));
	   // Thread.sleep(2000);
	  //  driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]").sendKeys("Hi"));
	  //  driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")).sendKeys("Hi");
	   // Thread.sleep(2000);
	
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
	    driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
	    Thread.sleep(2000);
	     
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")));
	    driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")).click();
	    Thread.sleep(2000);
	    
	    
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")));
	    driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
	    Thread.sleep(2000); 

	    waitForPageElementToDispaly(driver.findElement(By.xpath("//input[@id='chatterFile']")));
	    driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys("C:\\Users\\susmi\\Downloads\\Quetion20.png");
	  //  driver.findElement(By.xpath("//input[@id='chatterFile']")).click();
	    Thread.sleep(2000); 
	   
	    waitForPageElementToDispaly(driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]")));
		WebElement ele = driver.findElement(By.xpath("//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]//img[contains(@class,'chatter-photo')]"));
	    

        Thread.sleep(2000);
        Actions act = new Actions(BrowserUtility.driver);
        act.moveToElement(ele).perform();
        Thread.sleep(3000);
	    
        waitForPageElementToDispaly(driver.findElement(By.xpath("//span[@id='displayBadge']")));
	    driver.findElement(By.xpath("//span[@id='displayBadge']")).click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']")));
	    Thread.sleep(2000);
      

	    waitForPageElementToDispaly(driver.findElement(By.id("j_id0:uploadFileForm:save")));
	    driver.findElement(By.id("j_id0:uploadFileForm:save")).click();
	    Thread.sleep(2000);
	     
	    
	    quitBrowser();
	    
	    
	}
}
