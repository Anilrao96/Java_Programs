package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launching chrome browser instance
		driver.manage().window().maximize();//Maximize the window
		driver.get("https://www.facebook.com/");//Open URL
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		//1st way not recommended but mostly used in industry
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total deop down values are:-" + birthMonth.size());
		birthMonth.get(9).click();//september
		System.out.println(birthMonth.get(1).isEnabled());//true
		
		
		//2nd way recommended
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		//will use select class constructor
		Select month = new Select(bm);//parameterized constructor
		//select by visibletext
		month.selectByVisibleText("Apr");//Apr
		//select by value
		month.selectByValue("12");//Dec
		//select by index
		month.selectByIndex(10);//Oct
		//Get current value from dropdown
		System.out.println(month.getFirstSelectedOption().getText());
		
		//3rd way - will store all dropdown values in list
		
		List <WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown values are :"+dropdown.size());
		
		for(int i =0;i<dropdown.size();i++) {
			String dropdownValues = dropdown.get(i).getText();
			if(dropdownValues.equalsIgnoreCase("Aug")) {
				dropdown.get(i).click();
				//or
				//month.selectByVisibleText(dropdownValues);
				
			}
		}
		//4th way-checking the dropdown is supporting multiple selection or not
		System.out.println(month.isMultiple());//false
		month.selectByIndex(2);
		month.selectByIndex(3);
		month.selectByVisibleText("Dec");
		month.deselectByIndex(2); //De select the selected value
		month.deselectByIndex(5);
		month.deselectByVisibleText("Dec");
		month.deselectAll();
		
		//5th way
		bm.sendKeys("Feb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
		
		
		

	}

}
