package day1.basicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.id("btnCancel")).click();
		driver.findElement(By.id("#menu_maintenance_purgeEmployee")).click();

	}

}
