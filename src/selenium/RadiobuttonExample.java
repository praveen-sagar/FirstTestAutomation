package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RadiobuttonExample {
	WebDriver driver;
	List<WebElement> browserradioButtons;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/home/praveen/eclipse/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void testRadioButton() {
		driver.get("https://testautomation.co/webelements/");
		browserradioButtons = driver.findElements(By.name("browser"));
//		browserradioButtons.get(1).click();

		for (WebElement radio : browserradioButtons) {
			System.out.println(radio.getAttribute("value"));
			if (radio.getAttribute("value").equals("ie")) {
				radio.click();
				if (radio.isSelected()) {
					System.out.println("New selected radio button is: " + radio.getAttribute("value"));
				}

			}
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
