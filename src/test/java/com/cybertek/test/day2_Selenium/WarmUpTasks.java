package com.cybertek.test.day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTasks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();



if (actualTitle.contains(expectedInTitle)){
    System.out.println("Tittle is correct");
}else {
    System.out.println("Tittle is not passed");
}

        driver.navigate().back();



String exptittle = "Google";
String actTittle = driver.getTitle();
if (actTittle.contains(exptittle)){
    System.out.println("Tittle is correct");
}else {
    System.out.println("Tittle is failed");
}












    }
}
