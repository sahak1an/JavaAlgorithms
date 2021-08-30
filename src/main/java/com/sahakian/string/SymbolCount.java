package com.sahakian.string;

public class SymbolCount {
    public static void main(String[] args) {
        String word = "Hello world";
        char symbol = 'l';

        System.out.println(count1(word, symbol));
        System.out.println(count2(word, symbol));
        System.out.println(count3(word, symbol));
    }

    private static int count1(String word,char symbol){
        return (int) word
                .chars()
                .filter(value -> (char) value ==symbol )
                .count();
    }

    private static int count2(String word,char symbol){
        int count = 0;

        for (char c : word.toCharArray()) {
            if (c==symbol){
                count++;
            }
        }
        return count;
    }

    private static int count3(String word,char symbol){
        String replaced = word.replace(""+symbol,"");
        return word.length() - replaced.length();
    }
}
