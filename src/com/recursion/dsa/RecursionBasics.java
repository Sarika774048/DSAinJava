package com.recursion.dsa;

public class RecursionBasics {

    public static void  printNames(String name, int n){
        if(n == 0){
            return;
        }
        System.out.println(name);
        printNames(name, n-1);
    }

    public static void  printNames2(int n){
        if(n == 5){
            return;
        }
        System.out.println("siirr");
        printNames2(n+1);
    }

    public static void print1toN(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        print1toN(i+1, n);
    }

    public static void printNto1(int i, int n){
        if(i < 1){
            return;
        }
        System.out.println(i);
        printNto1(i-1, n);
    }


    // backtracking
    public static void backtrack1toN(int i, int n){
        if(i < 1){
            return;
        }
        backtrack1toN(i-1, n);
        System.out.println(i);
    }

    public static void backtrackNto1(int i, int n){
        if(i > n){
            return;
        }
        backtrackNto1(i+1, n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        System.out.println("Print names for 5 times");
        printNames("sarika",5);
        printNames2(0);

        System.out.println("Print from 1 to N");
        print1toN(1, 5);
        System.out.println("Print form N to 1");
        printNto1(5, 5);
        System.out.println("Backtrack from N to 1 but print from 1 to n");
        backtrack1toN(6, 6);
        System.out.println("Backtrack from 1 to N but print from n to 1");
        backtrackNto1(1, 5);
    }
}
