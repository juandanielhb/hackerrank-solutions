package com.jdhb.Java.strings.java_anagram;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars, bChars);
    }

    static boolean isAnagram2(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> aCharsCount = new HashMap<>();
        Map<Character, Integer> bCharsCount = new HashMap<>();

        for(Character aChar : a.toCharArray()){
            aCharsCount.put(aChar, aCharsCount.getOrDefault(a, 0) + 1);
        }

        for(Character bChar : b.toCharArray()){
            bCharsCount.put(bChar, bCharsCount.getOrDefault(b, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : aCharsCount.entrySet()){
            if(bCharsCount.getOrDefault(entry.getKey(), 0) != entry.getValue()){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

