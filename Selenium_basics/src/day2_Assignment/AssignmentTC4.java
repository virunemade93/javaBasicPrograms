package day2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement username=driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		username.sendKeys("12345567");
		System.out.println(username.getAttribute("placeholder"));
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		
        	
        }
	}

