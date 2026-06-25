package com.maths.dsa;

public class MathsProblems {

    // reverse a number
    public static int reverseNumber(int num){
        int sign = num >= 0 ? 1 : -1;
        num = Math.abs(num);
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }
        return reverse * sign;
    }

    public static int countNumber(int num){
        int count = 0;
        while(num != 0){
            count++;
            num = num /10;
        }
        return count;
    }


    public static void main(String[] args) {
        int num = -7834;
        System.out.println("Count the number of digits in a number: ");
        int count = countNumber(num);
        System.out.println("Number of digits: " + count);

        System.out.println("Reverse a number");
        int val = 34545;
        System.out.println(val);
        int ans = reverseNumber(val);
        System.out.println(ans);

    }
}
