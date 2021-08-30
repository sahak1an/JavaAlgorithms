package com.sahakian.string;

public class PalindromeWord {
    public static void main(String[] args) {
        String word = "abaaba";
        System.out.println(isPalindrome(word));
    }

    private static boolean isPalindrome(String word){
        for (int i = 0,length = word.length(); i <length/2; i++) {
            if (word.charAt(i)!=word.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
