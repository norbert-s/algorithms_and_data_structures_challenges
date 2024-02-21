package org.example;

public class BubbleSort {
    public static void main(String[]args){
        int [] tomb = { 4,1,3,2,4,1-2,100,-3,-10,22};
//        bubbleSort(tomb);
        bubbleSortPractice(tomb);
        for(int i : tomb){
            System.out.println(i);
        }

    }
    static void bubbleSortPractice(int []arr){
        for(int j=arr.length-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    //this implementation comes from buchalka bubble sort
    public static void bubbleSort(int[] arr) {
       for(int j=arr.length-1;j>0;j--){
           for(int i=0;i<j;i++){
               if(arr[i]>arr[i+1]){
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] =temp;
               }
           }
       }
    }
}
