package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		//setting the property of chrome browser and passing chromedriver path
				System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();//Launching chrome browser instance
				driver.manage().window().maximize();//Maximize the window
				
				//Introducing the implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.google.com/");//Open url
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How stuff works");
				
				//How to handle auto suggestion
				WebElement AllSuggestion = driver.findElement(By.xpath("//*[@role='listbox']"));
				List <WebElement> AllSearch = AllSuggestion.findElements(By.tagName("li"));
				System.out.println("Total auto suggestion displayed: "+ AllSearch.size());
				
				for(int i =0;i<AllSearch.size();i++) {
					String AllSuggestionList = AllSearch.get(i).getText();
					String FinalResult = "How stuff works";
					if(AllSuggestionList.equalsIgnoreCase(FinalResult)) {
						AllSearch.get(i).click();
						System.out.println("you have selected: " + FinalResult);
						break;
					}
				}
	}

}
