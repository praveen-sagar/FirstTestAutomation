package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ElementById {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void testById() {
		driver.get("https://testautomation.co/webelements/");
		WebElement name = driver.findElement(By.id("legalname"));
		name.sendKeys("John");
		name.clear();
		name.sendKeys("John Doe");
		System.out.println(name.isDisplayed());
		System.out.println(name.isEnabled());
		System.out.println(name.isSelected());
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
