package com.jdhb.Java.introduction.java_static_initializer_block;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if(B > 0 && H > 0) {
            System.out.println(B*H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}