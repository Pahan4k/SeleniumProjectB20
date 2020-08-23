package com.cybertek.test.day1_Selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        //Thread.sleep(2000);

        //getTittle
String actualTittle = driver.getTitle();
        System.out.println("Our Tittle: "+actualTittle);

        //getCurrentUrl
String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        //Navigate Method

        driver.navigate().refresh();
        driver.get("https://www.youtube.com/");
        //Thread.sleep(3000);

        driver.get("https://www.facebook.com/");
        //Thread.sleep(3000);
        driver.get("https://cybertekschool.com/");
        //Thread.sleep(3000);
      String source =   driver.getPageSource();
        System.out.println("source = " + source);//Return Inspect of our Page





    }
}
