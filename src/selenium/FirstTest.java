package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
