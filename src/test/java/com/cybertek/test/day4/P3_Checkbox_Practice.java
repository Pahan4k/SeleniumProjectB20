package com.cybertek.test.day4;


import com.cybertek.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Checkbox_Practice {

    public static void main(String[] args) {
        //Practice: Cybertek Checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //1st checkbox
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        //2nd checkbox
        WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        if (!checkBox1.isSelected()){
            System.out.println("checkbox #1 is NOT selected by default");
        }else {
            System.out.println("Failed");
        }
        //2. Confirm checkbox #1 is NOT selected by default
        //3. Confirm checkbox #2 is SELECTED by default.
        if (checkBox2.isSelected()){
            System.out.println("checkbox #2 is SELECTED by default");
        }else {
            System.out.println("Failed");
        }
        //4. Click checkbox #1 to select it.
        checkBox1.click();
        if (checkBox1.isSelected()){
            System.out.println("checkbox #1 is SELECTED by user");
        }else {
            System.out.println("Failed");
        }
        //5. Click checkbox #2 to deselect it.
        checkBox2.click();
        if (!checkBox2.isSelected()){
            System.out.println("checkbox #2 is deselected by user");
        }
        //6. Confirm checkbox #1 is SELECTED.

        //7. Confirm checkbox #2 is NOT selected.




        driver.quit();
    }
}
