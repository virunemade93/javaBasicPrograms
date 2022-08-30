package day1.basicOps;

import org.openqa.selenium.firefox.FirefoxDriver;

public class zpractice02 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\geckodriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.google.com");
		fdriver.close();
	}
}