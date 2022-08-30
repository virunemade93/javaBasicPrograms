package day1.basicOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment10 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty( "webdriver.chrome.driver", "D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String pageTitle=driver.getTitle();
	System.out.println("Page title is:"+pageTitle);
	System.out.println("Page title length:"+pageTitle.length());
	String expectedTitle="actiTIME-Login";
	System.out.println("Title validation status:"+pageTitle.equals(expectedTitle));
	driver.findElement(By.id("username")).sendKeys( "admin");
	driver.findElement(By.name( "pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	String homePageTitle=driver.getTitle();
	System.out.print("Home page title:"+homePageTitle);
	System.out.println("Home page validation status:"+homePageTitle.equals( "actiTIME-EnterTime-Track"));
	driver.findElement(By.id("logoutLink")).click();
	System.out.println("Title validation status:"+pageTitle.equals(expectedTitle));
	driver.close();

	}

}
