package com.tanya.test;

/**
 * Created by tanya on 10/9/16.
 * Utils class
 */
class Utils {
    static int getSumOfArray(int[] array) {
        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum;
    }
}
