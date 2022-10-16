import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CreateRun {

private WebDriver driver;
	
	public CreateRun(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void CreateRunFunction() throws InterruptedException  {
		
			
		    driver.findElement(By.xpath("//span[contains(text(),'Test Runs')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Run 001");
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Run 001");
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]")).click();
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[4]/div[2]/ul[1]/li[1]/span[1]")).click();
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[4]/div[2]/ul[1]/li[2]/span[1]")).click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[4]/div[1]/button[1]/span[1]")).click();
		    driver.findElement(By.xpath("//span[contains(text(),'CREATE TEST RUN')]")).click();
		    Thread.sleep(2000);
		    
		}

}
