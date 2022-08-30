package day8.keyboardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps1 {

	public static void main(String[] args) {
	System.setProperty( "webdriver.chrome.driver","D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get( "https://www.flipkart.com/");
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

	}

}
