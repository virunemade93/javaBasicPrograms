package day8.keyboardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get( "http://demo.automationtesting.in/Register.html");
		WebElement firstName=driver.findElement(By.cssSelector( "input[placeholder='First Name']"));
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		

	}

}
