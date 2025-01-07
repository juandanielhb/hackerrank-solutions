package com.jdhb.Java.strings.java_strings_introduction;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        // Sum the lengths of A and B
        System.out.println(A.length() + B.length());
        //Determine if A is lexicographically larger than B
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        //Capitalize the first letter in  and  and print them on a single line, separated by a space.
        System.out.println(capitalizeFirstChar(A).concat(" ").concat(capitalizeFirstChar(B)));

    }

    private static String capitalizeFirstChar(String value){
        if(value.isEmpty()){
            return "";
        }
        return value.substring(0,1).toUpperCase() + value.substring(1);
    }
}
