package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Index";
		System.out.println("ActualTitle:"+ActualTitle);
		System.out.println("ExpectedTitle:"+ExpectedTitle);
		System.out.println(ActualTitle.equals(ExpectedTitle));
		int titleLength=driver.getTitle().length();
		System.out.println("titleLength:"+titleLength);
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://demo.automationtesting.in/Register.html";
		System.out.println("ActualUrl:"+ActualUrl);
		System.out.println("ExpectedUrl:"+ExpectedUrl);
		System.out.println(ActualUrl.equals(ExpectedUrl));
		int urlLength=driver.getCurrentUrl().length();
		System.out.println("urlLength:"+urlLength);
