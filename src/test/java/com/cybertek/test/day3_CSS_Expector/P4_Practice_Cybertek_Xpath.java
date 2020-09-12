package com.cybertek.test.day3_CSS_Expector;

import com.cybertek.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_Practice_Cybertek_Xpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

//1
        /*
WebElement de =driver.findElement(By.cssSelector("[name='button2']"));
de.click();

         */
//2
        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));
        button2.click();
    }
}
