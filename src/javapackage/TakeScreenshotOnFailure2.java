package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {
	TakeScreenshotOnFailure2 t1 = new TakeScreenshotOnFailure2();
	private ChromeDriver driver;
	
	
	@Test(priority = 1)
	public void doLogin() throws Exception {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		t1.driver.findElement(By.xpath("//*[@id = 'email']")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.xpath("//*[@id = 'pass']")).sendKeys("12345");
		
		//passing wrong id is so that our test case will fail
		t1.driver.findElement(By.xpath("//*[@id='login_Button_Test']")).click();
	}
	@Test(priority = 2)
	public void assertionCheck() {
		System.out.println("Assertion Check");
	}
	@AfterMethod
	public void takeScreenshotOnFailure(ITestResult result) {
		t1.captureScreenshot(result);
	}
	private void captureScreenshot(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
