package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8 {
	WebDriver driver;	
	public void setEnv() {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launching chrome browser instance
		driver.manage().window().maximize();//Maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/"); //Open URL
	}
	@DataProvider
	public String[][] dataSet(){
		String arr[][] = new String[3][2];
		arr[0][0] = "Email_1";
		arr[0][1] = "Password_1";
		arr[1][0] =  "Email_2";
		arr[1][1] = "Password_2";
		arr[2][0] = "Email_3";
		arr[2][1] = "Password_3";
		return arr;
		
	}
	@Test(dataProvider = "dataSet")
	public void enterCredentials(String UserName,String Password) throws Exception{
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id= 'email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id= 'pass']")).clear();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id= 'email']")).sendKeys(UserName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id= 'pass']")).sendKeys(Password);
	}
	
}
