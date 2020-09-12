package com.cybertek.test.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Zero Bank title verification1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html3.Verify titleExpected:
 “Zero -Log in”TC
 #2: Zero Bank link text verification
    1.Open Chrome browser
    2.Go to http://zero.webappsecurity.com/login.html
    3.Verify link
 text from top left:Expected: “Zero Bank”
    4.Verify link href attribute
 value contains:Expected: “index.html”
 •Create new class for each task.
 •There are some tips in the 2nd page for whoever needs it.
 •Please try to solve yourself first before moving to the tips
 */
public class ZeroBlank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
