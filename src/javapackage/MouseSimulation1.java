package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launching chrome browser instance
		driver.manage().window().maximize();//Maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		//creating web element reference
		WebElement Electronics = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		//WebElement Home = driver.findElement(By.xpath("//img[@alt='Home']"));
		
		//Mouse simulation using actions class
		Actions act = new Actions(driver);
		
		//Mouse hover to electronics web element
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();
		
		//Right click on electronics web element
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform();
		//release mouse control
		Thread.sleep(3000);
		act.release(Electronics).build().perform();
		
		//Perform key events
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Entered");
		
		//press enter to home web elements
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement Home = driver.findElement(By.xpath("//img[@alt='Home']"));
		act.sendKeys(Home, Keys.ENTER).build().perform();
		System.out.println("Home menu clicked");

	}

}
