package com.maths.dsa;

import java.util.LinkedList;

public class Armstrong {

    public static boolean armstrong(int num){
        num = Math.abs(num);
        int dup = num;
        int count = MathsProblems.countNumber(num);
        int val = 0;

        while(num > 0){
            int digit = num %10;
            val = val + (int)Math.pow(digit, count);
            num /= 10;
        }
        System.out.println(val + " " + dup);
        return dup == val;
    }

    // print all divisors
    public static void printDivisors(int num){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i*i < num; i++) {
            if(num % i == 0){
                System.out.println(i);
                list.push(num/i);
            }
        }
        while(list.size() >0){
            System.out.println(list.pop());
        }
    }

    public static int gcd(int n1, int n2){
        while(n1 > 0 && n2 >0){
            if(n1 > n2){
                n1 = n1 % n2;
            }else{
                n2 = n2 % n1;
            }
        }
        return n1 != 0 ? n1 : n2;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong number: ");
        System.out.println(armstrong(-37102));
        System.out.println("Print all divisors: " );
        printDivisors(36);
        System.out.println("GCD of two number");
        System.out.println(gcd(10, 12));
    }
}
