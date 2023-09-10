package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
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
				//using actions class, drag and drop web elements
				
				Thread.sleep(3000);
				Actions act = new Actions(driver);
				act.dragAndDropBy(draggableElement,30,20).build().perform();
				
				//drag the web element and click and hold using coordinates 	
				Thread.sleep(3000);
				act.clickAndHold(draggableElement).dragAndDropBy(draggableElement,30,30).build().perform();

				
	}

}
