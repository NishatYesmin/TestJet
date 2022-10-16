import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	private WebDriver driver;
	
	public Logout(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void LogoutFunction()  {
		
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]/div[1]/img[1]")).click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/button[1]")).click();


		
	}

	

}