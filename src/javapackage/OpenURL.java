package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//setting the property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
		
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();

		//manage method
		driver.manage().window().maximize();	
		
		//Launching url of application using get() method
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://ww.google.com/");
		
		//Refresh the page
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//Navigate to back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Navigate to forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		
		//Navigate to back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Getting current URL
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//getting title of web page
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//Close the current browser instance
		Thread.sleep(3000);
		//driver.close();
		
		//close all browser instance
		Thread.sleep(3000);
		//driver.quit();
		
		
	}

}
