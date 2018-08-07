package com.man.test;
import java.awt.Choice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void TestDemo() {
		String osType = System.getProperty("os.name");
		if(osType.equalsIgnoreCase("Windows")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		}

		WebDriver driver = new FirefoxDriver();
		String urlAddress = "http://www.baidu.com";
		driver.get(urlAddress);
		driver.close();
	}
}
