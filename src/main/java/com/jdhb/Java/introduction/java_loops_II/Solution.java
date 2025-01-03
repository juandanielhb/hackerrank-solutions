package com.jdhb.Java.introduction.java_loops_II;

import java.util.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int i=0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;

            for(int j = 0; j < n; j++){
                int exp = (int) Math.pow(2, j);
                result = result + (exp * b);
                System.out.print(result + " ");
            }
            System.out.println();

        }
        in.close();
    }
}