package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingStrategies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\JAVAlibs\\Selenium files\\geckodriver.exe");

		// System.setProperty("webdriver.chrome.driver", "C:\\JAVAlibs\\Selenium
		// files\\chromedriver.exe");

		// create Chrome driver to drive the browser
		// WebDriver dr = new ChromeDriver();

		// create firefox driver to drive the browser
		WebDriver dr = new FirefoxDriver();

		// open indeed home page
		dr.get("http://www.indeed.com");
		Thread.sleep(2000);

		// locating by id
		dr.findElement(By.id("fj")).click();

		// locating by name
		// dr.findElement(By.name("q")).sendKeys("Java");

		// locating by linktext
		// dr.findElement(By.linkText("Upload your resume")).click();

		// loctaing by partiallinktext
		// dr.findElement(By.partialLinkText("Employers")).click();

		// locating by xpath
		// System.out.println(dr.findElement(By.xpath("//label[@id='what_label_top']")).getAttribute("for"));

		// locating by cssSelector
		// System.out.println(dr.findElement(By.cssSelector("img.indeedLogo")).getAttribute("alt"));

		// locating by tagName
		// System.out.println(dr.findElements(By.tagName("input")).size());

		// locating by className
		// System.out.println(dr.findElements(By.className("input_text")).size());

	}
}