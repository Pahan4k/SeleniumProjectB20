package com.cybertek.test.day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6Header_verification {
    public static void main(String[] args) {
        /*
         #6: Zero Bankheader verification1.Open Chrome browser
         2.Go to http://zero.webappsecurity.com/login.html
         3.Verify header textExpected: “Log in to ZeroBank”
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
String actualRes = driver.findElement(By.tagName("h3")).getText();
String expexted = "Log in into ZeroBank";
if (actualRes.contains(expexted)){
    System.out.println("Headder is ferified");
}else {
    System.out.println("Headder is failed");
}




    }
}
