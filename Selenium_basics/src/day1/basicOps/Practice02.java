package day1.basicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice02 {

	public static void main(String[] args) {
	System.setProperty( "webdriver.chrome.driver","D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://affiliate.flipkart.com/login");
	WebElement username=driver.findElement(By.id("inputEmail"));
	username.clear();
	username.sendKeys("Admin@gmail.com");
	WebElement password=driver.findElement(By.id("inputPassword"));
	password.clear();
	password.sendKeys("admin123");
	WebElement loginButton=driver.findElement(By.id("submitLogin"));
	loginButton.click();
	//driver.close();
	
	

	}

}
