package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ElementByXpath {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void testElementByXpath() {
		driver.get("https://testautomation.co/webelements/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
