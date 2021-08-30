package com.sahakian.string;

public class ReverseWords {
    public static final String WHITE_SPACE = " ";

    public static void main(String[] args) {
        var word = "Hello world";
        String s = reverseWords1(word);
        System.out.println(s);
    }

    private static String reverseWords1(String word){
        String[] words = word.split(WHITE_SPACE);
        StringBuilder result = new StringBuilder();
        for (String s : words) {
            result
                    .append(new StringBuilder(s).reverse())
                    .append(WHITE_SPACE);
        }
        return result.toString();
    }
}


