package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitTestNG {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void testExplicitTestNG() {
		driver.get("https://testautomation.co/webelements/");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("explibutton")));
		driver.findElement(By.id("explibutton")).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
