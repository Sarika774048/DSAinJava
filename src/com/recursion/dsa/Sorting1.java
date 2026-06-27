package com.recursion.dsa;

public class Sorting1 {

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i= arr.length -1; i>=1;i--){
            for(int j=1; j<=i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }


    static void main(String[] args) {

        int[] arr = {56, 34, 20, 1, 9, 13, 11};
        selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("Bubble sort");
        int[] arr2 = {-100, 10, 4, 2, 9, 5, 1,-5};
        bubbleSort(arr2);
        for(int e : arr2){
            System.out.print(e+" ");
        }
        System.out.println("Insertion sort: ");
        int[] arr3 = {100, 10, 4, 2, 9, 5, 1,-5};
        insertionSort(arr3);
        for(int e : arr3){
            System.out.print(e+" ");
        }

    }


}
