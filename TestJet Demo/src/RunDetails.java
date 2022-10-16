import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RunDetails {

private WebDriver driver;
	
	public RunDetails(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void RunDetailsFunction() throws InterruptedException  {
		
		    driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		    Thread.sleep(100000);
		    
		    
		    
		    
		  
		}

}
