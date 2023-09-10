package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launching chrome browser instance
		driver.manage().window().maximize();//Maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");//Open URL
		//enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		
		//use explicit wait to check if password field is visible and enter password
		WebDriverWait wt = new WebDriverWait(driver,10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//imput[@id='wrongpass']"))).sendKeys("12345");
	}

}
