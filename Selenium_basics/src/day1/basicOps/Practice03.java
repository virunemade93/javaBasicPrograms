package day1.basicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice03 {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver","D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder ='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder ='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
