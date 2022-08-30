package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String ActualTitle=driver.getTitle();
        String ExpectedTitle="OrangeHRM";
        System.out.println("ActualTitle:"+ActualTitle);
        System.out.println("ExpectedTitle:"+ExpectedTitle);
        int titleLength=driver.getTitle().length();
        System.out.println("titleLength:"+titleLength);
        String ActualUrl= driver.getCurrentUrl();
        String ExpectedUrl="https://opensource-demo.orangehrmlive.com/";
        System.out.println("ActualUrl:"+ActualUrl);
        System.out.println("ExpectedUrl:"+ExpectedUrl);
        System.out.println(ActualUrl.equals(ExpectedUrl));
        int UrlLength=driver.getCurrentUrl().length();
        System.out.println("Url length:"+UrlLength);
        driver.close();
        
	}

}
