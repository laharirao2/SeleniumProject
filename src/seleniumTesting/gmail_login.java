package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_login {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
