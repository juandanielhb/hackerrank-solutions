package com.jdhb.Java.strings.java_substring_comparisons;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = s.substring(0, k);
//        String largest = s.substring(0, k);
//
//        for(int i = 0; i <= s.length() - k; i++){
//            String curr = s.substring(i, i + k);
//            if(smallest.compareTo(curr) > 0){
//                smallest = curr;
//            }
//            if(largest.compareTo(curr) < 0){
//                largest = curr;
//            }
//        }

        String smallest = IntStream.rangeClosed(0, s.length() - k)
                .mapToObj(i -> s.substring(i, i + k))
                .min(String::compareTo)
                .orElse("");

        String largest = IntStream.rangeClosed(0, s.length() - k)
                .mapToObj(j -> s.substring(j, j + k))
                .max(String::compareTo)
                .orElse("");

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
