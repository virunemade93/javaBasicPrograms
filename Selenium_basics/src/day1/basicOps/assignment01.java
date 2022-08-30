package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment01 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
		//String path=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",".\\Executable\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="actiTIME - Login";
		System.out.println("ActualTitle :"+ActualTitle);
		System.out.println("ExpectedTitle :"+ExpectedTitle);
		System.out.println(ActualTitle.equals(ExpectedTitle));
		int titleLength=driver.getTitle().length();
		System.out.println("title length :"+titleLength);
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://demo.actitime.com/login.do";
		System.out.println("Actualurl :"+ActualUrl);
		System.out.println("Expectedurl :"+ExpectedUrl);
		System.out.println(ActualUrl.equals(ExpectedUrl));
		int urlLength=driver.getCurrentUrl().length();
		System.out.println("url length :"+urlLength);
		driver.close();
		
		
		

	}

}
