package com.jdhb.Java.introduction.java_if_else;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/***
 * Given an integer, , perform the following conditional actions:
 *
 * If  is odd, print Weird
 * If  is even and in the inclusive range of 2 to 5, print Not Weird
 * If  is even and in the inclusive range of 6 to 20, print Weird
 * If  is even and greater than , print Not Weird
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String WEIRD = "Weird";
    private static final String NOT_WEIRD = "Not Weird";

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 != 0){
            System.out.println(WEIRD);
        } else {
            if (N >= 6 && N <= 20){
                System.out.println(WEIRD);
            } else {
                System.out.println(NOT_WEIRD);
            }
        }

        scanner.close();
    }
}
