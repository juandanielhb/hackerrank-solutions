package com.jdhb.Java.introduction.java_loops_I;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }

        scan.close();
    }
}