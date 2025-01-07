package com.jdhb.Java.strings.java_string_reverse;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String reversed = new StringBuilder(A).reverse().toString();

        String result = "No";
        if(reversed.equals(A)){
            result = "Yes";
        }

        System.out.println(result);

        // Reverse the string using String methods.
        String reversed2 = "";
        for(int i = A.length() - 1; i >= 0; i--){
            reversed2 += A.charAt(i);
        }
        System.out.println(reversed2);

        // Reversing string using the array of chars of the string
        char[] aChars = A.toCharArray();
        char[] reversedChar = new char[A.length()];

        for(int i = 0; i <= A.length()/2; i++){
            char temp = aChars[i];
            reversedChar[i] = aChars[A.length() - i - 1];
            reversedChar[A.length() - i - 1] = temp;
        }

        System.out.println(reversedChar);

    }
}