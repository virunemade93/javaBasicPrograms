package day1.basicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualTitle=driver.getTitle();
		System.out.println("actualTitle:"+actualTitle);
		String ExpectedTitle="OrangeHRM";
		System.out.println("ExpectedTitle:"+ExpectedTitle);
		System.out.println(actualTitle.equals(ExpectedTitle));
		String actualUrl=driver.getCurrentUrl();
		System.out.println("actualUrl"+actualUrl);
		String ExpectedUrl="https://opensource-demo.orangehrmlive.com/";
		System.out.println("ExpectedUrl:"+ExpectedUrl);
		System.out.println(actualUrl.equals(ExpectedUrl));
		WebElement userInputField=driver.findElement(By.name( "username"));
		userInputField.clear();
		userInputField.sendKeys( "Admin");
		
		WebElement passwordInputField=driver.findElement(By.name( "password"));
		 passwordInputField.clear();
		passwordInputField.sendKeys( "admin123");

	}

}
