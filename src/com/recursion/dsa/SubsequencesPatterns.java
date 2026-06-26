package com.recursion.dsa;

import java.util.ArrayList;

public class SubsequencesPatterns {
     static void printAll(int idx, int[] arr, int n, ArrayList<Integer> list) {

         if(idx == n){
             if(list.isEmpty()){
                 System.out.println("{}");
             }
             else{
                 System.out.print(list);
             }
             System.out.println();
             return;
         }

         //take
         list.add(arr[idx]);
         printAll(idx+1, arr, n, list);
         //not take
         list.removeLast();
         printAll(idx+1, arr, n, list);
    }

    // print all subsequences whose sum is equal to k
    static void printAllSumK(int idx, int[] arr, int n, int sum, int k, ArrayList<Integer> list) {
         if(idx == n) {
             if (sum == k) {
                 System.out.println(list +" : " + sum);
             }
             return;
         }

         list.add(arr[idx]);
         printAllSumK(idx+1, arr, n, sum+arr[idx], k, list);

         list.removeLast();
         printAllSumK(idx+1, arr, n, sum, k, list);
    }

     static boolean printAnySumK(int idx, int[] arr, int n, int sum, int k, ArrayList<Integer> list) {
        if(idx == n){
            if(sum == k){
                System.out.println(list +" -> " + sum);
                return true;
            }
            else return false;
        }

         list.add(arr[idx]);
        if(printAnySumK(idx + 1, arr, n, sum + arr[idx], k, list)){
            return true;
        }
        list.removeLast();
        if(printAnySumK(idx+1, arr, n, sum, k, list)){
            return true;
        }
         return false;
     }


    public static void main(String[] args) {

        System.out.println("Print all subsequences : ");
        int[] arr = {1, 2, 3};
        printAll(0, arr, arr.length, new ArrayList<Integer>());

        System.out.println("Print all subsequences whose sum == k: ");
        int[] arr2 = {1, 2, 6, 9, 3, 5, 10, 8};
        int k = 9;
        printAllSumK(0, arr2, arr2.length, 0,  k, new ArrayList<Integer>());

        System.out.println("Print any subsequences whose sum is k ");
        printAnySumK(0, arr2, arr2.length, 0, k, new ArrayList<Integer>());

        System.out.println("Count the subsequences whose sum is k ");
        int count = countSubsequences(0, arr2, arr2.length, 0, k, new ArrayList<Integer>());
        System.out.println("Count = " + count);


    }

    private static int countSubsequences(int idx, int[] arr, int n, int sum, int k, ArrayList<Integer> list) {
         if(idx == n){
             if(sum == k) return  1;
             else return 0;
         }
         list.add(arr[idx]);
         int left = countSubsequences(idx+1, arr, n, sum + arr[idx], k, list);
         list.removeLast();
         int right = countSubsequences(idx+1, arr, n, sum, k, list);
         return left + right;
    }


}
