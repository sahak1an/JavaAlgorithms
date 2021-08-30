package com.sahakian.string;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class VowelsCounter {
    public static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        var word = "Hello world";
        SymbolTypeCounter symbolTypeCounter = checkSymbol1(word);
        System.out.println(symbolTypeCounter);
    }


    private static SymbolTypeCounter checkSymbol1(String word) {
        final SymbolTypeCounter symbolTypeCounter = new SymbolTypeCounter();

        for (int i = 0, length = word.length(); i < length; i++) {
            char symbol = word.charAt(i);
            boolean isVowel = false;
            for (char vowel : VOWELS) {
                if (symbol == vowel) {
                    isVowel = true;
                    symbolTypeCounter.vowelCounter.incrementAndGet();
                }
            }
            if (!isVowel) {
                symbolTypeCounter.consonantCounter.incrementAndGet();
            }
        }
        return symbolTypeCounter;
    }
}

final class SymbolTypeCounter {
    public final AtomicInteger vowelCounter = new AtomicInteger(0);
    public final AtomicInteger consonantCounter = new AtomicInteger(0);

    @Override
    public String toString() {
        return "SymbolTypeCounter{" +
                "vowelCounter=" + vowelCounter.get() +
                ", consonantCounter=" + consonantCounter.get() +
                '}';
    }
}