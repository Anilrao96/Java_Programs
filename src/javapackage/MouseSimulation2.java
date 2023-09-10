package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launching chrome browser instance
		driver.manage().window().maximize();//Maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//switching frame
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames available on web page =" + allframes.size());
		driver.switchTo().frame(0);
		
		//will find draggable and droppable web element
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		WebElement droppableElement = driver.findElement(By.id("droppable"));
		
		//using actions class, drag and drop web elements
		Actions act = new Actions(driver);
		act.dragAndDrop(draggableElement, droppableElement).build().perform();
		
	}

}
