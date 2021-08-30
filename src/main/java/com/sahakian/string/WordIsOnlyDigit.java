package com.sahakian.string;

import java.util.Arrays;

public class WordIsOnlyDigit {
    public static void main(String[] args) {
        String word = "1234";

        System.out.println(wordContainsOnlyDigits1(word));
        System.out.println(wordContainsOnlyDigits2(word));
    }

    private static boolean wordContainsOnlyDigits1(String word){
        char[] charArray = word.toCharArray();

        for (char c : charArray) {
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    private static boolean wordContainsOnlyDigits2(String word){
        return word
                .chars()
                .allMatch(value -> Character.isDigit((char) value));
    }

    private static boolean wordContainsOnlyDigits3(String word){
        return word.matches("[0-9]+");
    }
}
