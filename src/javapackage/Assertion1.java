package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion1 {
	WebDriver driver;

	public void testCase1() throws Exception {
		String expectedValidation = "Sorry, we don't recognize this email.";
		
		//setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();//Launching chrome browser instance
				driver.manage().window().maximize();//Maximize the window
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://login.yahoo.com/");
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("document.getElementById('login-signin').click()");
				
				Thread.sleep(3000);
				String actualValidation = driver.findElement(By.id("username.error")).getText();
				
				Assert.assertEquals(actualValidation,expectedValidation);
				System.out.println("Equal 	Assertion Successfuully Validated");
				
				Thread.sleep(3000);
				Assert.assertFalse(driver.findElement(By.id("username.error")).isDisplayed());
				System.out.println("False Assertion Successfully validated");
	}
		

	}

