package com.anagramchecker;

import java.util.Arrays;

public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and special characters, and convert to lowercase
        String cleanStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if lengths are different
        if (cleanStr1.length() != cleanStr2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] array1 = cleanStr1.toCharArray();
        char[] array2 = cleanStr2.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        return Arrays.equals(array1, array2);
    }
}
