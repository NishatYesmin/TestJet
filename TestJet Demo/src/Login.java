import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {
	
      private WebDriver driver;
		
		public Login(WebDriver driver)  {
			this.driver = driver;		
		
	}
		public void LoginFunction() throws InterruptedException {
				
			driver.findElement(By.cssSelector("input[type='email']")).click();
			driver.findElement(By.cssSelector("input[type='email']")).sendKeys("dnishat@thetitantech.com");
			driver.findElement(By.cssSelector("input[type='password']")).click();
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ni@123456");
		    driver.findElement(By.cssSelector("button[type='button']")).click();
		    Thread.sleep(5000);

		    
		    
		    
		}
		}