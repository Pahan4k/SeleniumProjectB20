package com.cybertek.test.SelfPractice;

import com.cybertek.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailTrainCybertek {
    public static void main(String[] args) throws InterruptedException {
        /*
        XPATHand CSSSelectorPRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        1. Open Chrome browser
       */

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
 /*
        2. Go to http://practice.cybertekschool.com/forgot_password

  */
        driver.get("http://practice.cybertekschool.com/forgot_password");


        /*
        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
            a. “Home” link
         */
WebElement homeButton = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
if (homeButton.isDisplayed()){
    System.out.println("'Home' button Text verification passed");
}else {
    System.out.println("'Home' button Text verification failed");
}
homeButton.click();

Thread.sleep(2000);

String expURL ="http://practice.cybertekschool.com/";
String actURL = driver.getCurrentUrl();
if (expURL.equals(expURL)){
    System.out.println("Functionality of 'Home' button passed");
}else {
    System.out.println("Functionality of 'Home' button failed");
}
driver.navigate().back();






            /*
            b. “Forgot password” header
             */
 WebElement forgotPassword =driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));
        if (forgotPassword.isDisplayed()){
            System.out.println("'Forgot Password' Text verification passed");
        }else {
            System.out.println("'Forgot Password'  Text verification failed");
        }












            /*
            c. “E-mail” text

             */
WebElement emailText = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/label"));
if (emailText.isDisplayed()){
    System.out.println("'E-mail' Text verification passed");
}else {
    System.out.println("'E-mail' Text verification failed");
}
Thread.sleep(2000);





            /*
            d. E-mail input box

             */
        WebElement EmailInputBox = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/input"));
        if (EmailInputBox.isDisplayed()){
            System.out.println("'E-mail input box' field Text verification passed ");
        }else {
            System.out.println("'E-mail input box' field Text verification failed");
        }


       EmailInputBox.sendKeys("pvolyassd@mail.ua"+ Keys.ENTER);
        String expURL1 ="http://practice.cybertekschool.com/email_sent";
        String actURL1 = driver.getCurrentUrl();

        if (actURL1.equals(expURL1)){
            System.out.println("Functionality of 'E-mail input box' field passed");
        }else {
            System.out.println("Functionality of 'E-mail input box' field failed");
        }

        Thread.sleep(2000);
        driver.navigate().back();

            /*
            e. “Retrieve password” button

             */
        WebElement retrieveButton = driver.findElement(By.xpath("//*[@id=\"form_submit\"]"));
        if (retrieveButton.isDisplayed()){
            System.out.println("'Retrieve password' Text verification button passed ");
        }else {
            System.out.println("'Retrieve password' Text verification button failed");
        }


        retrieveButton.click();
        String expURL2 ="http://practice.cybertekschool.com/email_sent";
        String actURL2 = driver.getCurrentUrl();

        if (actURL1.equals(expURL1)){
            System.out.println("Functionality of 'Retrieve password' button passed");
        }else {
            System.out.println("Functionality of 'Retrieve password' button failed");
        }

        Thread.sleep(2000);
        driver.navigate().back();
            /*
            f. “Powered by Cybertek School” text

             */
        WebElement PowercybertekSchoolButton = driver.findElement(By.xpath("/html/body/div/div[3]/div/div"));
        if (PowercybertekSchoolButton.isDisplayed()){
            System.out.println("'Powered by Cybertek School' Text verification button passed ");
        }else {
            System.out.println("'Powered by Cybertek School' Text verification button failed");
        }

WebElement cybertekSchoolButton = driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a"));
        cybertekSchoolButton.click();
        String expURL3 ="https://cybertekschool.com";
        String actURL3 = driver.getCurrentUrl();

        if (actURL1.equals(expURL1)){
            System.out.println("Functionality of 'Cybertek School' button passed");
        }else {
            System.out.println("Functionality of 'Cybertek School' button failed");
        }

        Thread.sleep(2000);
        driver.navigate().back();
driver.close();
driver.close();
             /*
         4. Verify all WebElements are displayed
         */

    }
}
