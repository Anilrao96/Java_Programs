package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws Exception {
		//set property of chrome browser and setting the chrome driver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		//driver.switchTo().alert().accept();
		
		//verify alert text
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		String expectedResult = "Please enter a valid user name";
		Thread.sleep(3000);
		Assert.assertEquals(driver.switchTo().alert().getText(),expectedResult);
		System.out.println("Alert content got verified");
		
		
		//To accept the alert
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//To dismiss the alert
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		driver.switchTo().alert().dismiss();
		
		
		
		
		

	}

}
