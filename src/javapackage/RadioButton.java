package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome browser and passing chrome driver path
				System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
				
				//Launching chrome browser instance
				WebDriver driver = new ChromeDriver();

				//manage method
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.get("https://www.facebook.com/");//open url
				//Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
				
				//1st way not a good approach to handle with multiple web elements
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@value=1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@value=2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@value=-1]")).click();
				
				//2nd way - by creating list for all radio button
				List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
				//System.out.println("Total Radio Buttons= " + radios.size());
				//String ExpectedResult = "Female";
				
//				System.out.println(radios.get(1).isEnabled());//Male radio button is enabled or not
//				System.out.println(radios.get(0).isDisplayed());//Female radio button is displayed or not
//				System.out.println(radios.get(2).isSelected());//Custom radio button is selected or not
//				
//				Thread.sleep(3000);
//				radios.get(1).click();
//				Thread.sleep(3000);
//				System.out.println(radios.get(2).isSelected());// Custom radio button is selected or not
				List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
				String ExpectedResult = "Female";
				for(int i = 0; i<radios1.size();i++)
				{
					if(radios1.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
						radios1.get(i).click();
						System.out.println(ExpectedResult+"Clicked");
						break;
					}
				}
				
				
	}

}
