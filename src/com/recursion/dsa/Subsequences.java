package com.recursion.dsa;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {

    public static void printSub(int idx, int[] arr, int n, List<Integer> list){
        // take and not take
        if(idx == n){
            if(list.isEmpty()){
                System.out.println("{}");
            }else {
                for (Integer ele : list) {
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
            return;
        }
        printSub(idx+1, arr, n, list);

        // take
        list.add(arr[idx]);
        printSub(idx+1, arr, n, list);
        // not take
        list.removeLast();

    }

    public static void printSubK(int idx, int[] arr, int k, int n, List<Integer> list){

        if(idx >= n){
            int sum = 0;
            for(Integer ele : list){
                sum += ele;
            }
            if(sum == k){
                for(Integer ele : list){
                    System.out.print(ele +" ");
                }
                System.out.print(" : "+ sum +"\n");
            }
            return;
        }
        // take
        list.add(arr[idx]);
        printSubK(idx+1, arr, k, n, list);
        list.removeLast();
        printSubK(idx+1, arr, k, n, list);

    }



    static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        printSub(0, arr, n, new ArrayList<>());

        System.out.println("Print subsequences whose sum is equal to k");
        int[] arr2 = {1, 4, 6, 9, 10, 3, 5};
        int k = 9;
        int n1 = arr2.length;
        printSubK(0, arr2, k, n1, new ArrayList<Integer>());

    }
}
