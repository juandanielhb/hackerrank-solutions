package com.jdhb.Java.strings.java_substring;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(text.substring(start, end));

    }
}
