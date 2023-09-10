package javapackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_23 {
	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		Test_23 test1 = new Test_23();
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		
		//driver.get("https:www.microsoft.com/");
		ArrayList<String> al = new ArrayList<String>();
		al.add("https://ea.gr8people.com/create-account?dest=https%3A%2F%2Fea.gr8people.com%2F%3Fmethod%3DcappPortal.getHiringGenericSteps%26opportunityID%3D156696");
		al.add("https://careers.microsoft.com/professionals/us/en/professions");
		al.add("https://www.amazon.jobs/en/business_categories/student-programs");
		
		for(String l:al) {
			if(test1.method2()==1) {
				System.out.println(l+"is tested");
			}
			//driver.get(l);
			
			System.out.println(l);
			
		}
		
	
			

	}
	public  int method2() {
		
		driver.findElement(By.xpath("//*[@name='firstName']"));
		
		
		
		return 1;
	}
	
		
	}


