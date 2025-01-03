package com.jdhb.Java.introduction.java_stdin_and_stdout_I;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStream.range(0, 3).forEach(value -> {
            System.out.println(scanner.nextInt());
        });
        scanner.close();
    }
}
