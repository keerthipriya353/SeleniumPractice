package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedJobSearch {

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
		// find what feild and enter selenium
		dr.findElement(By.id("what")).sendKeys("Selenium");
		// find location feild and enter ohio
		Thread.sleep(2000);
		dr.findElement(By.id("where")).clear();
		Thread.sleep(2000);
		dr.findElement(By.id("where")).sendKeys("Ohio");
		// find findjobs button and click on it
		dr.findElement(By.id("fj")).click();
		// from jobsearch results page, get page title and jobs count message

		System.out.println(dr.getTitle());
		System.out.println(dr.findElement(By.id("searchCount")).getText());
		System.out.println("End of tutorial");
	}

}
