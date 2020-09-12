package com.cybertek.test.day3_CSS_Expector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC #3: PracticeCybertek/ForgotPassword URL verification
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/forgot_password
3.Enter any email into input box
4.Click on Retrieve password
5.Verify URL contains: Expected: “email_sent”
6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”*/
public class WarmUp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/forgot_password");


WebElement elem =  driver.findElement(By.name("email"));
        elem.sendKeys("paahan@gmail.com");
WebElement buttonPress = driver.findElement(By.id("form_submit"));
buttonPress.click();
//driver.findElement(By.id("form_submit")).click();

String title = "email_sent";
String expTitle = driver.getCurrentUrl();
if (expTitle.contains(title)){
    System.out.println("Passed");
}else {
    System.out.println("Failed");




}


//6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”
String expText = "Your e-mail's been sent!";
WebElement Text = driver.findElement(By.name("confirmation_message"));
String actText =  Text.getText();
//String actualText = driver.findElement(By.name("confirmation_message")).getText();
        System.out.println(actText);
        System.out.println(expText);
if (actText.equals(expText)){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}

if (Text.isDisplayed()){
    System.out.println("Confirmation message is displayed. Verification PASSED!");
}else{
    System.out.println("Confirmation message is NOT displayed. Verification FAILED!!!");
}




driver.close();
    }
}
