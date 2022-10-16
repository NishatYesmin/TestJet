import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CreateTestReport {

private WebDriver driver;
	
	public CreateTestReport(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void CreateTestReportFunction() throws InterruptedException  {
		
		    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[contains(text(),'Create New')]")).click();
		    Thread.sleep(5000);
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Test Case Report 001");
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys("Test Case Report");
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]")).click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/ul[1]/li[2]")).click();
            
            JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)");
			
			driver.findElement(By.xpath("//span[contains(text(),'+ ADD TEST CASE')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]")).click();
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[3]")).click();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/button[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[3]/button[1]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'DOWNLOAD REPORT')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();

		  
		}

}
