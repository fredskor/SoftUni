package com.company;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String str1 = console.next();
        System.out.print("Enter the second string:");
        String str2 = console.next();
        int output = multiChar(str1, str2);

        System.out.println("Output: " + output);
    }

    public static int multiChar(String str1, String str2) {
        int sumOfChar = 0;
        int characterMultiplier = 0;

        if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                characterMultiplier = str1.charAt(i) * str2.charAt(i);
                sumOfChar += characterMultiplier;
            }
            for (int i = str2.length(); i < str1.length(); i++) {
                sumOfChar += str1.charAt(i);
            }
        } else if (str1.length() < str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                characterMultiplier = str1.charAt(i) * str2.charAt(i);
                sumOfChar += characterMultiplier;
            }
            for (int i = str1.length(); i < str2.length(); i++) {
                sumOfChar += str2.charAt(i);
            }
        } else {
            for (int i = 0; i < str2.length(); i++) {
                characterMultiplier = str1.charAt(i) * str2.charAt(i);
                sumOfChar += characterMultiplier;
            }
        }
        return sumOfChar;
    }
}

