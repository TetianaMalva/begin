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
    public void bubbleSortTest() {
        int[] myArray = {8, 3, 10, 444, 3, 1, -1, 4};

        //1
        int[] sortedArray = Program1.sortArray(myArray);
        //2

        Assert.assertEquals(sortedArray.length, myArray.length);

        for (int i = 0; i < sortedArray.length - 2; i++) {
            Assert.assertTrue(sortedArray[i] <= sortedArray[i + 1],
                    String.format("Element [%s] '%s' should be less or equal than element [%s] '%s'",
                            sortedArray[i], i, sortedArray[i + 1], i + 1));
        }

        int sumOfMyArray = getSumOfArray(myArray);
        int sumOfSortedArray = getSumOfArray(sortedArray);
        Assert.assertEquals(sumOfMyArray, sumOfSortedArray,
                String.format("Sum of elements in array should be same. My %s. Sorted %s",
                        sumOfMyArray, sumOfSortedArray));
    }

    private int getSumOfArray(int[] array) {
        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum;
    }
}
