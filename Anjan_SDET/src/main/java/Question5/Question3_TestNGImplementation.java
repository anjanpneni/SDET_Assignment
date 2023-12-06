package Question5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Question3_TestNGImplementation {
	 WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swayam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
	    driver=new ChromeDriver();  
	      
	    driver.navigate().to("http://www.makemytrip.com/");  
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    Actions actions = new Actions(driver);
	    actions.moveToElement(driver.findElement(By.tagName("body")), 0, 0);
	    actions.moveByOffset(0, 0).click().build().perform();
	    String parent=driver.getWindowHandle();
	    for (String windowHandle : driver.getWindowHandles()) {
	        // Switch to the desired tab
	        driver.switchTo().window(windowHandle);

	        // Check if it's the tab you want to close
	        if (driver.getCurrentUrl().equals("https://www.makemytrip.com/promos/gihs-051223.html?intid=CRM_Roadblock_GIHS_Dec")) {
	            // Close the tab
	            driver.close();
	            break; // Stop iterating through window handles
	        }
	    }
	    driver.switchTo().window(parent);
	    Thread.sleep(5000);
  }
  @Test
  public void makeMyTripLogVerified() {
	  boolean logo_check=driver.findElement(By.xpath("//img[@alt=\"Make My Trip\"]")).isDisplayed();
	    if(logo_check)
	    {
	    	System.out.println("Make My Trip Logo Verified");
	    }
	    else
	    {
	    	System.out.println("Make My Trip Logo is not Verified");

	    }
	    
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
