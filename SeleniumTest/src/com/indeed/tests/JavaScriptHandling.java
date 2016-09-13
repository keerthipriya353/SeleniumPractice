package com.indeed.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\JAVAlibs\\Selenium files\\geckodriver.exe");

		// System.setProperty("webdriver.chrome.driver", "C:\\JAVAlibs\\Selenium
		// files\\chromedriver.exe");

		// create Chrome driver to drive the browser
		// WebDriver dr = new ChromeDriver();

		// create firefox driver to drive the browser
		WebDriver dr = new FirefoxDriver();
		
		dr.manage().window().maximize();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		dr.findElement(By.name("proceed")).click();
		//switching to alert box
		Alert alert = dr.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println("Alert text :" + alert.getText());
		
		//clicking ok in alertbox
		alert.accept();
		
		//switching back to main page
		dr.switchTo().defaultContent();
		
		System.out.println(dr.findElement(By.name("proceed")).getAttribute("title"));
	}

}
