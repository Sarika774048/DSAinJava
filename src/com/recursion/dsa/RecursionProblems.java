package com.recursion.dsa;

import java.util.Scanner;

public class RecursionProblems {

    public static boolean checkPalindrome(String word, int l, int r){
        if(l >= r) return true;
        if(word.charAt(l) != word.charAt(r)) return false;
        return checkPalindrome(word, l+1, r-1);
    }


    public static int fibo(int n){
        if(n<= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check whether it is a palindrome or not");
        String word = scanner.nextLine().toLowerCase();
        System.out.println(checkPalindrome(word, 0, word.length() -1));
        System.out.println("Fibonacci number: ");
        System.out.println(fibo(2));
    }
}
