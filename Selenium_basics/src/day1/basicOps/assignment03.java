package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment03 {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get( "https://www.google.com/");
    String ActualTitle=driver.getTitle();
    String ExpectedTitle="Google";
    System.out.println(ActualTitle.equals(ExpectedTitle));
    int titleLength= driver.getTitle().length();
    System.out.println(titleLength);
    String ActualUrl=driver.getCurrentUrl();
    String ExpectedUrl="https://www.google.com/";
    System.out.println(ActualUrl.equals(ExpectedUrl));
    int UrlLength= driver.getCurrentUrl().length();
    System.out.println(UrlLength);
    driver.close();
    
    
    
    		

	}

}
