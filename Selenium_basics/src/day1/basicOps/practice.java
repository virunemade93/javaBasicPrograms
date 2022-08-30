package day1.basicOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL ushttps://demo.vtige get() of WebDriver interface
		driver.get("https:www.facebook.com");
		// click on signing button
//		driver.findElement(By.cssSelector(".buttonBlue")).click();
//		driver.findElement(By.cssSelector(".userName.dropdown-toggle.pull-right")).click();
//		driver.findElement(By.cssSelector(".keyword-input")).sendKeys("xxx.com");
//		driver.findElement(By.cssSelector("#adv-search")).click();
		

	}

}
