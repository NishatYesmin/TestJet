import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestCase {

	private WebDriver driver;
	
	public TestCase(WebDriver driver) {
	this.driver = driver;
	
	
	}
		
		public void TestCaseFunction() throws InterruptedException  {
		
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[1]/div[2]/div/div/a[2]")).click();
		    Thread.sleep(2000);
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'NEW TEST')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='p-inputtext p-component']")).sendKeys("Test Case 001");
            driver.findElement(By.xpath("//input[@class='p-inputtext p-component custom-input-field']")).click();
            driver.findElement(By.xpath("//label[contains(text(),'1280 x 720')]")).click();
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/input[1]")).sendKeys("tag1");
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/input[1]")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")).click();
            Thread.sleep(2000);
            


		
	}

	

}
