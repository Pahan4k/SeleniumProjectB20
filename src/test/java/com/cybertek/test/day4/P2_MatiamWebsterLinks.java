package com.cybertek.test.day4;

import com.cybertek.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_MatiamWebsterLinks {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        // 3. Print out the texts of all links
        List<WebElement> listOfLinks =driver.findElements(By.xpath("//body//a"));
int count = 0;
int count2 = 0;
for (WebElement each : listOfLinks){
    System.out.println(each.getText());
    String Text = each.getText();
    if (Text.isEmpty()){
        count++;
    }else {
        count2++;
    }
}
        System.out.println(count);
        //4. Print out how many link is missing text


        //5. Print out how many link has text
        System.out.println(count2);
        //6. Print out how many total link
        System.out.println(listOfLinks.size());

driver.quit();
    }
}