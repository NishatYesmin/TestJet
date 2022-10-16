import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageTeam {

	private WebDriver driver;
	
	public ManageTeam(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void ManageTeamFunction() throws InterruptedException  {
		
		    driver.findElement(By.xpath("//a[contains(text(),'Team')]")).click();
		    Thread.sleep(2000);
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("nishat999@yopmail.com");    
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/span[1]")).click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/ul[1]/li[1]")).click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'SEND INVITE')]")).click();

		
	}

	

}
