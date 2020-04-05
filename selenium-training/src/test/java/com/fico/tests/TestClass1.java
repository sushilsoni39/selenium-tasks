package com.fico.tests;
import org.testng.annotations.*;
import org.testng.annotations.Test;
public class TestClass1
{

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }



    @Test( dataProvider = "numbers")
    public void TestCase1(int a,int b)
    {
        System.out.println(randomMethod(a,b));
    }

    @DataProvider(name="numbers")
    public static Object[][] numbersData()
    {
        return new Object[][] {{1,1},{2,2},{3,3}};
    }

    public int randomMethod(int a,int b)
    {
        return a+b;
    }
    @Test
    public void TestCase2()
    {
        System.out.println("test2");
    }

}