import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Project {

private WebDriver driver;
	
	public Project(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void ProjectFunction() throws InterruptedException  {

			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]")).click();
		    Thread.sleep(2000);
		    
		    
		    
		    
		    
		  
		}

}
