package com.sahakian.string;

import java.util.Arrays;

public class FirstNonRepeatedCharacter {
    private static final int ASCII_TABLE_LENGTH = 256;

    public static void main(String[] args) {
        var word = "hello world";
        char c = firstNonRepeatedChar(word);
        System.out.println(c);
    }

    private static char firstNonRepeatedChar(String word) {
        int[] flags = new int[ASCII_TABLE_LENGTH];
        Arrays.fill(flags, -1);

        for (int i = 0, length = word.length(); i < length; i++) {
            int asciiSymbol = word.charAt(i);
            if (flags[asciiSymbol] == -1){
                flags[asciiSymbol] = 0;
            }else {
                return (char) asciiSymbol;
            }
        }
        return '\0';
    }
}
