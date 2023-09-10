package javapackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		//print how many windows are opened
		Thread.sleep(5000);
		Set<String> PopUpId = driver.getWindowHandles();
		System.out.println(PopUpId);//alphanumeric ID for all windows
		System.out.println(PopUpId.size());
		
		Iterator <String> it = PopUpId.iterator();
		
		String window1 = it.next();
		String window2 = it.next();
		String window3 = it.next();
		String window4 = it.next();
		//System.out.println(window1);
		
		//print title of popup window
		driver.switchTo().window(window1);
		System.out.println(window1);//Alphanumeric ID of pop window 1
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//driver.close();
		
		//print title of popup window
		driver.switchTo().window(window2);
		System.out.println(window2);//Alphanumeric ID of pop window 1
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//driver.close();
		
		//print title of popup window
		driver.switchTo().window(window2);
		System.out.println(window2);//Alphanumeric ID of pop window 1
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//driver.close();
		
		//print title of popup window
		driver.switchTo().window(window2);
		System.out.println(window2);//Alphanumeric ID of pop window 1
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//driver.close();
		
		
	}

}
