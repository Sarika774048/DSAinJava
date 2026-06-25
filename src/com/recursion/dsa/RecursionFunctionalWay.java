package com.recursion.dsa;

public class RecursionFunctionalWay {

    public static  void sumOfN(int i, int n, int sum){
        if(i> n){
            System.out.println(sum);
            return;
        }
        sumOfN(i+1, n, sum+i);
    }

    public static int sumOfN(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfN(n-1);
    }

    public static void swap(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        // swap numbers
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        swap(arr, l+1, r-1);
    }

    public static void swap(int[] arr, int i){
        if(i >= arr.length -i -1){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length -i-1];
        arr[arr.length -i-1] = temp;

        swap(arr, i+1);
    }


   public static void main(String[] args) {

       System.out.println("Sum of 1st natural numbers: Parameterized way");
       sumOfN(1, 5, 0);

       System.out.println("Sum of 1st natural numbers: Functional way");
       int ans = sumOfN(10);
       System.out.println(ans);

       int[] arr = {2, 3, 4, 9, 10};
       System.out.println("Array before swapping: ");
       for(int n : arr){
           System.out.print(n +" ");
       }
       swap(arr, 0, arr.length-1);
       System.out.println("\nArrays after swapping: ");
       for(int n : arr){
           System.out.print(n +" ");
       }

       System.out.println("\nSwaping number using one parameter: ");
       int[] a = {10, 20, 30, 40, 50, 60};
       swap(a, 0);
       for(int e : a){
           System.out.print(e+" ");
       }
    }
}
