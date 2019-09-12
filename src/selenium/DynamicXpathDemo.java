package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DynamicXpathDemo {
	WebDriver driver;

	@Test
	public void testDynamicXpathDemo() throws InterruptedException {
		driver.navigate().to("https://yahoo.com");
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("Selenium");

		Thread.sleep(5000);

		List<WebElement> listbyxpath = driver.findElements(By.xpath("//*[@class='yui3-aclist-item']"));
		List<WebElement> listbyclass = driver.findElements(By.className("yui3-aclist-item"));
		List<WebElement> listbyxpathstartswith = driver
				.findElements(By.xpath("//*[starts-with(@class, 'yui3-aclist-item')]"));
		List<WebElement> listbyxpathcontains = driver
				.findElements(By.xpath("//*[contains(@class, 'ui3-aclist-item')]"));

		System.out.println(listbyxpath.size());
		System.out.println(listbyclass.size());
		System.out.println(listbyxpathstartswith.size());
		System.out.println(listbyxpathcontains.size());

		listbyxpathstartswith.get(1).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
