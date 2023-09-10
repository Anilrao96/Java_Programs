package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();//Launching chrome browser instance
				driver.manage().window().maximize();//Maximize the window
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://paytm.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='Log In/Sign Up']")).click();
				Thread.sleep(3000);
				
				
				//Find out total number of frames present on web page
				int totalFrames = driver.findElements(By.tagName("iframe")).size();
				System.out.println(totalFrames);
				
				//go inside each frame and check which frame has our element
				for(int i = 0;i<totalFrames;i++) {
					driver.switchTo().frame(i);
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
				}

	}

}
