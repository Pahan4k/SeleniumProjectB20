package com.cybertek.test.day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {
        //TC#4:	Google	search1-Open	a	chrome	browser
       WebDriverManager.chromedriver().setup();;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2-Go	to:	https://google.com
        driver.get("https://www.google.com");


        // 3-Write	“apple”	in	search	box
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        // 4-Click	google	search	button5-Verify	title:Expected:
String expectTittle = "apple - Google Search";
String actualTittle = driver.getTitle();
// Title	should	start	with	“apple”
if (actualTittle.contains(expectTittle)){
    System.out.println("Search title verification PASSED!");
}else {
    System.out.println("SEarch title failed");
}

driver.findElement(By.partialLinkText("Apple - Official Site")).click();


driver.findElement(By.partialLinkText("Apple Books")).click();

    }

}
