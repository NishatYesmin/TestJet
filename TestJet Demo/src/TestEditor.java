import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestEditor {

private WebDriver driver;
	
	public TestEditor(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void TestEditorFunction() throws InterruptedException  {
			
		
		    driver.findElement(By.xpath("//span[contains(text(),'Test Cases')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[2]/div[2]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).isDisplayed();
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]/div[1]")).click();
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("https://www.amazon.com/");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[contains(text(),'Save Changes')]")).click();
		    driver.findElement(By.xpath("//span[contains(text(),'SAVE TEST')]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
		    Thread.sleep(3000);


		  
		}

}
