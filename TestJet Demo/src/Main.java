import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Nishat-Projects\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File ("C:\\Users\\user\\Downloads\\TestJet.crx"));
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://app.testjet.ai/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Login lg = new Login(driver);
		lg.LoginFunction();
		
//		Project pv = new Project(driver);    //To see Project overview
//		pv.ProjectFunction();
//		
//		TestCase tc = new TestCase(driver);  //To Create Test Case
//		tc.TestCaseFunction();
//		
//		TestEditor te = new TestEditor(driver); //TO see Test Editor 
//		te.TestEditorFunction();
//		
//		CreateRun tr = new CreateRun(driver);    //To Create Test Run
//     	tr.CreateRunFunction();
//     	
//     	RunDetails rd = new RunDetails(driver);  //To see Test Run Details
//     	rd.RunDetailsFunction();
//    	
//     	CreateTestReport ct = new CreateTestReport(driver);   //Create Test Case based Report
//     	ct.CreateTestReportFunction();
//     	
//		CreateRunReport cr = new CreateRunReport(driver);    // Create Test Run Report
//     	cr.CreateRunReportFunction();
//		
//		AllReport ar = new AllReport(driver);  //TO see AllReport
//		ar.AllReportFunction();
//		
//       Settings st = new Settings(driver);  //TO see Settings
//       st.SettingsFunction();
//	 	
//		ManageTeam tm = new ManageTeam(driver); //TO Invite Team Member 
//		tm.ManageTeamFunction();
		
		Logout lt = new Logout(driver);  //TO Logout
		lt.LogoutFunction();
	
		
     	
     	
     	
     	
	}

} 
