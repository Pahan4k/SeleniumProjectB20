package com.cybertek.test.day4;

import com.cybertek.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_Cybertek_Password {
    public static void main(String[] args) {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement eachLink : listOfLinks){
            System.out.println(eachLink.getText());
        }

int numberOfLinks = listOfLinks.size();
        System.out.println(numberOfLinks);

driver.quit();

    }
}
