package com.example;
import org.junit.Assert;
import org.junit.Test;

public class AppTest{
    @Test
    public void TestAdd(){
        App app = new App();
        int result = app.Add(2,3);
        System.out.println("Running test: 2 + 3 = " + result);
        Assert.assertEquals(5, result);
    }
}
