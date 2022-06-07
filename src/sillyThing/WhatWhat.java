package sillyThing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WhatWhat {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		ChromeDriver driver = new ChromeDriver();		
		
		String url = "http:linkedin.com";
		
		driver.get(url);

		
		driver.findElement(By.id("session_key")).sendKeys("Sishirbhattarai400@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Associates2022");
		driver.findElement(By.className("sign-in-form__submit-button")).click();
		driver.findElement(By.id("ember19")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> elements = driver.findElements(By.className(url));

	}
	}

	