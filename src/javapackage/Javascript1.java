package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();//Launching chrome browser instance
				driver.manage().window().maximize();//Maximize the window
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.get("https://www.facebook.com/");//Open URL
				
				//Introducing Javascript Executor and casting the interface
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
				jse.executeScript("document.getElementById('pass').value='abc@gmail.com'");
				
				//click on web elementy using javascript executor
				//jse.executeScript("document.getElementById('login').click()");
				
				//scroll down using javascript
				jse.executeScript("window.scrollBy(0,400)");
				
				//scroll up using javascript
				Thread.sleep(3000);

				jse.executeScript("window.scrollBy(0,-400)");
	}

}
