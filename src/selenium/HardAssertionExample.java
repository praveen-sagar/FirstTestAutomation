package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertionExample {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void testHardAssertionExample() {
		driver.get("https://www.google.com");
		String actual = driver.getTitle();
		String expected = "Google";
		String searchTerm = null;
//		searchTerm = "TestAutomation.co";  

		Assert.assertEquals(actual, expected);
		System.out.println(driver.getCurrentUrl());
		WebElement searchbox = driver.findElement(By.name("q"));
		Assert.assertNotNull(searchTerm);
		searchbox.sendKeys(searchTerm);
		WebElement submitSerachBtn = driver.findElement(By.name("btnK"));
		submitSerachBtn.submit();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
