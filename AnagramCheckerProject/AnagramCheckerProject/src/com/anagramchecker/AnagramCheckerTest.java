package com.anagramchecker;

public class AnagramCheckerTest {

    // Method to run all test cases
    public static void runTests() {
        System.out.println("Test Cases for Anagram Checker:");
        
        // Test cases
        System.out.println("1. 'Listen' and 'Silent': " + (AnagramChecker.areAnagrams("Listen", "Silent") ? "Passed" : "Failed"));
        System.out.println("2. 'The Morse Code' and 'Here come dots': " + (AnagramChecker.areAnagrams("The Morse Code", "Here come dots") ? "Passed" : "Failed"));
        System.out.println("3. 'Astronomer' and 'Moon starer': " + (AnagramChecker.areAnagrams("Astronomer", "Moon starer") ? "Passed" : "Failed"));
        
        System.out.println("4. 'Hello' and 'World': " + (!AnagramChecker.areAnagrams("Hello", "World") ? "Passed" : "Failed"));
        System.out.println("5. 'Java' and 'Javac': " + (!AnagramChecker.areAnagrams("Java", "Javac") ? "Passed" : "Failed"));
        System.out.println("6. 'Anagram' and 'Not Anagram': " + (!AnagramChecker.areAnagrams("Anagram", "Not Anagram") ? "Passed" : "Failed"));
        
        System.out.println("7. Empty strings '' and '': " + (AnagramChecker.areAnagrams("", "") ? "Passed" : "Failed"));
        
        System.out.println("8. Single character 'a' and 'a': " + (AnagramChecker.areAnagrams("a", "a") ? "Passed" : "Failed"));
        System.out.println("9. Single character 'a' and 'b': " + (!AnagramChecker.areAnagrams("a", "b") ? "Passed" : "Failed"));
        
        System.out.println("10. 'Dormitory' and 'Dirty room!': " + (AnagramChecker.areAnagrams("Dormitory", "Dirty room!") ? "Passed" : "Failed"));
        System.out.println("11. 'School master' and 'The classroom': " + (AnagramChecker.areAnagrams("School master", "The classroom") ? "Passed" : "Failed"));
    }
}
