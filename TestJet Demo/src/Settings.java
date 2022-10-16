import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {

	private WebDriver driver;
	
	public Settings(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void SettingsFunction() throws InterruptedException  {
		
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[contains(text(),'Team')]")).click();
			Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'Bug Tracker')]")).click();
			Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'Integration')]")).click();
			Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
			



		
	}

	

}