package com.cybertek.test.day5_TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Intro {
@BeforeClass
    public void setupClass(){
        System.out.println("Before class is running");
    }

    @BeforeMethod
    public void tearDownClass(){
        System.out.println("Before Method is running");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");

    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running...");
    }

@Test
    public void test1(){
        System.out.println("Test1 is running");
    }

@Test
    public void test2(){
        System.out.println("Test 2 is running");
    }

    @Test
    public void test3(){
    String str1 = "TestNG";
    String str2 = "TestNG";
    String str3 = "sfdsasd";

         Assert.assertTrue(str1.equals(str2));

         Assert.assertTrue(str1.equals(str3), "Str 1 is not equal Str3");




    }

}
