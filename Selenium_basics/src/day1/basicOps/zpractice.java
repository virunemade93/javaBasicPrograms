package day1.basicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zpractice {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", 
				"D:\\Acceleration\\MayWorkspace\\Selenium_basics\\Executable\\msedgedriver.exe");
		EdgeDriver cd =new EdgeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/");
		cd.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		cd.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		cd.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		cd.findElement(By.xpath("//a[@id='menu_maintenance_purgeEmployee']")).click();
//		cd.findElement(By.xpath("//input[@id='confirm_passwordd']")).sendKeys("admin123");
//		cd.findElement(By.xpath("//input[@value='Verify']")).click();
		cd.findElement(By.xpath("//a[@id='welcome']")).click();
		cd.findElement(By.xpath("//div/ul/li/a[@id='aboutDisplayLink']")).click();
		
	}

}
