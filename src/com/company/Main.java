package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
	 System.setProperty("webdriver.gecko.driver","/Users/srinivaskamble/Downloads/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com");

    }
}
