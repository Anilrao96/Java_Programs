package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ObjectRepository {
	WebDriver driver;
	
	@Test
	public void readProperty() throws Exception {
		ObjectRepository or = new ObjectRepository();
		
		//specify the location of the properties file
		File src = new File("C:\\Users\\ramad\\eclipse-workspace\\Selenium_4_jan\\Repository\\Object_Repo.properties");
		
		//Create FileInputStream class object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		//Create Properties Class object to read properties data
		Properties pro = new Properties();
		pro.load(fis);
		
		//setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();//Launching chrome browser instance
				driver.manage().window().maximize();//Maximize the window
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				or.hitURL(driver, pro.getProperty("URL"));
				//driver.get(""); //Open URL
				Thread.sleep(3000);
				
				//getProperty() method accept key and it return value for the same key
				driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys("12345");

	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	//Hit URL
	public void hitURL(WebDriver driver, String urlAdd){
		driver.get(urlAdd);
		
	}

}
