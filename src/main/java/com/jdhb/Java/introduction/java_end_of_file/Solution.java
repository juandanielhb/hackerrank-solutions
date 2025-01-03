package com.jdhb.Java.introduction.java_end_of_file;

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while(scan.hasNext()){
            System.out.printf("%d %s%n", ++i, scan.nextLine());
        }
    }
}