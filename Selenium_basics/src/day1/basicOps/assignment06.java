package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment06 {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://sampleapp.tricentis.com/101/");
	 String ActualTitle = driver.getTitle();
	 String ExpectedTitle="Enter Vehicle Data";
	 System.out.println("ActualTitle:"+ActualTitle);
	 System.out.println("ExpectedTitle:"+ExpectedTitle);
	 System.out.println(ActualTitle.equals(ExpectedTitle));
	 int titleLength= driver.getTitle().length();
	 System.out.println("titleLength:"+titleLength);
	 String ActualUrl= driver.getCurrentUrl();
	 String ExpectedUrl="http://sampleapp.tricentis.com/101/";
	 System.out.println("ActualUrl:"+ActualUrl);
	 System.out.println("ExpectedUrl:"+ExpectedUrl);
	 System.out.println(ActualUrl.equals(ExpectedUrl));
	 int urlLength= driver.getCurrentUrl().length();
	 System.out.println("urlLength:"+urlLength);
	 driver.close();

	}

}
