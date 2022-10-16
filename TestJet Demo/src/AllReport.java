import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllReport {

private WebDriver driver;
	
	public AllReport(WebDriver driver) {
	this.driver = driver;
	}
	
	public void AllReportFunction() throws InterruptedException{
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'All Reports')]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/p[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		
		
	}
	
	
	}