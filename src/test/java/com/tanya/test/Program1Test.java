package com.tanya.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by tanya on 10/9/16.
 * This is my fist test
 */
public class Program1Test {

    @Test
    public void myFirstTest() {

        String expectedMessage = "My name is Tetiana Malva";

        String actualMessage = Program1.buildMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test
    public void mySecondTest(){

    }
}
