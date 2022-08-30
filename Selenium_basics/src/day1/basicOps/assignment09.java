package day1.basicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment09 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys( "admin");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys( "Test@123");
		WebElement signInButton=driver.findElement(By.className("buttonBlue"));
		signInButton.click();
		driver.close();

	}

}
