package com.cybertek.test.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("incorrect@gmail.com");
driver.findElement(By.id("pass")).sendKeys("incorect2321"+ Keys.ENTER);
        System.out.println(driver.getTitle());

if (driver.getTitle().equals("Log into Facebook | Facebook")){
    System.out.println("Correct");
}else{
    System.out.println("Inccorect");
}



    }
}
