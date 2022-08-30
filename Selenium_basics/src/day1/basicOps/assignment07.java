package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment07 {

	public static void main(String[] args) {
	System.setProperty( "webdriver.chrome.driver","D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get( "https://www.amazon.in/");
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	System.out.println("ActualTitle:"+ActualTitle);
	System.out.println("ExpectedTitle:"+ExpectedTitle);
	System.out.println(ActualTitle.equals(ExpectedTitle));
	int titleLength=driver.getTitle().length();
	System.out.println("titleLength:"+titleLength);
	String ActualUrl=driver.getCurrentUrl();
	String ExpectedUrl="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	System.out.println(ActualUrl.equals(ExpectedUrl));
	int urlLength=driver.getCurrentUrl().length();
	System.out.println("urlLength:"+urlLength);
	driver.close();
	
	

	}

}
