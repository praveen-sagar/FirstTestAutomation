package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println("It's Page Source: "+driver.getPageSource());

		WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search' and @type = 'text']"));
		searchbox.sendKeys("TestAutomation.co");
		WebElement submitSerachBtn = driver.findElement(By.name("btnK"));
		submitSerachBtn.submit();
		driver.quit();
	}

}
