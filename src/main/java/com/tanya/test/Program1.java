package com.tanya.test;

import java.util.Arrays;

/**
 * This is my first Java program <br><br/>
 * Created by tanya on 10/9/16.
 */
public class Program1 {
    public static void main(String[] args) {
        String message = buildMessage();
        System.out.println(message);
    }

    static String buildMessage(){
        return "My name is " + getFirstName() + " " + getLastName();
    }

    private static String getFirstName() {
        return "Tetiana";
    }

    private static String getLastName() {
        return "Malva";
    }

    static int[] sortArray(int[] myArray) {
        Arrays.sort(myArray);

        return myArray;
    }
}
