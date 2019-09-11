package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class HandleNewTabDemo {
	WebDriver driver;
	String baseUrl;

	@Test
	public void handleNewTab() {

		baseUrl = "https://webkul.com";
		driver.navigate().to(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"wk-super-menu\"]/div/div[2]/ul/li/a")).click();
//		driver.findElement(By.className("Fx4vi")).sendKeys(Keys.CONTROL + "t");

//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//		driver.findElement(By.tagName("body")).sendKeys(selectLinkOpeninNewTab);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // switches to new tab
		driver.get("https://www.facebook.com");

		driver.switchTo().window(tabs.get(0)); // switch back to main screen
		driver.get("https://www.news.google.com");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

}
