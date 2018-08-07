package com.man.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void TestDemo() {
		WebDriver driver = new FirefoxDriver();
		String urlAddress = "http://www.baidu.com";
		driver.get(urlAddress);
		driver.close();
	}
}
