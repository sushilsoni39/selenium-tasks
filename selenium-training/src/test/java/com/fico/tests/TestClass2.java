package com.fico.tests;
import org.testng.annotations.Test;

public class TestClass2 {
    @Test
    public void testCase3()
    {
        System.out.println("test3");
        throw new RuntimeException();
    }
    @Test
    public void testCase4()
    {
        System.out.println("test4");
    }

}
