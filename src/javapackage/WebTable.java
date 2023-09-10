package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launching chrome browser instance
		driver.manage().window().maximize();//Maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");//Open URL
		
		//create list of all companies
		List <WebElement> allcompanies =  driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total comapnies are:"+allcompanies.size());
		
		//create list of all prices
		List <WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		
		String expectedCompanyName = "MRC Exim";
		
		for(int i = 0;i<allcompanies.size();i++) {
			if(allcompanies.get(i).getText().equalsIgnoreCase("expectedCompanyName"));
			
			System.out.println(allcompanies.get(i).getText()+";;;;;"+currentPrice.get(i).getText());
			allcompanies.get(i).click();
			break;
			
		}
	}

}

