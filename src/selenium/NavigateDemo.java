package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NavigateDemo {
	WebDriver driver;
	String url = "https://testautomation.co/webelements/";

	@Test
	public void navigateDemo() throws InterruptedException {
		// 1st method:
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		// 2nd Method:
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(1000);

	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
